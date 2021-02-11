package prompto.debug;

import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.worker.IWorker;

/* listens to debugger events */ 
public interface IDebugEventListener {
	void onConnectedEvent(ConnectedDebugEvent event);
	void onProcessReadyEvent();
	void onWorkerStartedEvent(IWorker worker);
	void onWorkerResumedEvent(IWorker worker, ResumeReason reason);
	void onWorkerSuspendedEvent(IWorker worker, SuspendReason reason);
	void onWorkerCompletedEvent(IWorker worker);
	void onProcessTerminatedEvent();
}
