package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;

public class StepOverDebugRequest extends WorkerRequest {

	public StepOverDebugRequest() {
	}

	public StepOverDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public VoidDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before step over");
		debugger.stepOver(DebuggedWorker.parse(workerId));
		logger.debug(()->"after step over");
		return new VoidDebugResponse();
	}
	
}