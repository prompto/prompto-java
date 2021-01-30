package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;

public class StepIntoDebugRequest extends WorkerRequest {

	public StepIntoDebugRequest() {
	}

	public StepIntoDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public VoidDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before step into");
		debugger.stepInto(DebuggedWorker.parse(workerId));
		logger.debug(()->"after step into");
		return new VoidDebugResponse();
	}
	
}