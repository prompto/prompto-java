package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.Status;
import prompto.debug.response.GetStatusDebugResponse;
import prompto.debug.worker.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class GetWorkerStatusDebugRequest extends WorkerRequest {

	public GetWorkerStatusDebugRequest() {
	}

	public GetWorkerStatusDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public GetStatusDebugResponse execute(IDebugger debugger) {
		Status status = debugger.getWorkerStatus(DebuggedWorker.parse(workerId));
		return new GetStatusDebugResponse(status);
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof GetWorkerStatusDebugRequest && ((GetWorkerStatusDebugRequest)other).equals(this));
	}

	public boolean equals(GetWorkerStatusDebugRequest other) {
		return super.equals(other);
	}

}