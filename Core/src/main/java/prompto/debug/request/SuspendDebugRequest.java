package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;

public class SuspendDebugRequest extends WorkerRequest {

	public SuspendDebugRequest() {
	}

	public SuspendDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public VoidDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before suspend");
		debugger.suspend(DebuggedWorker.parse(workerId));
		logger.debug(()->"after suspend");
		return new VoidDebugResponse();
	}
	
}