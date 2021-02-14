package prompto.type;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.DictionaryValue;
import prompto.value.IValue;
import prompto.value.TextValue;

public class DictType extends ContainerType {
	
	public DictType(IType itemType) {
		super(Family.DICTIONARY, itemType, itemType.getTypeName()+"<:>");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return new DictType(itemType);
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				(other instanceof DictType && 
				itemType.isAssignableFrom(context, ((DictType)other).getItemType()));
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoDict.class;
	}
	
	@Override
	public String getTranspiledName(Context context) {
		return this.itemType.getTranspiledName(context) + "_dict";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof DictType))
			return false;
		DictType other = (DictType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof DictType 
			&& this.getItemType().equals(((DictType)other).getItemType()))
			return this;
		else
			return super.checkAdd(context, other, tryReverse, section);
	}
	
	@Override
	public void checkContains(Context context, IType other, ICodeSection section) {
		if(other==TextType.instance())
			return;
		else
			super.checkContains(context, other, section);
	}
	
	@Override
	public IType checkItem(Context context, IType other, ICodeSection section) {
		if(other==TextType.instance())
			return itemType;
		else {
			context.getProblemListener().reportIllegalItemType(section, Collections.singleton(TextType.instance()), other);
			return VoidType.instance();
		}
	}
	
	@Override
	public IType checkIterator(Context context) {
		return new EntryType(itemType);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        switch(name) {
        case "count":
            return IntegerType.instance();
        case "keys":
            return new SetType(TextType.instance());
        case "values":
            return new ListType(getItemType());
        default:
        	return super.checkMember(context, id);
        }
	}
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		if("swap".equals(id.toString()))
			return new HashSet<>(Collections.singletonList(SWAP_METHOD));
		else if("removeKey".equals(id.toString()))
			return new HashSet<>(Collections.singletonList(REMOVE_KEY_METHOD));
		else if("removeValue".equals(id.toString()))
			return new HashSet<>(Collections.singletonList(REMOVE_VALUE_METHOD));
		else
			return super.getMemberMethods(context, id);
	}
	
	@Override
	public void checkContainsAllOrAny(Context context, IType other) {
		// nothing to do
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Dictionary");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	   if(other instanceof DictType && this.getItemType().equals(((DictType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}

	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	   if(other instanceof DictType && this.getItemType().equals(((DictType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "count":
			break;
		case "keys":
	        transpiler.require("StrictSet");
	        break;
		case "values":
	        transpiler.require("List");
	        break;
       default: 
	    	super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "count":
	        transpiler.append("length");
			break;
		case "keys":
		case "values":
			transpiler.append(name);
			break;
		default: 
			super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item, ICodeSection section) {
		transpiler.require("StrictSet");
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".has(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareHasAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    transpiler.require("StrictSet");
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
	public void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
		// nothing to do
	}
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    transpiler.append(".getItem(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileAssignItemValue(Transpiler transpiler, IExpression item, IExpression expression) {
	    transpiler.append(".setItem(");
	    item.transpile(transpiler);
	    transpiler.append(", ");
	    expression.transpile(transpiler);
	    transpiler.append(")");
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return right if left is empty (or left if right is empty)
		// create result (temporarily mutable)
		ResultInfo info = CompilerUtils.compileNewRawInstance(method, PromptoDict.class);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_1);
		CompilerUtils.compileCallConstructor(method, PromptoDict.class, boolean.class);
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoDict.class, "putAll", 
				Map.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		// set immutable
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_0);
		MethodConstant m = new MethodConstant(PromptoDict.class, "setMutable", boolean.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return info;
	}

	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags.withPrimitive(true));
		IOperand oper = new MethodConstant(PromptoDict.class, "get", 
				Object.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDict.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	static final IMethodDeclaration SWAP_METHOD = new BuiltInMethodDeclaration("swap") {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			DictionaryValue dict = (DictionaryValue)getValue(context);
			return dict.swap(context);
		}
		
		@Override
		public IType check(Context context) {
			return new DictType(TextType.instance());
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call replace method
			Descriptor.Method descriptor = new Descriptor.Method(PromptoDict.class);
			MethodConstant constant = new MethodConstant(PromptoDict.class, "swap", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			return new ResultInfo(PromptoDict.class);
		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("swap()");
		}
	};
	
	static IParameter KEY_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("key"));

	static final IMethodDeclaration REMOVE_KEY_METHOD = new BuiltInMethodDeclaration("removeKey", KEY_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			DictionaryValue dict = (DictionaryValue)getValue(context);
			if(!dict.isMutable())
				throw new NotMutableError();
			TextValue key = (TextValue)context.getValue(new Identifier("key"));
			dict.getStorableData().remove(key);
			return null;
		}
		
		@Override
		public IType check(Context context) {
			return VoidType.instance();
		}

		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments);
			// call remove method
			Descriptor.Method descriptor = new Descriptor.Method(Object.class, Object.class);
			InterfaceConstant constant = new InterfaceConstant(Map.class, "remove", descriptor);
			method.addInstruction(Opcode.INVOKEINTERFACE, constant);
			method.addInstruction(Opcode.POP);
			// done
			return new ResultInfo(void.class);
		};
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("removeKey(");
	        arguments.get(0).transpile(transpiler, null);
	        transpiler.append(")");
		}
	};
	
	static IParameter VALUE_ARGUMENT = new CategoryParameter(AnyType.instance(), new Identifier("value"));

	static final IMethodDeclaration REMOVE_VALUE_METHOD = new BuiltInMethodDeclaration("removeValue", VALUE_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			DictionaryValue dict = (DictionaryValue)getValue(context);
			if(!dict.isMutable())
				throw new NotMutableError();
			IValue value = (IValue)context.getValue(new Identifier("value"));
			dict.getStorableData().removeValue(value);
			return null;
		}
		
		@Override
		public IType check(Context context) {
			return VoidType.instance();
		}

		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("removeValue(");
	        arguments.get(0).transpile(transpiler, null);
	        transpiler.append(")");
		}
	};
}
