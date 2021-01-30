package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.IsSteppingDebugResponse;

public class IsSteppingDebugRequest extends WorkerRequest {

	public IsSteppingDebugRequest() {
	}

	public IsSteppingDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public IsSteppingDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before is stepping");
		boolean stepping = debugger.isStepping(DebuggedWorker.parse(workerId));
		logger.debug(()->"after is stepping");
		return new IsSteppingDebugResponse(stepping);
	}
	
}