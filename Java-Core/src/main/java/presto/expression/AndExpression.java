package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.BooleanType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.IValue;

public class AndExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public AndExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		switch(writer.getDialect()) {
		case E:
		case P:
			writer.append(" and ");
			break;
		case O:
			writer.append(" && ");
			break;
		}
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		if(!(lt instanceof BooleanType) || !(rt instanceof BooleanType))
			throw new SyntaxError("Cannot combine " + lt.getName() + " and " + rt.getName());
		return BooleanType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		Object lval = left.interpret(context);
		Object rval = right.interpret(context);
		if(lval instanceof Boolean) {
			if(rval instanceof Boolean)
				return Boolean.ValueOf(((Boolean)lval).getValue() && ((Boolean)rval).getValue());
			else
				throw new SyntaxError("Illegal: Boolean and " + rval.getClass().getSimpleName());
		} else
			throw new SyntaxError("Illegal: " + lval.getClass().getSimpleName() + " + " + rval.getClass().getSimpleName());
	}

}
