package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.SuspendReason;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class SuspendedDebugEvent extends WorkerDebugEvent {
	
	SuspendReason reason;
	
	public SuspendedDebugEvent() {
	}
	
	
	public SuspendedDebugEvent(IWorker worker, SuspendReason reason) {
		super(worker);
		this.reason = reason;
	}

	public void setReason(SuspendReason reason) {
		this.reason = reason;
	}
	
	
	public SuspendReason getReason() {
		return reason;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleSuspendedEvent(worker, reason);
	}
}