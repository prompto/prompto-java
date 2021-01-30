package prompto.debug;

import prompto.debug.event.ConnectedDebugEvent;

/* listens to debugger events */ 
public interface IDebugEventListener {
	void handleConnectedEvent(ConnectedDebugEvent event);
	void handleReadyEvent();
	void handleStartedEvent(IWorker worker);
	void handleResumedEvent(IWorker worker, ResumeReason reason);
	void handleSuspendedEvent(IWorker worker, SuspendReason reason);
	void handleCompletedEvent(IWorker worker);
	void handleTerminatedEvent();
}
