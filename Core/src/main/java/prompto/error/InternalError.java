package prompto.error;

public class InternalError extends PromptoError {

	private static final long serialVersionUID = 1L;

	public InternalError(String message) {
		super(message);
	}

	public InternalError(Throwable cause) {
		super(cause);
	}
	
}
