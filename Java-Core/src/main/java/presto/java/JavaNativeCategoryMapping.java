package presto.java;

import presto.grammar.NativeCategoryMapping;
import presto.utils.CodeWriter;

public class JavaNativeCategoryMapping extends NativeCategoryMapping {

	JavaIdentifierExpression expression;
	
	public JavaNativeCategoryMapping(JavaIdentifierExpression expression) {
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
