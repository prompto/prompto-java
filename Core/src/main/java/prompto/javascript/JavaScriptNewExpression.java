package prompto.javascript;

import prompto.utils.CodeWriter;

public class JavaScriptNewExpression implements JavaScriptExpression {

	JavaScriptMethodExpression method;
	
	public JavaScriptNewExpression(JavaScriptMethodExpression method) {
		this.method = method;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("new ");
		method.toDialect(writer);
	}
}
