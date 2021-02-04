package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.WorkerState;

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
	
}