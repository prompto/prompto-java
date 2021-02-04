package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetWorkerStackDebugResponse;
import prompto.debug.stack.IStack;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof GetWorkerStackDebugRequest && ((GetWorkerStackDebugRequest)other).equals(this));
	}

	public boolean equals(GetWorkerStackDebugRequest other) {
		return super.equals(other);
	}

}