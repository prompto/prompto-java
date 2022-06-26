package prompto.type;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoString;
import prompto.literal.IntegerLiteral;
import prompto.literal.TextLiteral;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.StringUtils;
import prompto.value.BooleanValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.ListValue;
import prompto.value.TextValue;


public class TextType extends NativeType {

	static TextType instance = new TextType();
	
	public static TextType instance() {
		return instance;
	}
	
	private TextType() {
		super(Family.TEXT);
	}
	
	@Override
	public Type toJavaType(Context context) {
		return String.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==CharacterType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(tryReverse)
			return this; // we're lhs, ok
		else
			return super.checkAdd(context, other, tryReverse, section);
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof IntegerType)
			return this;
		else
			return super.checkMultiply(context, other, tryReverse, section);
	}
	
	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if(other instanceof TextType || other instanceof CharacterType)
			return;
		else
			super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkItem(Context context, IType other, ICodeSection section) {
		if(other==IntegerType.instance())
			return CharacterType.instance();
		else {
			context.getProblemListener().reportIllegalItemType(section, Collections.singleton(IntegerType.instance()), other);
			return VoidType.instance();
		}
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
       if ("count".equals(name))
            return IntegerType.instance();
       else
    	   return super.checkMember(context, id);
	}

	
	@Override
	public void checkContains(Context context, IType other, ICodeSection section) {
		if(other instanceof TextType || other instanceof CharacterType)
			return;
		else
			super.checkContains(context, other, section);
	}
	
	@Override
	public void checkContainsAllOrAny(Context context, IType other) {
		// nothing to do
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		switch(id.toString()) {
		case "startsWith":
			return new HashSet<>(Collections.singletonList(STARTS_WITH_METHOD));
		case "endsWith":
			return new HashSet<>(Collections.singletonList(ENDS_WITH_METHOD));
		case "toLowerCase":
			return new HashSet<>(Collections.singletonList(TO_LOWERCASE_METHOD));
		case "toUpperCase":
			return new HashSet<>(Collections.singletonList(TO_UPPERCASE_METHOD));
		case "toCapitalized":
			return new HashSet<>(Collections.singletonList(TO_CAPITALIZED_METHOD));
		case "replace":
			return new HashSet<>(Collections.singletonList(REPLACE_METHOD));
		case "replaceAll":
			return new HashSet<>(Collections.singletonList(REPLACE_ALL_METHOD));
		case "split":
			return new HashSet<>(Collections.singletonList(SPLIT_METHOD));
		case "trim":
			return new HashSet<>(Collections.singletonList(TRIM_METHOD));
		case "indexOf":
			return new HashSet<>(Collections.singletonList(INDEX_OF_METHOD));
		default:
			return super.getMemberMethods(context, id);
		}
	}
	
	static IParameter TO_REPLACE_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("toReplace"));
	static IParameter REPLACE_WITH_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("replaceWith"));

	static final IMethodDeclaration REPLACE_METHOD = new BuiltInMethodDeclaration("replace", TO_REPLACE_ARGUMENT, REPLACE_WITH_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String toReplace = (String)context.getValue(new Identifier("toReplace")).getStorableData();
			String replaceWith = (String)context.getValue(new Identifier("replaceWith")).getStorableData();
			String result = StringUtils.replaceOne(value, toReplace, replaceWith);
			return new TextValue(result);
		};
		
		
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, String.class, String.class, String.class);
			MethodConstant constant = new MethodConstant(StringUtils.class, "replaceOne", descriptor);
			method.addInstruction(Opcode.INVOKESTATIC, constant);
			// done
			return new ResultInfo(String.class);

		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("replace(");
	        arguments.find(new Identifier("toReplace")).transpile(transpiler, null);
	        transpiler.append(",");
	        arguments.find(new Identifier("replaceWith")).transpile(transpiler, null);
	        transpiler.append(")");
		}
	};
	
	static final IMethodDeclaration REPLACE_ALL_METHOD = new BuiltInMethodDeclaration("replaceAll", TO_REPLACE_ARGUMENT, REPLACE_WITH_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String toReplace = (String)context.getValue(new Identifier("toReplace")).getStorableData();
			String replaceWith = (String)context.getValue(new Identifier("replaceWith")).getStorableData();
			String result = value.replace(toReplace, replaceWith);
			return new TextValue(result);
		};
		
		
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(CharSequence.class, CharSequence.class, String.class);
			MethodConstant constant = new MethodConstant(String.class, "replace", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			return new ResultInfo(String.class);

		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("replace(new RegExp(");
	        arguments.find(new Identifier("toReplace")).transpile(transpiler, null);
	        transpiler.append(", 'g'),");
	        arguments.find(new Identifier("replaceWith")).transpile(transpiler, null);
	        transpiler.append(")");
		}
	};
	
	
	static IParameter SINGLE_SPACE_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("separator"), new TextLiteral("\" \""));

	static final IMethodDeclaration SPLIT_METHOD = new BuiltInMethodDeclaration("split", SINGLE_SPACE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String sep = (String)context.getValue(new Identifier("separator")).getStorableData();
			String[] parts = value.split(sep);
			PromptoList<TextValue> list = new PromptoList<>(false);
			for(String part : parts) 
				list.add(new TextValue(part));
			return new ListValue(TextType.instance(), list);
		};
		
		
		
		@Override
		public IType check(Context context) {
			return new ListType(TextType.instance());
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call split method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, String[].class);
			MethodConstant constant = new MethodConstant(String.class, "split", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// create PromptoList instance
			method.addInstruction(Opcode.NEW, new ClassConstant(PromptoList.class));
			method.addInstruction(Opcode.DUP_X1);
			method.addInstruction(Opcode.SWAP);
			descriptor = new Descriptor.Method(Object[].class, void.class);
			IOperand oper = new MethodConstant(PromptoList.class, "<init>", descriptor);
			method.addInstruction(Opcode.INVOKESPECIAL, oper);
			// done
			return new ResultInfo(PromptoList.class);

		}
		
		@Override
		public void declareCall(Transpiler transpiler) {
			transpiler.require("List");
		}
		

		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	       transpiler.append("splitToList(");
	        if(arguments!=null)
	            arguments.get(0).transpile(transpiler, null);
	        else
	            transpiler.append("' '"); // default
	        transpiler.append(")");
		}
	};
	
	
	static final IMethodDeclaration TO_CAPITALIZED_METHOD = new BuiltInMethodDeclaration("toCapitalized") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String result = StringUtils.capitalizeAll(value);
			return new TextValue(result);
		};
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call static method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, String.class);
			MethodConstant constant = new MethodConstant(StringUtils.class, "capitalizeAll", descriptor);
			method.addInstruction(Opcode.INVOKESTATIC, constant);
			return new ResultInfo(String.class);

		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	      transpiler.append("replace( /(^|\\s)([a-z])/g , function(m, p1, p2){ return p1 + p2.toUpperCase(); } )");
		}
	};

	static final IMethodDeclaration TO_LOWERCASE_METHOD = new BuiltInMethodDeclaration("toLowerCase") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			TextValue text = (TextValue)getValue(context);
			String lower = text.getStorableData().toLowerCase();
			return new TextValue(lower);
		};
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("toLowerCase()");
		}

	};

	static final IMethodDeclaration TO_UPPERCASE_METHOD = new BuiltInMethodDeclaration("toUpperCase") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			TextValue text = (TextValue)getValue(context);
			String lower = text.getStorableData().toUpperCase();
			return new TextValue(lower);
		};
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("toUpperCase()");
		}

	};
	
	static final IMethodDeclaration TRIM_METHOD = new BuiltInMethodDeclaration("trim") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			TextValue text = (TextValue)getValue(context);
			String trimmed = text.getStorableData().trim();
			return new TextValue(trimmed);
		};
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("trim()");
		}

	};
	
	static IParameter TEXT_VALUE_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("value"));

	static final IMethodDeclaration STARTS_WITH_METHOD = new BuiltInMethodDeclaration("startsWith", TEXT_VALUE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			TextValue text = (TextValue)getValue(context);
			String value = (String)context.getValue(new Identifier("value")).getStorableData();
			boolean startsWith = text.getStorableData().startsWith(value);
			return BooleanValue.valueOf(startsWith);
		};
		
		@Override
		public IType check(Context context) {
			return BooleanType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, boolean.class);
			MethodConstant constant = new MethodConstant(String.class, "startsWith", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		};
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("startsWith(");
	        arguments.get(0).transpile(transpiler, null);
	        transpiler.append(")");
		}
	};

	
	static final IMethodDeclaration ENDS_WITH_METHOD = new BuiltInMethodDeclaration("endsWith", TEXT_VALUE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			TextValue text = (TextValue)getValue(context);
			String value = (String)context.getValue(new Identifier("value")).getStorableData();
			boolean endsWith = text.getStorableData().endsWith(value);
			return BooleanValue.valueOf(endsWith);
		};
		
		@Override
		public IType check(Context context) {
			return BooleanType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, boolean.class);
			MethodConstant constant = new MethodConstant(String.class, "endsWith", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
			transpiler.append("endsWith(");
	        arguments.get(0).transpile(transpiler, null);
	        transpiler.append(")");
		}
		
	};

	static IParameter FROM_INDEX_ARGUMENT = new CategoryParameter(IntegerType.instance(), new Identifier("fromIndex"), new IntegerLiteral("1"));
	
	static final IMethodDeclaration INDEX_OF_METHOD = new BuiltInMethodDeclaration("indexOf", TEXT_VALUE_ARGUMENT, FROM_INDEX_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			TextValue text = (TextValue)getValue(context);
			String value = (String)context.getValue(new Identifier("value")).getStorableData();
			Long fromIndex = (Long)context.getValue(new Identifier("fromIndex")).getStorableData();
			int indexOf = text.getStorableData().indexOf(value, fromIndex.intValue() - 1);
			return new IntegerValue(indexOf + 1);
		};
		
		@Override
		public IType check(Context context) {
			return IntegerType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		@Override
		public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			CompilerUtils.LongTolong(method);
			// call indexOf method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, String.class, long.class, long.class);
			MethodConstant constant = new MethodConstant(PromptoString.class, "indexOf", descriptor);
			method.addInstruction(Opcode.INVOKESTATIC, constant);
			// done
			if(flags.toPrimitive())
				return new ResultInfo(long.class);
			else
				return CompilerUtils.longToLong(method);
		};
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("indexOf1Based(");
	        arguments.get(0).transpile(transpiler, null);
	        if(arguments.size()>1) {
	        	transpiler.append(",");
		        arguments.get(1).transpile(transpiler, null);
		        transpiler.append(")");
	        } else
	        	transpiler.append(",0)");
		}
	};
	
	@Override
	public Comparator<TextValue> getNativeComparator(boolean descending) {
		return descending ? 
				(o1, o2) -> o2.getStorableData().compareTo(o1.getStorableData()) :
				(o1, o2) -> o1.getStorableData().compareTo(o2.getStorableData());
	}

	@Override
	public IValue convertIValueToIValue(Context context, IValue value) {
       if (value instanceof TextValue)
            return value;
        else
            return super.convertIValueToIValue(context, value);
	}
	
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof String)
            return new TextValue((String)value);
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	
	@Override
	public void compileConvertObjectToExact(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoString.class, "convertObjectToExact", Object.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
	}
	
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return new TextValue(value.asText());
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Utils"); // isAText, equals etc...
	}
	

	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("'Text'");
	}

	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
		left.declare(transpiler);
		right.declare(transpiler);
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    // can add anything to text
	    left.transpile(transpiler);
	    transpiler.append(" + ");
	    // fix js precedence issue with negative literals
	    if(other == DecimalType.instance()) {
	    	transpiler.append("(");
	    	right.transpile(transpiler);
	    	transpiler.append(").toDecimalString()");
	    } else
	    	right.transpile(transpiler);
	}
	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if (other == IntegerType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if (other == IntegerType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".repeat(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileMultiply(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
	   if (!"count".equals(name.toString())) {
	        super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		  if ("count".equals(name.toString())) {
	        transpiler.append("length");
	    } else {
	        super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareSlice(Transpiler transpiler, IExpression first, IExpression last) {
	   if(first!=null)
		   first.declare(transpiler);
	    if(last!=null)
	        last.declare(transpiler);
	}
	
	@Override
	public void transpileSlice(Transpiler transpiler, IExpression first, IExpression last) {
	   transpiler.append(".slice1Based(");
	    if(first!=null) {
	        first.transpile(transpiler);
	    } else
	        transpiler.append("null");
	    if(last!=null) {
	        transpiler.append(",");
	        last.transpile(transpiler);
	    }
	    transpiler.append(")");
	}
	
	@Override
	public void declareHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item, ICodeSection section) {
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".includes(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareHasAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.declare(transpiler);
	    items.declare(transpiler);
	}
	
	@Override
	public void transpileHasAllValues(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileHasAnyValue(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAny(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}

	@Override
	public void declareCompare(Transpiler transpiler, IType other) {
		// nothing to do
	}
	
	@Override
	public void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(" ").append(operator.toString()).append(" ");
	    right.transpile(transpiler);
	}
	
	@Override
	public void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
		// nothing to do
	}
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    transpiler.append("[");
	    item.transpile(transpiler);
	    transpiler.append("-1]");
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags.withPrimitive(false));
		// convert right to String
		MethodConstant oper = new MethodConstant(String.class, "valueOf", Object.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		// and call concat
		oper = new MethodConstant(String.class, "concat", 
				String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(String.class);
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags);
		if(Long.class==right.getType())
			CompilerUtils.LongToint(method);
		else if(long.class==right.getType())
			CompilerUtils.longToint(method);
		MethodConstant oper = new MethodConstant(PromptoString.class, 
				"multiply", 
				String.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class);
	}

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(String.class, 
				"compareTo", String.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseType.compileCompareToEpilogue(method, flags);
	}

	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags);
		if(Long.class==right.getType())
			CompilerUtils.LongToint(method);
		else if(long.class==right.getType())
			CompilerUtils.longToint(method);
		MethodConstant oper = new MethodConstant(String.class, 
				"charAt", 
				int.class, char.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.toPrimitive())
			return new ResultInfo(char.class);
		else
			return CompilerUtils.charToCharacter(method);
	}

	public static ResultInfo compileSlice(Context context, MethodInfo method, Flags flags, 
			ResultInfo parent, IExpression first, IExpression last) {
		compileTextSliceFirst(context, method, flags, first);
		compileTextSliceLast(context, method, flags, last);
		MethodConstant m = new MethodConstant(String.class, "substring", 
				int.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return parent;
	}

	public static void compileTextSliceFirst(Context context, MethodInfo method, Flags flags, IExpression first) {
		if(first==null)
			method.addInstruction(Opcode.ICONST_0);
		else {
			ResultInfo finfo = first.compile(context, method, flags.withPrimitive(true));
			finfo = CompilerUtils.numberToint(method, finfo);
			// convert from 1 based to 0 based
			method.addInstruction(Opcode.ICONST_M1);
			method.addInstruction(Opcode.IADD);
		}
	}

	private static void compileTextSliceLast(Context context, MethodInfo method, Flags flags, IExpression last) {
		// always compile last index since we need to manage negative values
		compileSliceMaxIndex(method);
		// stack is now obj, int, int (max)
		if(last!=null) {
			ResultInfo linfo = last.compile(context, method, flags.withPrimitive(true));
			linfo = CompilerUtils.numberToint(method, linfo);
			// stack is now obj, int, int (max), int (last)
			// manage negative index
			method.addInstruction(Opcode.DUP); // push last -> OIIII
			method.addInstruction(Opcode.IFGE, new ShortOperand((short)9)); // consume last -> OIII
			StackState branchState = method.captureStackState();
			method.addInstruction(Opcode.IADD); // add max to negative last -> OII
			method.addInstruction(Opcode.ICONST_1); // -> OIII
			method.addInstruction(Opcode.IADD); // add 1 to last -> OII
			method.addInstruction(Opcode.GOTO, new ShortOperand((short)5));
			method.restoreFullStackState(branchState);
			method.placeLabel(branchState);
			method.addInstruction(Opcode.SWAP); // swap max and last -> OIII
			method.addInstruction(Opcode.POP); // forget max -> OII
			StackState lastState = method.captureStackState();
			method.placeLabel(lastState);			
		}
	}

	public static void compileSliceMaxIndex(MethodInfo method) {
		// stack is obj, int we need obj, int, obj
		method.addInstruction(Opcode.SWAP); // -> int, obj
		method.addInstruction(Opcode.DUP_X1); // obj, int, obj
		MethodConstant m = new MethodConstant(String.class, "length", int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = flags.isRoughly() ?
				new MethodConstant(String.class, "equalsIgnoreCase", String.class, boolean.class) :
				new MethodConstant(String.class, "equals", Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	public static ResultInfo compileContains(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags);
		if(right.getType()!=String.class) {
			MethodConstant m = new MethodConstant(String.class, "valueOf", Object.class, String.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
		}
		MethodConstant m = new MethodConstant(String.class, "contains", CharSequence.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
}
