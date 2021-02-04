package prompto.debug.event;

import java.util.Objects;

import prompto.debug.worker.IWorker;

public abstract class WorkerDebugEvent implements IDebugEvent {

	String workerId;
	
	WorkerDebugEvent() {
	}
	
	WorkerDebugEvent(IWorker worker) {
		this.workerId = worker.getWorkerId();
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	
	public String getWorkerId() {
		return workerId;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends WorkerDebugEvent> T withWorkerId(String workerId) {
		this.workerId = workerId;
		return (T)this;
	}

	public boolean equals(WorkerDebugEvent other) {
		return Objects.equals(workerId, other.workerId);
	}

}