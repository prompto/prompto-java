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

}