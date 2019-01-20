package prompto.debug;

/* listens to debugger events */ 
public interface IDebugEventListener {
	void handleConnectedEvent(IDebugEvent.Connected event);
	void handleResumedEvent(ResumeReason reason);
	void handleSuspendedEvent(SuspendReason reason);
	void handleTerminatedEvent();
}
