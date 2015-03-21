package presto.csharp;

import presto.grammar.NativeCategoryMapping;
import presto.utils.CodeWriter;

public class CSharpNativeCategoryMapping extends NativeCategoryMapping {

	CSharpIdentifierExpression expression;
	
	public CSharpNativeCategoryMapping(CSharpIdentifierExpression expression) {
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("C#: ");
		expression.toDialect(writer);
	}

}
