package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.SuspendReason;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class WorkerSuspendedDebugEvent extends WorkerDebugEvent {
	
	SuspendReason suspendReason;
	
	public WorkerSuspendedDebugEvent() {
	}
	
	
	public WorkerSuspendedDebugEvent(IWorker worker, SuspendReason reason) {
		super(worker);
		this.suspendReason = reason;
	}

	public void setSuspendReason(SuspendReason reason) {
		this.suspendReason = reason;
	}
	
	
	public SuspendReason getSuspendReason() {
		return suspendReason;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleSuspendedEvent(worker, suspendReason);
	}
}