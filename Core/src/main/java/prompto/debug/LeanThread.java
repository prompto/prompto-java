package prompto.debug;

public class LeanThread implements IThread {
	
	String threadId;
	String name;
	State state;
	
	@Override
	public String getThreadId() {
		return threadId;
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
