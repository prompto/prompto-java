package presto.python;

import presto.utils.CodeWriter;

public class PythonOrdinalArgument implements PythonArgument {

	PythonExpression expression;
	
	public PythonOrdinalArgument(PythonExpression expression) {
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}

}
