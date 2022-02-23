package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.IsSteppingDebugResponse;
import prompto.debug.worker.IWorker;

public class IsSteppingDebugRequest extends WorkerRequest {

	public IsSteppingDebugRequest() {
	}

	public IsSteppingDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public IsSteppingDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before is stepping");
		boolean stepping = debugger.isStepping(DebuggedWorker.parse(workerId));
		logger.debug(()->"after is stepping");
		return new IsSteppingDebugResponse(stepping);
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof IsSteppingDebugRequest && ((IsSteppingDebugRequest)other).equals(this));
	}

	public boolean equals(IsSteppingDebugRequest other) {
		return super.equals(other);
	}

}