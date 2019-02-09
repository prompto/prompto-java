package prompto.debug;

public class LeanWorker implements IWorker {
	
	String workerId;
	String name;
	State state;
	
	@Override
	public String getWorkerId() {
		return workerId;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public State getState() {
		return state;
	}

}
