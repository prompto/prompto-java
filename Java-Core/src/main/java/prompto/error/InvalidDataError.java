package prompto.error;

import prompto.expression.IExpression;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;

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
