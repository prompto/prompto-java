package prompto.debug;

import java.lang.Thread.State;

public enum WorkerState {
	
	STARTING,
	WORKING,
	STEPPING,
	WAITING,
	COMPLETED;

	public static WorkerState valueOf(State state) {
		switch(state) {
		case NEW:
			return STARTING;
		case RUNNABLE:
			return WORKING;
		case BLOCKED:
			return WorkerState.STEPPING; // TODO check this!
		case WAITING:
		case TIMED_WAITING:
			return WAITING;
		case TERMINATED:
			return COMPLETED;
		default:
			throw new IllegalArgumentException(state.name());
		}
	}
}