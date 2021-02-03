package prompto.debug;

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
