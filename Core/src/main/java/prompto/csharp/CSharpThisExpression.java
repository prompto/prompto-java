package prompto.csharp;

import prompto.expression.ThisExpression;
import prompto.utils.CodeWriter;

public class CSharpThisExpression implements CSharpExpression {
	
	ThisExpression expression = new ThisExpression();
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
