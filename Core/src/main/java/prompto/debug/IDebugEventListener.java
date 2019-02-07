package prompto.debug;

/* listens to debugger events */ 
public interface IDebugEventListener {
	void handleConnectedEvent(IDebugEvent.Connected event);
	void handleStartedEvent(IThread thread);
	void handleResumedEvent(IThread thread, ResumeReason reason);
	void handleSuspendedEvent(IThread thread, SuspendReason reason);
	void handleCompletedEvent(IThread thread);
	void handleTerminatedEvent();
}
