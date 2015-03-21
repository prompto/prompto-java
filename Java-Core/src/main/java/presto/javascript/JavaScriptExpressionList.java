package presto.javascript;

import presto.utils.CodeWriter;
import presto.utils.ObjectList;

public class JavaScriptExpressionList extends ObjectList<JavaScriptExpression> {

	private static final long serialVersionUID = 1L;

	public JavaScriptExpressionList() {
	}
	
	public JavaScriptExpressionList(JavaScriptExpression expression) {
		this.add(expression);
	}
	
	public void toDialect(CodeWriter writer) {
		if(this.size()>0) {
			for(JavaScriptExpression exp : this) {
				exp.toDialect(writer);
				writer.append(", ");
			}
			writer.trimLast(2);
		}
	}

}
