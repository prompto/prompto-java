package presto.javascript;

import presto.utils.CodeWriter;

public abstract class JavaScriptLiteral implements JavaScriptExpression {

	String text;
	
	protected JavaScriptLiteral(String text) {
		this.text = text;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}

}
