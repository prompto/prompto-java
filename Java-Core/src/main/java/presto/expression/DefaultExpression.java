package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class DefaultExpression implements IExpression {
	
	IExpression expression;
	IValue value; 
	
	public DefaultExpression(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		return expression.check(context);
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		if(value==null)
			value = expression.interpret(context);
		return value;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
