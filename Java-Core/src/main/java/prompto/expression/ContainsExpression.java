package prompto.expression;

import java.util.Collection;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ContOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoString;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IContainer;
import prompto.value.IValue;

public class ContainsExpression implements IExpression, IAssertion {

	IExpression left;
	ContOp operator;
	IExpression right;
		
	public ContainsExpression(IExpression left, ContOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" ");
		writer.append(operator.toString());
		writer.append(" ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		IType lt = left.check(context);
		IType rt = right.check(context);
		switch(operator) {
		case IN:
		case NOT_IN:
			return rt.checkContains(context,lt);
		case CONTAINS:
		case NOT_CONTAINS:
			return lt.checkContains(context, rt);
		default:
			return lt.checkContainsAllOrAny(context, rt);
		}
	}
	
	@Override
    public IValue interpret(Context context) throws PromptoError {
    	IValue lval = left.interpret(context);
    	IValue rval = right.interpret(context);
    	return interpret(context, lval, rval);

    }
    
    @Override
    public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
    	ResultInfo result = compileOperator(context, method, flags.withPrimitive(true));
    	if (operator.name().startsWith("NOT_"))
    		return compileNot(context, method, flags, result);
    	else if((!flags.toPrimitive() && boolean.class==result.getType()))
    		return CompilerUtils.booleanToBoolean(method);
    	else
    		return result;
    }
    
    private ResultInfo compileNot(Context context, MethodInfo method, Flags flags, ResultInfo info) {
		if(Boolean.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	private ResultInfo compileOperator(Context context, MethodInfo method, Flags flags) {
    	switch (operator) {
            case IN:
            case NOT_IN:
            	return compileContains(context, method, flags, right, left);
            case CONTAINS:
            case NOT_CONTAINS:
            	return compileContains(context, method, flags, left, right);
            case CONTAINS_ALL:
            case NOT_CONTAINS_ALL:
            	return compileContainsAll(context, method, flags, left, right);
            case CONTAINS_ANY:
            case NOT_CONTAINS_ANY:
            	return compileContainsAny(context, method, flags, left, right);
            default:
        		throw new UnsupportedOperationException("Uknown operator: " + operator.name());
        }
    }

	private ResultInfo compileContains(Context context, MethodInfo method, Flags flags, IExpression left, IExpression right) {
		ResultInfo linfo = left.compile(context, method, flags);
		right.compile(context, method, flags.withPrimitive(false));
		if(String.class==linfo.getType()) {
			MethodConstant m = new MethodConstant(PromptoString.class, "contains", String.class, Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		} else {
			MethodConstant m = new MethodConstant(linfo.getType(), "contains", Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		}
	}

	private ResultInfo compileContainsAll(Context context, MethodInfo method, Flags flags, IExpression left, IExpression right) {
		ResultInfo linfo = left.compile(context, method, flags);
		right.compile(context, method, flags.withPrimitive(false));
		if(String.class==linfo.getType()) {
			MethodConstant m = new MethodConstant(PromptoString.class, "containsAll", String.class, Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		} else {
			MethodConstant m = new MethodConstant(linfo.getType(), "containsAll", Collection.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		}
	}

	private ResultInfo compileContainsAny(Context context, MethodInfo method, Flags flags, IExpression left, IExpression right) {
		ResultInfo linfo = left.compile(context, method, flags);
		right.compile(context, method, flags.withPrimitive(false));
		if(String.class==linfo.getType()) {
			MethodConstant m = new MethodConstant(PromptoString.class, "containsAny", String.class, Object.class, boolean.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		} else {
			MethodConstant m = new MethodConstant(linfo.getType(), "containsAny", Collection.class, boolean.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			if(flags.toPrimitive())
				return new ResultInfo(boolean.class);
			else
				return CompilerUtils.booleanToBoolean(method);
		}
	}

	private IValue interpret(Context context, IValue lval, IValue rval) throws PromptoError {
        java.lang.Boolean result = null;
        switch (operator)
        {
            case IN:
            case NOT_IN:
                if(rval instanceof IContainer)
                    result = ((IContainer<?>)rval).hasItem(context, lval);
                break;
            case CONTAINS:
            case NOT_CONTAINS:
                if(lval instanceof IContainer)
                    result = ((IContainer<?>)lval).hasItem(context, rval);
                break;
            case CONTAINS_ALL:
            case NOT_CONTAINS_ALL:
                if (lval instanceof IContainer && rval instanceof IContainer)
                    result = containsAll(context, (IContainer<?>)lval, (IContainer<?>)rval);
                break;
            case CONTAINS_ANY:
            case NOT_CONTAINS_ANY:
                if (lval instanceof IContainer && rval instanceof IContainer)
                    result = containsAny(context, (IContainer<?>)lval, (IContainer<?>)rval);
                break;
        }
        if (result != null)
        {
            if (operator.name().startsWith("NOT_"))
                result = !result;
            return Boolean.valueOf(result);
        }
        if (operator.name().endsWith("IN"))
        {
            IValue tmp = lval;
            lval = rval;
            rval = tmp;
        }
        String lowerName = operator.name().toLowerCase().replace('_', ' ');
        throw new SyntaxError("Illegal comparison: " + lval.getClass().getSimpleName() +
        		" " + lowerName + " " + rval.getClass().getSimpleName());	
    }

	public boolean containsAll(Context context, IContainer<?> container, IContainer<?> items) throws PromptoError
    {
        for (IValue item : items.getIterable(context)) {
            if (!container.hasItem(context, item))
                 return false;
        }
        return true;
    }
    public boolean containsAny(Context context, IContainer<?> container, IContainer<?> items) throws PromptoError
    {
        for (IValue item : items.getIterable(context)) {
           if (container.hasItem(context, item))
                    return true;
        }
        return false;
    }
    
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = interpret(context, lval, rval);
		if(result==Boolean.TRUE) 
			return true;
		String expected = buildExpectedMessage(context, test);
		String actual = lval.toString() + " " + operator.toString() + " " + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}
	
	private String buildExpectedMessage(Context context, TestMethodDeclaration test) {
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		return writer.toString();
	}

	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		context = context.newChildContext();
		StackState finalState = method.captureStackState();
		// compile left and store in local
		IType leftType = this.left.check(context);
		ResultInfo leftInfo = this.left.compile(context, method, flags.withPrimitive(false));
		String leftName = method.nextTransientName("left");
		StackLocal left = method.registerLocal(leftName, VerifierType.ITEM_Object, new ClassConstant(leftInfo.getType()));
		CompilerUtils.compileASTORE(method, left);
		// compile right and store in local
		IType rightType = this.right.check(context);
		ResultInfo rightInfo = this.right.compile(context, method, flags.withPrimitive(true));
		String rightName = method.nextTransientName("right");
		StackLocal right = method.registerLocal(rightName, VerifierType.ITEM_Object, new ClassConstant(rightInfo.getType()));
		CompilerUtils.compileASTORE(method, right);
		// call regular compile
		IExpression newLeft = new InstanceExpression(new Identifier(leftName));
		context.registerValue(new Variable(new Identifier(leftName), leftType));
		IExpression newRight = new InstanceExpression(new Identifier(rightName));
		context.registerValue(new Variable(new Identifier(rightName), rightType));
		ContainsExpression newExp = new ContainsExpression(newLeft, this.operator, newRight);
		ResultInfo info = newExp.compile(context, method, flags.withPrimitive(true));
		if(Boolean.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		// 1 = success
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.IFNE, finalListener); 
		// increment failure counter
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.IADD);
		// build failure message
		String message = buildExpectedMessage(context, test);
		message = test.buildFailureMessagePrefix(message);
		method.addInstruction(Opcode.LDC, new StringConstant(message));
		CompilerUtils.compileALOAD(method, left);
		MethodConstant toString = new MethodConstant(leftInfo.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, toString);
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		method.addInstruction(Opcode.LDC, new StringConstant(" " + operator.toString() + " "));
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		CompilerUtils.compileALOAD(method, right);
		toString = new MethodConstant(rightInfo.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, toString);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		test.compileFailure(context, method, flags);
		// success/final
		method.unregisterLocal(right);
		method.unregisterLocal(left);
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		method.inhibitOffsetListener(finalListener);
	}

}
