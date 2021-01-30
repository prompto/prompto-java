package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.ResumeReason;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class ResumedDebugEvent extends WorkerDebugEvent {
	
	ResumeReason reason;
	
	
	public ResumedDebugEvent() {
	}
	
	public ResumedDebugEvent(IWorker worker, ResumeReason reason) {
		super(worker);
		this.reason = reason;
	}
	
	
	public void setReason(ResumeReason reason) {
		this.reason = reason;
	}
	
	public ResumeReason getReason() {
		return reason;
	}
	
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleResumedEvent(worker, reason);
	}
}