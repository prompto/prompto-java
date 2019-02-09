package prompto.debug;

public interface IWorker {
	
	public enum State {
		STARTING,
		RUNNING,
		STEPPING,
		WAITING,
		COMPLETED;

		public static State valueOf(java.lang.Thread.State state) {
			switch(state) {
			case NEW:
				return STARTING;
			case RUNNABLE:
				return RUNNING;
			case BLOCKED:
				return State.STEPPING; // TODO check this!
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
	
	String getWorkerId();
	String getName();
	State getState();
}
