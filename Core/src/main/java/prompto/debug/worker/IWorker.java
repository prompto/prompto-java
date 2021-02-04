package prompto.debug.worker;

public interface IWorker {
	
	String getWorkerId();
	String getName();
	WorkerState getWorkerState();
}
