package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof ResumeDebugRequest && ((ResumeDebugRequest)other).equals(this));
	}

	public boolean equals(ResumeDebugRequest other) {
		return super.equals(other);
	}

}