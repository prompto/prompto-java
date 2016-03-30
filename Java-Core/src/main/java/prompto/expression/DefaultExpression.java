package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class DefaultExpression implements IExpression {
	
	IExpression expression;
	IValue value; 
	
	public DefaultExpression(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public IType check(Context context) {
		return expression.check(context);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value==null)
			value = expression.interpret(context);
		return value;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
