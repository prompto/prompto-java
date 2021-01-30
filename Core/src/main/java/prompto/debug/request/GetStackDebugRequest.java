package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IStack;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetStackDebugResponse;

public class GetStackDebugRequest extends WorkerRequest {

	public GetStackDebugRequest() {
	}

	public GetStackDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public GetStackDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before stack");
		IStack<?> stack = debugger.getStack(DebuggedWorker.parse(workerId));
		logger.debug(()->"after stack");
		return new GetStackDebugResponse(stack);
	}
	
}