package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof StepOverDebugRequest && ((StepOverDebugRequest)other).equals(this));
	}

	public boolean equals(StepOverDebugRequest other) {
		return super.equals(other);
	}


}