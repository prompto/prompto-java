package presto.javascript;

import presto.utils.CodeWriter;



public class JavaScriptParenthesisExpression implements JavaScriptExpression {

	JavaScriptExpression expression;
	
	public JavaScriptParenthesisExpression(JavaScriptExpression expression) {
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append('(');
		expression.toDialect(writer);
		writer.append(')');
	}
}
