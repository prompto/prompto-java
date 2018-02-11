package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import prompto.argument.CategoryArgument;
import prompto.argument.IArgument;
import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoString;
import prompto.literal.TextLiteral;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.utils.StringUtils;
import prompto.value.Boolean;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.Text;

import com.fasterxml.jackson.databind.JsonNode;


public class TextType extends NativeType {

	static TextType instance = new TextType();
	
	public static TextType instance() {
		return instance;
	}
	
	private TextType() {
		super(Family.TEXT);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return String.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==CharacterType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(tryReverse)
			return this; // we're lhs, ok
		else
			return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if(other instanceof TextType || other instanceof CharacterType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return CharacterType.instance();
		else
			return super.checkItem(context,other);
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
	public IType checkContains(Context context, IType other) {
		if(other instanceof TextType || other instanceof CharacterType)
			return BooleanType.instance();
		return super.checkContains(context, other);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public Collection<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		switch(id.toString()) {
		case "startsWith":
			return Collections.singletonList(STARTS_WITH_METHOD);
		case "endsWith":
			return Collections.singletonList(ENDS_WITH_METHOD);
		case "toLowerCase":
			return Collections.singletonList(TO_LOWERCASE_METHOD);
		case "toUpperCase":
			return Collections.singletonList(TO_UPPERCASE_METHOD);
		case "toCapitalized":
			return Collections.singletonList(TO_CAPITALIZED_METHOD);
		case "replace":
			return Collections.singletonList(REPLACE_METHOD);
		case "replaceAll":
			return Collections.singletonList(REPLACE_ALL_METHOD);
		case "split":
			return Collections.singletonList(SPLIT_METHOD);
		case "trim":
			return Collections.singletonList(TRIM_METHOD);
		default:
			return super.getMemberMethods(context, id);
		}
	}
	
	static IArgument TO_REPLACE_ARGUMENT = new CategoryArgument(TextType.instance(), new Identifier("toReplace"));
	static IArgument REPLACE_WITH_ARGUMENT = new CategoryArgument(TextType.instance(), new Identifier("replaceWith"));

	static final IMethodDeclaration REPLACE_METHOD = new BuiltInMethodDeclaration("replace", TO_REPLACE_ARGUMENT, REPLACE_WITH_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String toReplace = (String)context.getValue(new Identifier("toReplace")).getStorableData();
			String replaceWith = (String)context.getValue(new Identifier("replaceWith")).getStorableData();
			String result = StringUtils.replaceOne(value, toReplace, replaceWith);
			return new Text(result);
		};
		
		
		
		@Override
		public IType check(Context context, boolean isStart) {
			return TextType.instance();
		}

		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentAssignmentList assignments) {
			// push arguments on the stack
			this.compileAssignments(context, method, flags, assignments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, String.class, String.class, String.class);
			MethodConstant constant = new MethodConstant(StringUtils.class, "replaceOne", descriptor);
			method.addInstruction(Opcode.INVOKESTATIC, constant);
			// done
			return new ResultInfo(String.class);

		};
	};
	
	static final IMethodDeclaration REPLACE_ALL_METHOD = new BuiltInMethodDeclaration("replaceAll", TO_REPLACE_ARGUMENT, REPLACE_WITH_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String toReplace = (String)context.getValue(new Identifier("toReplace")).getStorableData();
			String replaceWith = (String)context.getValue(new Identifier("replaceWith")).getStorableData();
			String result = value.replace(toReplace, replaceWith);
			return new Text(result);
		};
		
		
		
		@Override
		public IType check(Context context, boolean isStart) {
			return TextType.instance();
		}

		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentAssignmentList assignments) {
			// push arguments on the stack
			this.compileAssignments(context, method, flags, assignments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(CharSequence.class, CharSequence.class, String.class);
			MethodConstant constant = new MethodConstant(String.class, "replace", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			return new ResultInfo(String.class);

		};
	};
	
	
	static IArgument SINGLE_SPACE_ARGUMENT = new CategoryArgument(TextType.instance(), new Identifier("separator"), new TextLiteral("\" \""));

	static final IMethodDeclaration SPLIT_METHOD = new BuiltInMethodDeclaration("split", SINGLE_SPACE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String sep = (String)context.getValue(new Identifier("separator")).getStorableData();
			String[] parts = value.split(sep);
			PromptoList<Text> list = new PromptoList<>(false);
			for(String part : parts) 
				list.add(new Text(part));
			return new ListValue(TextType.instance(), list);
		};
		
		
		
		@Override
		public IType check(Context context, boolean isStart) {
			return new ListType(TextType.instance());
		}

		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentAssignmentList assignments) {
			// push arguments on the stack
			this.compileAssignments(context, method, flags, assignments);
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

		};
	};
	
	
	static final IMethodDeclaration TO_CAPITALIZED_METHOD = new BuiltInMethodDeclaration("toCapitalized") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			String value = (String)getValue(context).getStorableData();
			String result = StringUtils.capitalizeAll(value);
			return new Text(result);
		};
		
		@Override
		public IType check(Context context, boolean isStart) {
			return TextType.instance();
		}

		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentAssignmentList assignments) {
			// push arguments on the stack
			this.compileAssignments(context, method, flags, assignments);
			// call static method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, String.class);
			MethodConstant constant = new MethodConstant(StringUtils.class, "capitalizeAll", descriptor);
			method.addInstruction(Opcode.INVOKESTATIC, constant);
			return new ResultInfo(String.class);

		};
	};

	static final IMethodDeclaration TO_LOWERCASE_METHOD = new BuiltInMethodDeclaration("toLowerCase") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			Text text = (Text)getValue(context);
			String lower = text.getStorableData().toLowerCase();
			return new Text(lower);
		};
		
		@Override
		public IType check(Context context, boolean isStart) {
			return TextType.instance();
		}

	};

	static final IMethodDeclaration TO_UPPERCASE_METHOD = new BuiltInMethodDeclaration("toUpperCase") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			Text text = (Text)getValue(context);
			String lower = text.getStorableData().toUpperCase();
			return new Text(lower);
		};
		
		@Override
		public IType check(Context context, boolean isStart) {
			return TextType.instance();
		}

	};
	
	static final IMethodDeclaration TRIM_METHOD = new BuiltInMethodDeclaration("trim") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			Text text = (Text)getValue(context);
			String trimmed = text.getStorableData().trim();
			return new Text(trimmed);
		};
		
		@Override
		public IType check(Context context, boolean isStart) {
			return TextType.instance();
		}

	};
	
	static IArgument TEXT_VALUE_ARGUMENT = new CategoryArgument(TextType.instance(), new Identifier("value"));

	static final IMethodDeclaration STARTS_WITH_METHOD = new BuiltInMethodDeclaration("startsWith", TEXT_VALUE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			Text text = (Text)getValue(context);
			String value = (String)context.getValue(new Identifier("value")).getStorableData();
			boolean startsWith = text.getStorableData().startsWith(value);
			return Boolean.valueOf(startsWith);
		};
		
		@Override
		public IType check(Context context, boolean isStart) {
			return BooleanType.instance();
		}

		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentAssignmentList assignments) {
			// push arguments on the stack
			this.compileAssignments(context, method, flags, assignments);
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
	};

	
	static final IMethodDeclaration ENDS_WITH_METHOD = new BuiltInMethodDeclaration("endsWith", TEXT_VALUE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			Text text = (Text)getValue(context);
			String value = (String)context.getValue(new Identifier("value")).getStorableData();
			boolean endsWith = text.getStorableData().endsWith(value);
			return Boolean.valueOf(endsWith);
		};
		
		@Override
		public IType check(Context context, boolean isStart) {
			return BooleanType.instance();
		}

		public boolean hasCompileExactInstanceMember() {
			return true;
		};
		
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, prompto.grammar.ArgumentAssignmentList assignments) {
			// push arguments on the stack
			this.compileAssignments(context, method, flags, assignments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(String.class, boolean.class);
			MethodConstant constant = new MethodConstant(String.class, "endsWith", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		};
	};

	@Override
	public Comparator<Text> getComparator(boolean descending) {
		return descending ? 
				new Comparator<Text>() {
					@Override
					public int compare(Text o1, Text o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<Text>() {
					@Override
					public int compare(Text o1, Text o2) {
						return o1.getStorableData().compareTo(o2.getStorableData());
					}
				};
	}

	@Override
	public IValue convertIValueToIValue(Context context, IValue value) {
       if (value instanceof Text)
            return value;
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof String)
            return new Text((String)value);
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
		return new Text(value.asText());
	}
}
