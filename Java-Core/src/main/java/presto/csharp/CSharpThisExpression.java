package presto.csharp;

import presto.expression.ThisExpression;
import presto.utils.CodeWriter;

public class CSharpThisExpression implements CSharpExpression {
	
	ThisExpression expression = new ThisExpression();
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
