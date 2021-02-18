package prompto.debug.response;

import prompto.debug.WorkerStatus;

public class GetWorkerStatusDebugResponse implements IDebugResponse {

	WorkerStatus workerStatus;
	
	public GetWorkerStatusDebugResponse() {
	}

	public GetWorkerStatusDebugResponse(WorkerStatus status) {
		this.workerStatus = status;
	}
	
	public WorkerStatus getWorkerStatus() {
		return workerStatus;
	}
	
	public void setWorkerStatus(WorkerStatus status) {
		this.workerStatus = status;
	}
	
	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetWorkerStatusDebugResponse && ((GetWorkerStatusDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetWorkerStatusDebugResponse other) {
		return workerStatus == other.workerStatus;
	}


}