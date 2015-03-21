package presto.error;

public class InternalError extends PrestoError {

	private static final long serialVersionUID = 1L;

	public InternalError(Exception e) {
		super(e);
	}
	
}
