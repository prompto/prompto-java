package prompto.debug;

import java.lang.Thread.State;

public enum WorkerStatus {
	WORKER_STARTING,
	WORKER_RUNNING,
	WORKER_SUSPENDED,
	WORKER_WAITING,
	WORKER_COMPLETED,
	WORKER_UNREACHABLE;

	@Override
	public String toString() {
		return name().substring(0,1) + name().substring(1).toLowerCase();
	}

	public static WorkerStatus valueOf(State state) {
		switch(state) {
		case NEW:
			return WORKER_STARTING;
		case RUNNABLE:
			return WORKER_RUNNING;
		case BLOCKED:
			return WORKER_SUSPENDED; 
		case WAITING:
		case TIMED_WAITING:
			return WORKER_WAITING;
		case TERMINATED:
			return WORKER_COMPLETED;
		default:
			throw new IllegalArgumentException(state.name());
		}
	}

}