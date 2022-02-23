package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof SuspendDebugRequest && ((SuspendDebugRequest)other).equals(this));
	}

	public boolean equals(SuspendDebugRequest other) {
		return super.equals(other);
	}

}