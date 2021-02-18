package prompto.debug.event;

import java.util.Objects;

import prompto.debug.IDebugEventListener;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.WorkerStatus;
import prompto.debug.worker.IWorker;

public class WorkerStartedDebugEvent extends WorkerDebugEvent {
	
	String name;
	WorkerStatus workerStatus;
	
	public WorkerStartedDebugEvent() {
	}
	
	public WorkerStartedDebugEvent(IWorker worker) {
		super(worker);
		this.name = worker.getName();
		this.workerStatus = worker.getWorkerStatus();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWorkerState(WorkerStatus state) {
		this.workerStatus = state;
	}
	
	public WorkerStatus getWorkerState() {
		return workerStatus;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.onWorkerStartedEvent(worker);
	}
	
	public WorkerStartedDebugEvent withName(String name) {
		this.name = name;
		return this;
	}

	public WorkerStartedDebugEvent withWorkerState(WorkerStatus state) {
		this.workerStatus = state;
		return this;
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof WorkerStartedDebugEvent && ((WorkerStartedDebugEvent)other).equals(this));
	}

	public boolean equals(WorkerStartedDebugEvent other) {
		return Objects.equals(name, other.name) && Objects.equals(workerStatus, other.workerStatus) && super.equals(other);
	}

}