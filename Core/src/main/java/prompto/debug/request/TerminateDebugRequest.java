package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.VoidDebugResponse;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof TerminateDebugRequest && ((TerminateDebugRequest)other).equals(this));
	}

	public boolean equals(TerminateDebugRequest other) {
		return super.equals(other);
	}

	
}