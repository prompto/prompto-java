package prompto.debug;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	static class Suspended implements IDebugEvent {
		
		SuspendReason reason;
		
		public Suspended() {
		}
		
		
		public Suspended(SuspendReason reason) {
			setReason(reason);
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
			listener.handleSuspendedEvent(reason);
		}
	}
	
	static class Resumed implements IDebugEvent {
		
		ResumeReason reason;
		
		
		public Resumed() {
		}
		
		public Resumed(ResumeReason reason) {
			setReason(reason);
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
			listener.handleResumedEvent(reason);
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
		SUSPENDED(Suspended.class),
		RESUMED(Resumed.class),
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
