package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class WorkerCompletedDebugEvent extends WorkerDebugEvent {
	
	public WorkerCompletedDebugEvent() {
	}
	
	public WorkerCompletedDebugEvent(IWorker worker) {
		super(worker);
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleStartedEvent(worker);
	}
	
}