package prompto.debug;

import prompto.debug.worker.IWorker;
import prompto.debug.worker.WorkerState;

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
	public WorkerState getWorkerState() {
		return WorkerState.WORKING;
	}
		
}
