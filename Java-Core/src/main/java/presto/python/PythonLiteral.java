package presto.python;

import presto.utils.CodeWriter;

public abstract class PythonLiteral implements PythonExpression {
	
	String text;
	
	protected PythonLiteral(String text) {
		this.text = text;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}
}
