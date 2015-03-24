package presto.expression;

import presto.declaration.TestMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.ContOp;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.ICollection;
import presto.value.IValue;

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
	
    public IValue interpret(Context context) throws PrestoError
    {
    	IValue lval = left.interpret(context);
    	IValue rval = right.interpret(context);
    	return interpret(context, lval, rval);

    }

    private IValue interpret(Context context, IValue lval, IValue rval) throws PrestoError {
        java.lang.Boolean result = null;
        switch (operator)
        {
            case IN:
            case NOT_IN:
                if(rval instanceof ICollection)
                    result = ((ICollection<?>)rval).hasItem(context, lval);
                break;
            case CONTAINS:
            case NOT_CONTAINS:
                if(lval instanceof ICollection)
                    result = ((ICollection<?>)lval).hasItem(context, rval);
                break;
            case CONTAINS_ALL:
            case NOT_CONTAINS_ALL:
                if (lval instanceof ICollection && rval instanceof ICollection)
                    result = containsAll(context, (ICollection<?>)lval, (ICollection<?>)rval);
                break;
            case CONTAINS_ANY:
            case NOT_CONTAINS_ANY:
                if (lval instanceof ICollection && rval instanceof ICollection)
                    result = containsAny(context, (ICollection<?>)lval, (ICollection<?>)rval);
                break;
        }
        if (result != null)
        {
            if (operator.name().startsWith("NOT_"))
                result = !result;
            return Boolean.ValueOf(result);
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

	public boolean containsAll(Context context, ICollection<?> container, ICollection<?> items) throws PrestoError
    {
        for (IValue item : items.getItems(context))
        {
            if (!container.hasItem(context, item))
                 return false;
        }
        return true;
    }
    public boolean containsAny(Context context, ICollection<?> container, ICollection<?> items) throws PrestoError
    {
        for (IValue item : items.getItems(context))
        {
           if (container.hasItem(context, item))
                    return true;
        }
        return false;
    }
    
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PrestoError {
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
