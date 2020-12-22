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
import prompto.intrinsic.PromptoTuple;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.TupleValue;

public class TupleType extends ContainerType {

	static TupleType instance = new TupleType();
	
	public static TupleType instance() {
		return instance;
	}
	
	private TupleType() {
		super(Family.TUPLE, AnyType.instance(), "any");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return this;
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoTuple.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other instanceof ListType ||
				other instanceof SetType;
	}

	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return AnyType.instance();
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
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof TupleType || other instanceof ListType || other instanceof SetType)
			return this; 
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public void checkContains(Context context, IType other) {
		// nothing to do
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
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if(other == TupleType.instance() || other instanceof ListType || other instanceof SetType) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == TupleType.instance() || other instanceof ListType || other instanceof SetType) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
	    if(itemType==IntegerType.instance) {
	        item.declare(transpiler);
	    } else {
	        super.declareItem(transpiler, itemType, item);
	    }
	}
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    if(itemType==IntegerType.instance()) {
	        transpiler.append("[");
	        item.transpile(transpiler);
	        transpiler.append("-1]");
	    } else {
	        super.transpileItem(transpiler, itemType, item);
	    }	
    }
	
	@Override
	public void transpileAssignItemValue(Transpiler transpiler, IExpression item, IExpression expression) {
	    transpiler.append(".setItem(");
	    item.transpile(transpiler);
	    transpiler.append(", ");
	    expression.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
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
	
	public static ResultInfo compileSlice(Context context, MethodInfo method, Flags flags, 
			ResultInfo parent, IExpression first, IExpression last) {
		ContainerType.compileSliceFirst(context, method, flags, first);
		ContainerType.compileSliceLast(context, method, flags, last);
		MethodConstant m = new MethodConstant(PromptoTuple.class, "slice", 
				long.class, long.class, PromptoTuple.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return parent;
	}

	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		right = CompilerUtils.numberToint(method, right);
		// minus 1
		method.addInstruction(Opcode.ICONST_M1);
		method.addInstruction(Opcode.IADD);
		// create result
		IOperand oper = new MethodConstant(PromptoTuple.class, "get", 
				int.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class);
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		// TODO: return left if right is empty (or right if left is empty and is a list)
		// create result
		ResultInfo info = CompilerUtils.compileNewRawInstance(method, PromptoTuple.class);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.ICONST_0); // not mutable
		CompilerUtils.compileCallConstructor(method, PromptoTuple.class, boolean.class);
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoTuple.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoTuple.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}

	static final IMethodDeclaration JOIN_METHOD = new JoinMethod() {
		
		@Override
		protected Collection<IValue> getItems(Context context) {
			TupleValue tuple = (TupleValue)getValue(context);
			return tuple.getItems();
		}

	};

	
}
