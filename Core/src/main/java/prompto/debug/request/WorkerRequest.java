package prompto.debug.request;

import prompto.debug.IWorker;

public abstract class WorkerRequest implements IDebugRequest {
	
	String workerId;
	
	WorkerRequest() {
	}
	
	WorkerRequest(IWorker worker) {
		this.workerId = worker.getWorkerId();
	}
	
	public String getWorkerId() {
		return workerId;
	}
	
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	
	
}