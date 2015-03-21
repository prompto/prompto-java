package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class ParenthesisExpression implements IExpression {

	IExpression expression;
	
	public ParenthesisExpression(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("(");
		expression.toDialect(writer);
		writer.append(")");
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return expression.interpret(context);
	}
}
