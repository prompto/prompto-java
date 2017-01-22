package prompto.debug;

public class RemoteThread implements IRemote {

	Thread thread;
	
	public RemoteThread(Thread thread) {
		this.thread = thread;
	}
	
	@Override
	public boolean isAlive() {
		return thread.isAlive();
	}

}
