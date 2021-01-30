package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.Status;
import prompto.debug.response.GetStatusDebugResponse;

public class GetProcessStatusDebugRequest implements IDebugRequest {

	public GetProcessStatusDebugRequest() {
	}

	@Override
	public GetStatusDebugResponse execute(IDebugger debugger) {
		Status status = debugger.getProcessStatus();
		return new GetStatusDebugResponse(status);
	}
	
}