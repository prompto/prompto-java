package prompto.debug.event;

import java.util.Objects;

import prompto.debug.IDebugEventListener;
import prompto.debug.ResumeReason;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.worker.IWorker;

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
		listener.onWorkerResumedEvent(worker, resumeReason);
	}
	
	public WorkerResumedDebugEvent withResumeReason(ResumeReason reason) {
		this.resumeReason = reason;
		return this;
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof WorkerResumedDebugEvent && ((WorkerResumedDebugEvent)other).equals(this));
	}

	public boolean equals(WorkerResumedDebugEvent other) {
		return Objects.equals(resumeReason, other.resumeReason) && super.equals(other);
	}


}