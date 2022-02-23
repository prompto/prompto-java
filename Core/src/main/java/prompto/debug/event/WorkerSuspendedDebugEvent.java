package prompto.debug.event;

import java.util.Objects;

import prompto.debug.IDebugEventListener;
import prompto.debug.SuspendReason;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.worker.IWorker;

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
		listener.onWorkerSuspendedEvent(worker, suspendReason);
	}
	
	public WorkerSuspendedDebugEvent withSuspendReason(SuspendReason reason) {
		this.suspendReason = reason;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(suspendReason);
	}


	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof WorkerSuspendedDebugEvent && ((WorkerSuspendedDebugEvent)other).equals(this));
	}

	public boolean equals(WorkerSuspendedDebugEvent other) {
		return Objects.equals(suspendReason, other.suspendReason) && super.equals(other);
	}


}