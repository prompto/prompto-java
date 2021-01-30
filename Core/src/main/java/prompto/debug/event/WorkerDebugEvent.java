package prompto.debug.event;

import prompto.debug.IWorker;

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
	
}