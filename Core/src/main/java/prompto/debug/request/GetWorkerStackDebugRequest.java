package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IStack;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetWorkerStackDebugResponse;

public class GetWorkerStackDebugRequest extends WorkerRequest {

	public GetWorkerStackDebugRequest() {
	}

	public GetWorkerStackDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public GetWorkerStackDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before stack");
		IStack<?> stack = debugger.getWorkerStack(DebuggedWorker.parse(workerId));
		logger.debug(()->"after stack");
		return new GetWorkerStackDebugResponse(stack);
	}
	
}