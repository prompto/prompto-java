package prompto.debug.worker;

import prompto.debug.WorkerStatus;

public interface IWorker {
	
	String getWorkerId();
	String getName();
	WorkerStatus getWorkerStatus();
}
