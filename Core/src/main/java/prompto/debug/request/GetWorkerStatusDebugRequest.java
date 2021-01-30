package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.Status;
import prompto.debug.response.GetStatusDebugResponse;
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
	
}