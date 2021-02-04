package prompto.debug.event;

import java.util.Objects;

import prompto.debug.IDebugEventListener;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.worker.IWorker;
import prompto.debug.worker.WorkerState;

public class WorkerStartedDebugEvent extends WorkerDebugEvent {
	
	String name;
	WorkerState workerState;
	
	public WorkerStartedDebugEvent() {
	}
	
	public WorkerStartedDebugEvent(IWorker worker) {
		super(worker);
		this.name = worker.getName();
		this.workerState = worker.getWorkerState();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWorkerState(WorkerState state) {
		this.workerState = state;
	}
	
	public WorkerState getWorkerState() {
		return workerState;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleStartedEvent(worker);
	}
	
	public WorkerStartedDebugEvent withName(String name) {
		this.name = name;
		return this;
	}

	public WorkerStartedDebugEvent withWorkerState(WorkerState state) {
		this.workerState = state;
		return this;
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof WorkerStartedDebugEvent && ((WorkerStartedDebugEvent)other).equals(this));
	}

	public boolean equals(WorkerStartedDebugEvent other) {
		return Objects.equals(name, other.name) && Objects.equals(workerState, other.workerState) && super.equals(other);
	}

}