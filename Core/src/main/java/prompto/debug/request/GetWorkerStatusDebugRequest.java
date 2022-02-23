package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.WorkerStatus;
import prompto.debug.response.GetWorkerStatusDebugResponse;
import prompto.debug.worker.IWorker;

public class GetWorkerStatusDebugRequest extends WorkerRequest {

	public GetWorkerStatusDebugRequest() {
	}

	public GetWorkerStatusDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public GetWorkerStatusDebugResponse execute(IDebugger debugger) {
		WorkerStatus status = debugger.getWorkerStatus(DebuggedWorker.parse(workerId));
		return new GetWorkerStatusDebugResponse(status);
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof GetWorkerStatusDebugRequest && ((GetWorkerStatusDebugRequest)other).equals(this));
	}

	public boolean equals(GetWorkerStatusDebugRequest other) {
		return super.equals(other);
	}

}