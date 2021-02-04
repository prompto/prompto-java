package prompto.java;

import prompto.parser.CodeSection;
import prompto.utils.CodeWriter;

public abstract class JavaLiteral extends CodeSection implements JavaExpression {
	
	String text;
	
	protected JavaLiteral(String text) {
		this.text = text;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}
}
