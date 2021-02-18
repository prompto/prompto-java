package prompto.debug;

import prompto.debug.worker.IWorker;

public class OnlyRemoteThread implements IWorker {

	@Override
	public String getWorkerId() {
		return "only";
	}
	
	@Override
	public String getName() {
		return getWorkerId();
	}
	
	@Override
	public WorkerStatus getWorkerStatus() {
		return WorkerStatus.WORKER_RUNNING;
	}
		
}
