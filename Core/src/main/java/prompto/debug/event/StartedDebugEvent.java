package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.IWorker.State;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class StartedDebugEvent extends WorkerDebugEvent {
	
	String name;
	State state;
	
	public StartedDebugEvent() {
	}
	
	public StartedDebugEvent(IWorker worker) {
		super(worker);
		this.name = worker.getName();
		this.state = worker.getState();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleStartedEvent(worker);
	}
	
}