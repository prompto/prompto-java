package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.worker.IWorker;

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
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof WorkerCompletedDebugEvent && ((WorkerCompletedDebugEvent)other).equals(this));
	}

	public boolean equals(WorkerCompletedDebugEvent other) {
		return super.equals(other);
	}
	
}