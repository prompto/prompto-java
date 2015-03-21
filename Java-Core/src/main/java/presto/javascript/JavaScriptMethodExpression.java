package presto.javascript;

import presto.utils.CodeWriter;

public class JavaScriptMethodExpression extends JavaScriptSelectorExpression {

	String name;
	JavaScriptExpressionList arguments = new JavaScriptExpressionList();
	
	public JavaScriptMethodExpression(String name) {
		this.name = name;
	}

	public void setArguments(JavaScriptExpressionList l1) {
		this.arguments = l1;
	}

	@Override
	public String toString() {
		if(parent!=null)
			return parent.toString() + "." + name + "(" + arguments.toString() + ")";
		else
			return name + "(" + arguments.toString() + ")";
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(parent!=null) {
			parent.toDialect(writer);
			writer.append('.');
		}
		writer.append(name);
		writer.append('(');
		if(arguments!=null)
			arguments.toDialect(writer);
		writer.append(')');
	}
	
}
