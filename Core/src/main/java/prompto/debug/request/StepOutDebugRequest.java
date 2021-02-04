package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.worker.IWorker;

public class StepOutDebugRequest extends WorkerRequest {

	public StepOutDebugRequest() {
	}

	public StepOutDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public VoidDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before step out");
		debugger.stepOut(DebuggedWorker.parse(workerId));
		logger.debug(()->"after step out");
		return new VoidDebugResponse();
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof StepOutDebugRequest && ((StepOutDebugRequest)other).equals(this));
	}

	public boolean equals(StepOutDebugRequest other) {
		return super.equals(other);
	}

}