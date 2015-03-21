package presto.error;

import presto.expression.IExpression;
import presto.literal.TextLiteral;
import presto.runtime.Context;

public class InvalidDataError extends ExecutionError {

	private static final long serialVersionUID = 1L;

	public InvalidDataError(String message) {
		super(message);
	}
	
	@Override
	public IExpression getExpression(Context context) {
		return new TextLiteral(super.getMessage());
	}

}
