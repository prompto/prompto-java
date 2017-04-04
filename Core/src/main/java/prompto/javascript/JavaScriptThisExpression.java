package prompto.javascript;

import prompto.utils.CodeWriter;

public class JavaScriptThisExpression implements JavaScriptExpression {
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("this");
	}
}
