package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof StepIntoDebugRequest && ((StepIntoDebugRequest)other).equals(this));
	}

	public boolean equals(StepIntoDebugRequest other) {
		return super.equals(other);
	}

}