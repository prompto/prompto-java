package prompto.debug;

import com.fasterxml.jackson.annotation.JsonIgnore;

import prompto.debug.ProcessDebugger.DebuggedWorker;

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
	
	static abstract class WorkerEvent implements IDebugEvent {

		String workerId;
		
		WorkerEvent() {
		}
		
		WorkerEvent(IWorker worker) {
			this.workerId = worker.getWorkerId();
		}

		public void setWorkerId(String workerId) {
			this.workerId = workerId;
		}
		
		public String getWorkerId() {
			return workerId;
		}
		
	}
	
	static class Started extends WorkerEvent {
		
		public Started() {
		}
		
		public Started(IWorker worker) {
			super(worker);
		}
		
		@Override
		public Type getType() {
			return Type.STARTED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			IWorker worker = DebuggedWorker.parse(workerId);
			listener.handleStartedEvent(worker);
		}
		
	}
	
	static class Suspended extends WorkerEvent {
		
		SuspendReason reason;
		
		public Suspended() {
		}
		
		
		public Suspended(IWorker worker, SuspendReason reason) {
			super(worker);
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
			IWorker worker = DebuggedWorker.parse(workerId);
			listener.handleSuspendedEvent(worker, reason);
		}
	}
	
	static class Resumed extends WorkerEvent {
		
		ResumeReason reason;
		
		
		public Resumed() {
		}
		
		public Resumed(IWorker worker, ResumeReason reason) {
			super(worker);
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
			IWorker worker = DebuggedWorker.parse(workerId);
			listener.handleResumedEvent(worker, reason);
		}
	}

	static class Completed extends WorkerEvent {
		
		public Completed() {
		}
		
		public Completed(IWorker worker) {
			super(worker);
		}
		
		@Override
		public Type getType() {
			return Type.COMPLETED;
		}
		
		@Override
		public void execute(IDebugEventListener listener) {
			IWorker worker = DebuggedWorker.parse(workerId);
			listener.handleStartedEvent(worker);
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
