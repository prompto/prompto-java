package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;

public class TerminateDebugRequest extends WorkerRequest {

	public TerminateDebugRequest() {
	}

	public TerminateDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public VoidDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before terminate");
		debugger.terminate(DebuggedWorker.parse(workerId));
		logger.debug(()->"after terminate");
		return new VoidDebugResponse();
	}
	
}