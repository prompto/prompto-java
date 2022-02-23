package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessStatus;
import prompto.debug.response.GetProcessStatusDebugResponse;

public class GetProcessStatusDebugRequest implements IDebugRequest {

	public GetProcessStatusDebugRequest() {
	}

	@Override
	public GetProcessStatusDebugResponse execute(IDebugger debugger) {
		ProcessStatus status = debugger.getProcessStatus();
		return new GetProcessStatusDebugResponse(status);
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || other instanceof GetProcessStatusDebugRequest;
	}

}