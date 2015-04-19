package presto.java;

import presto.grammar.NativeCategoryBinding;
import presto.utils.CodeWriter;

public class JavaNativeCategoryBinding extends NativeCategoryBinding {

	JavaIdentifierExpression expression;
	
	public JavaNativeCategoryBinding(JavaIdentifierExpression expression) {
		this.expression = expression;
	}

	public JavaIdentifierExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Java: ");
		expression.toDialect(writer);
	}
}
