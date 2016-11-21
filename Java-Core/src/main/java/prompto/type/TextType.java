package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import prompto.argument.CategoryArgument;
import prompto.argument.IArgument;
import prompto.compiler.ClassConstant;
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
import prompto.utils.CodeWriter;
import prompto.utils.StringUtils;
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
		case "toLowerCase":
			return Collections.singletonList(TO_LOWERCASE_METHOD);
		case "toUpperCase":
			return Collections.singletonList(TO_UPPERCASE_METHOD);
		case "toCapitalized":
			return Collections.singletonList(TO_CAPITALIZED_METHOD);
		case "split":
			return Collections.singletonList(SPLIT_METHOD);
		default:
			return super.getMemberMethods(context, id);
		}
	}
	
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
		public IType check(Context context) {
			return new ListType(TextType.instance());
		}

		@Override
		public void toDialect(CodeWriter writer) {
			throw new UnsupportedOperationException();
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
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public void toDialect(CodeWriter writer) {
			throw new UnsupportedOperationException();
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
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public void toDialect(CodeWriter writer) {
			throw new UnsupportedOperationException();
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
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public void toDialect(CodeWriter writer) {
			throw new UnsupportedOperationException();
		}
		
		
		
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
