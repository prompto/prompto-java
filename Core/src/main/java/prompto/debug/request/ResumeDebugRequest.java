package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;

public class ResumeDebugRequest extends WorkerRequest {

	public ResumeDebugRequest() {
	}

	public ResumeDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public VoidDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before resume");
		debugger.resume(DebuggedWorker.parse(workerId));
		logger.debug(()->"after resume");
		return new VoidDebugResponse();
	}
	
}