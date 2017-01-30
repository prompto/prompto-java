package prompto.debug;

public interface IDebugEventListener {
	void handleResumedEvent(ResumeReason reason);
	void handleSuspendedEvent(SuspendReason reason);
	void handleTerminatedEvent();
}
