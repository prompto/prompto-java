package prompto.debug.response;

public class VoidDebugResponse implements IDebugResponse {

	public VoidDebugResponse() {
	}

	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return this == other || other instanceof VoidDebugResponse;
	}

}