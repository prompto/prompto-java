package prompto.javascript;

import prompto.expression.ThisExpression;
import prompto.utils.CodeWriter;

public class JavaScriptThisExpression implements JavaScriptExpression {
	
	ThisExpression expression = new ThisExpression();
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
