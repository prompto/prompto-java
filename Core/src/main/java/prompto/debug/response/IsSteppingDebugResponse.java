package prompto.debug.response;

public class IsSteppingDebugResponse implements IDebugResponse {

	boolean stepping;
	
	public IsSteppingDebugResponse() {
	}

	public IsSteppingDebugResponse(boolean stepping) {
		this.stepping = stepping;
	}
	
	public boolean isStepping() {
		return stepping;
	}
	
	public void setStepping(boolean stepping) {
		this.stepping = stepping;
	}

}