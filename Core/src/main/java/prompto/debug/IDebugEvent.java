package prompto.debug;

import com.fasterxml.jackson.annotation.JsonIgnore;

import prompto.debug.ProcessDebugger.DebuggedThread;

public interface IDebugEvent {

	@JsonIgnore
	Type getType();
	void execute(IDebugEventListener listener);

	static class Connected implements IDebugEvent {
		
		String host;
		int port;
		
		public Connected() {
		}
		
		public Connected(String host, int port) {
			this.host = host;
			this.port = port;
		}

		public void setHost(String host) {
			this.host = host;
		}
		
		public void setPort(int port) {
			this.port = port;
		}
		
		public String getHost() {
			return host;
		}
		
		public int getPort() {
			return port;
		}
		
		@Override
		public Type getType() {
			return Type.CONNECTED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			listener.handleConnectedEvent(this);
		}
	}
	
	static abstract class ThreadEvent implements IDebugEvent {

		String threadId;
		
		ThreadEvent() {
		}
		
		ThreadEvent(IThread thread) {
			this.threadId = thread.toString();
		}

		public void setThreadId(String threadId) {
			this.threadId = threadId;
		}
		
		public String getThreadId() {
			return threadId;
		}
		
	}
	
	static class Started extends ThreadEvent {
		
		public Started() {
		}
		
		public Started(IThread thread) {
			super(thread);
		}
		
		@Override
		public Type getType() {
			return Type.STARTED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			IThread thread = DebuggedThread.parse(threadId);
			listener.handleStartedEvent(thread);
		}
		
	}
	
	static class Suspended extends ThreadEvent {
		
		SuspendReason reason;
		
		public Suspended() {
		}
		
		
		public Suspended(IThread thread, SuspendReason reason) {
			super(thread);
			this.reason = reason;
		}

		public void setReason(SuspendReason reason) {
			this.reason = reason;
		}
		
		
		public SuspendReason getReason() {
			return reason;
		}
		
		@Override
		public Type getType() {
			return Type.SUSPENDED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			IThread thread = DebuggedThread.parse(threadId);
			listener.handleSuspendedEvent(thread, reason);
		}
	}
	
	static class Resumed extends ThreadEvent {
		
		ResumeReason reason;
		
		
		public Resumed() {
		}
		
		public Resumed(IThread thread, ResumeReason reason) {
			super(thread);
			this.reason = reason;
		}
		
		
		public void setReason(ResumeReason reason) {
			this.reason = reason;
		}
		
		public ResumeReason getReason() {
			return reason;
		}
		
		
		@Override
		public Type getType() {
			return Type.RESUMED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			IThread thread = DebuggedThread.parse(threadId);
			listener.handleResumedEvent(thread, reason);
		}
	}

	static class Completed extends ThreadEvent {
		
		public Completed() {
		}
		
		public Completed(IThread thread) {
			super(thread);
		}
		
		@Override
		public Type getType() {
			return Type.COMPLETED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			IThread thread = DebuggedThread.parse(threadId);
			listener.handleStartedEvent(thread);
		}
		
	}
	
	static class Terminated implements IDebugEvent {

		@Override
		public Type getType() {
			return Type.TERMINATED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			listener.handleTerminatedEvent();
		}
	}

	public enum Type {
		CONNECTED(Connected.class),
		STARTED(Started.class),
		SUSPENDED(Suspended.class),
		RESUMED(Resumed.class),
		COMPLETED(Completed.class),
		TERMINATED(Terminated.class);

		Class<? extends IDebugEvent> klass;
		
		Type(Class<? extends IDebugEvent> klass) {
			this.klass = klass;
		}
		
		public Class<? extends IDebugEvent> getKlass() {
			return klass;
		}
	}

}
