package prompto.debug;

public class RemoteProcess implements IRemote {

	Process process;
	
	public RemoteProcess(Process process) {
		this.process = process;
	}
	
	@Override
	public boolean isAlive() {
		return process.isAlive();
	}
	
}
