package prompto.expression;

import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ContOp;
import prompto.runtime.Context;
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
	public IType check(Context context) throws SyntaxError {
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
	
    public IValue interpret(Context context) throws PromptoError
    {
    	IValue lval = left.interpret(context);
    	IValue rval = right.interpret(context);
    	return interpret(context, lval, rval);

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
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		String expected = writer.toString();
		String actual = lval.toString() + " " + operator.toString() + " " + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}

}
