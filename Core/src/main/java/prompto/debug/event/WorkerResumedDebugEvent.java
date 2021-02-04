package prompto.debug.event;

import prompto.debug.IDebugEventListener;
import prompto.debug.IWorker;
import prompto.debug.ResumeReason;
import prompto.debug.ProcessDebugger.DebuggedWorker;

public class WorkerResumedDebugEvent extends WorkerDebugEvent {
	
	ResumeReason resumeReason;
	
	
	public WorkerResumedDebugEvent() {
	}
	
	public WorkerResumedDebugEvent(IWorker worker, ResumeReason reason) {
		super(worker);
		this.resumeReason = reason;
	}
	
	
	public void setResumeReason(ResumeReason reason) {
		this.resumeReason = reason;
	}
	
	public ResumeReason getResumeReason() {
		return resumeReason;
	}
	
	
	@Override
	public void execute(IDebugEventListener listener) {
		IWorker worker = DebuggedWorker.parse(workerId);
		listener.handleResumedEvent(worker, resumeReason);
	}
}