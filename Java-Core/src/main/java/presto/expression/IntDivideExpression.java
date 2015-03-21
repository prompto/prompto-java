package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class IntDivideExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public IntDivideExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" \\ ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkIntDivide(context,rt);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.IntDivide(context, rval);
	}
}
