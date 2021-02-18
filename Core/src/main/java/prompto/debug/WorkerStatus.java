package prompto.debug;

public enum WorkerStatus {
	WORKER_RUNNING,
	WORKER_SUSPENDED,
	WORKER_TERMINATED,
	WORKER_UNREACHABLE;

	@Override
	public String toString() {
		return name().substring(0,1) + name().substring(1).toLowerCase();
	}
}