package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ParenthesisExpression implements IExpression {

	IExpression expression;
	
	public ParenthesisExpression(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return "(" + expression.toString() + ")";
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
	public IValue interpret(Context context) throws PromptoError {
		return expression.interpret(context);
	}
}
