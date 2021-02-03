package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.WorkerState;

public class StartedDebugEvent extends WorkerDebugEvent {
	
	String name;
	WorkerState state;
	
	public StartedDebugEvent() {
	}
	
	public StartedDebugEvent(IWorker worker) {
		super(worker);
		this.name = worker.getName();
		this.state = worker.getWorkerState();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setState(WorkerState state) {
		this.state = state;
	}
	
	public WorkerState getState() {
		return state;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleStartedEvent(worker);
	}
	
}