package prompto.debug.response;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(stepping);
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof IsSteppingDebugResponse && ((IsSteppingDebugResponse)other).equals(this));
	}
	
	public boolean equals(IsSteppingDebugResponse other) {
		return stepping == other.stepping;
	}
}