package prompto.debug.request;

import java.util.Objects;

import prompto.debug.worker.IWorker;

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
	
	@SuppressWarnings("unchecked")
	public <T extends WorkerRequest> T withWorkerId(String workerId) {
		this.workerId = workerId;
		return (T)this;
	}
	
	public boolean equals(WorkerRequest other) {
		return Objects.equals(workerId, other.workerId);
	}

}