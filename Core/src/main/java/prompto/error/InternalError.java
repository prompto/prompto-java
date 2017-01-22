package prompto.error;

public class InternalError extends PromptoError {

	private static final long serialVersionUID = 1L;

	public InternalError(Exception e) {
		super(e);
	}
	
}
