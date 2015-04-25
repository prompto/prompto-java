package presto.javascript;

import presto.expression.ThisExpression;
import presto.utils.CodeWriter;

public class JavaScriptThisExpression implements JavaScriptExpression {
	
	ThisExpression expression = new ThisExpression();
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
