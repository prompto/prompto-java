package presto.error;

import presto.expression.IExpression;
import presto.runtime.Context;

public abstract class ExecutionError extends PrestoError {

	private static final long serialVersionUID = 1L;

	protected ExecutionError() {
	}
	
	protected ExecutionError(String message) {
		super(message);
	}

	public abstract IExpression getExpression(Context context);

	
}
