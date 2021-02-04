package prompto.debug.response;

import prompto.debug.Status;

public class GetStatusDebugResponse implements IDebugResponse {

	Status status;
	
	public GetStatusDebugResponse() {
	}

	public GetStatusDebugResponse(Status status) {
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetStatusDebugResponse && ((GetStatusDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetStatusDebugResponse other) {
		return status == other.status;
	}


}