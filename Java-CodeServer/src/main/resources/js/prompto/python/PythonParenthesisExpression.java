package prompto.python;



public class PythonParenthesisExpression implements PythonExpression {

	PythonExpression expression;
	
	public PythonParenthesisExpression(PythonExpression expression) {
		this.expression = expression;
	}

}
