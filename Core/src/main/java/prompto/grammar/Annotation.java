package prompto.grammar;

import prompto.expression.IExpression;
import prompto.utils.CodeWriter;

public class Annotation {

	Identifier name;
	IExpression expression;
	
	public Annotation(Identifier name, IExpression expression) {
		this.name = name;
		this.expression = expression;
	}

	public void toDialect(CodeWriter writer) {
		writer.append(name.toString());
		if(expression!=null) {
			writer.append("(");
			expression.toDialect(writer);
			writer.append(")");
		}
		writer.newLine();
	}

}
