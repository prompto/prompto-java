package prompto.debug;

public interface IWorker {
	
	String getWorkerId();
	String getName();
	WorkerState getWorkerState();
}
