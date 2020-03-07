package prompto.error;

import prompto.expression.IExpression;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;

public class NativeError extends ExecutionError {

	private static final long serialVersionUID = 1L;

	Throwable cause;
	
	public NativeError(String message, Throwable cause) {
		super(message);
		this.cause = cause;
	}

	@Override
	public IExpression getExpression(Context context) {
		return new TextLiteral(super.getMessage() + ", caused by: " + cause.getMessage());
	}

	
}
