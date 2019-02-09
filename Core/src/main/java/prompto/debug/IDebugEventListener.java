package prompto.debug;

/* listens to debugger events */ 
public interface IDebugEventListener {
	void handleConnectedEvent(IDebugEvent.Connected event);
	void handleStartedEvent(IWorker worker);
	void handleResumedEvent(IWorker worker, ResumeReason reason);
	void handleSuspendedEvent(IWorker worker, SuspendReason reason);
	void handleCompletedEvent(IWorker worker);
	void handleTerminatedEvent();
}
