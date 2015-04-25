package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class AddExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public AddExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left.toString() + " + " + right.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" + ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkAdd(context, rt, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue lval = interpret(context, left);
		IValue rval = interpret(context, right);
        return lval.Add(context, rval);
 	}

	private IValue interpret(Context context, IExpression exp) throws PrestoError {
		IValue value = exp.interpret(context);
		// need a fully evaluated value (could be contextual)
		while(value instanceof IExpression)
			value = ((IExpression)value).interpret(context);
		return value;
	}
	

}
