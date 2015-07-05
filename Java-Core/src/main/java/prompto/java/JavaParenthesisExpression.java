package prompto.java;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;



public class JavaParenthesisExpression implements JavaExpression {

	JavaExpression expression;
	
	public JavaParenthesisExpression(JavaExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append('(');
		expression.toDialect(writer);
		writer.append(')');
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression.check(context);
	}
	
	@Override
	public Object interpret(Context context) throws PromptoError {
		return expression.interpret(context);
	}

}
