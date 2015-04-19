package presto.csharp;

import presto.grammar.NativeCategoryBinding;
import presto.utils.CodeWriter;

public class CSharpNativeCategoryBinding extends NativeCategoryBinding {

	CSharpIdentifierExpression expression;
	
	public CSharpNativeCategoryBinding(CSharpIdentifierExpression expression) {
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("C#: ");
		expression.toDialect(writer);
	}

}
