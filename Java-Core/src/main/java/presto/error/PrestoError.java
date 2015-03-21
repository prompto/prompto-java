package presto.error;

public class PrestoError extends Exception {

	private static final long serialVersionUID = 1L;

	protected PrestoError() {
	}
	
	protected PrestoError(String message) {
		super(message);
	}

	protected PrestoError(Exception e) {
		super(e);
	}


	
}
