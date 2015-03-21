package presto.javascript;

import presto.utils.CodeWriter;



public class JavaScriptItemExpression extends JavaScriptSelectorExpression {

	JavaScriptExpression item;
	
	public JavaScriptItemExpression(JavaScriptExpression item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return parent.toString() + "[" + item.toString() + "]";
	}

	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append('[');
		item.toDialect(writer);
		writer.append(']');
	}

}
