package presto.error;

import presto.expression.IExpression;
import presto.grammar.CategorySymbol;
import presto.grammar.Identifier;
import presto.runtime.Context;


public class DivideByZeroError extends ExecutionError {

	private static final long serialVersionUID = 1L;

	@Override
	public IExpression getExpression(Context context) {
		return context.getRegisteredValue(CategorySymbol.class, new Identifier("DIVIDE_BY_ZERO"));
	}
}
