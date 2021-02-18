package prompto.debug.response;

import prompto.debug.ProcessStatus;

public class GetProcessStatusDebugResponse implements IDebugResponse {

	ProcessStatus processStatus;
	
	public GetProcessStatusDebugResponse() {
	}

	public GetProcessStatusDebugResponse(ProcessStatus status) {
		this.processStatus = status;
	}
	
	public ProcessStatus getProcessStatus() {
		return processStatus;
	}
	
	public void setProcessStatus(ProcessStatus status) {
		this.processStatus = status;
	}
	
	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetProcessStatusDebugResponse && ((GetProcessStatusDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetProcessStatusDebugResponse other) {
		return processStatus == other.processStatus;
	}


}