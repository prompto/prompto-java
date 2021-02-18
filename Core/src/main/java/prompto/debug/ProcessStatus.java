package prompto.debug;

public enum ProcessStatus {
	PROCESS_STARTING,
	PROCESS_RUNNING,
	PROCESS_TERMINATING,
	PROCESS_TERMINATED,
	PROCESS_UNREACHABLE;
	
	@Override
	public String toString() {
		return name().substring(0,1) + name().substring(1).toLowerCase();
	}
}