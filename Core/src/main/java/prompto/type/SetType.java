package prompto.type;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.SetValue;


public class SetType extends ContainerType {

	public SetType(IType itemType) {
		super(Family.SET, itemType, itemType.getTypeName()+"<>");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return new SetType(itemType);
	}
	
	
	@Override
	public Type getJavaType(Context context) {
		return PromptoSet.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
			(other instanceof SetType && 
			((SetType)other).getItemType().isAssignableFrom(context, itemType));
	}

	@Override
	public IType checkIterator(Context context) {
		return itemType;
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
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(	(other instanceof ListType || other instanceof SetType) && this.getItemType().isAssignableFrom(context, ((ContainerType)other).getItemType()) )
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	
	@Override
	public IType checkSubstract(Context context, IType other) {
		if(	(other instanceof ListType || other instanceof SetType) &&
				this.getItemType().equals(((ContainerType)other).getItemType()) )
					return this;
		return super.checkSubstract(context, other);
	}

	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}

	@Override
	public void checkContainsAllOrAny(Context context, IType other) {
		// nothing to do
	}
	
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		switch(id.toString()) {
		case "join":
			return new HashSet<>(Collections.singletonList(JOIN_METHOD));
		default:
			return super.getMemberMethods(context, id);
		}
	}

	@Override
	public String getTranspiledName(Context context) {
		return itemType.getTranspiledName(context) + "_set";
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("List");
		transpiler.register("StrictSet");
		itemType.declare(transpiler);
	}
	

	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("StrictSet");
	}

	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof SetType || other instanceof ListType) && this.getItemType().isAssignableFrom(transpiler.getContext(), ((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if((other instanceof SetType || other instanceof ListType) && this.getItemType().isAssignableFrom(transpiler.getContext(), ((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".addAll(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }	
    }
	
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareSubtract(transpiler, other, left, right);
	    }
	}
	
	
	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if((other instanceof ListType || other instanceof SetType) && this.getItemType().equals(((ContainerType)other).getItemType())) {
	        left.transpile(transpiler);
	        transpiler.append(".remove(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileSubtract(transpiler, other, left, right);
	    }
	}

	@Override
	public void declareContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileContains(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".has(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareContainsAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    transpiler.require("StrictSet");
	    container.declare(transpiler);
	    items.declare(transpiler);
	}
	
	@Override
	public void transpileContainsAll(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileContainsAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
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
	    transpiler.append(".item(");
	    item.transpile(transpiler);
	    transpiler.append("-1)");
	}
	
	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		right = CompilerUtils.numberToint(method, right);
		// minus 1
		method.addInstruction(Opcode.ICONST_M1);
		method.addInstruction(Opcode.IADD);
		// create result
		IOperand oper = new MethodConstant(PromptoSet.class, "get", 
				int.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoSet.class, 
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

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return left if right is empty (or right if left is empty and is a set)
		// create result
		ResultInfo info = CompilerUtils.compileNewInstance(method, PromptoSet.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoSet.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoSet.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return left if right is empty (or right if left is empty and is a set)
		// create result
		ResultInfo info = CompilerUtils.compileNewInstance(method, PromptoSet.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoSet.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoSet.class, "removeAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}

	static final IMethodDeclaration JOIN_METHOD = new JoinMethod() {
		
		@Override
		protected Collection<IValue> getItems(Context context) {
			SetValue set = (SetValue)getValue(context);
			return set.getItems();
		}

	};

}
