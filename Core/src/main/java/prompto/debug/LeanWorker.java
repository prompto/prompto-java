package prompto.debug;

public class LeanWorker implements IWorker {
	
	String workerId;
	String name;
	WorkerState workerState;
	
	@Override
	public String getWorkerId() {
		return workerId;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public WorkerState getWorkerState() {
		return workerState;
	}

}
