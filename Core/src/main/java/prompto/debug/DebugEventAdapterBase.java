package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;

import prompto.utils.Logger;

public abstract class DebugEventAdapterBase implements IDebugEventAdapter {

	static Logger logger = new Logger();
	
	@Override
	public void handleConnectedEvent(IDebugEvent.Connected event) {
		send(event);
	}
	
	@Override
	public void handleReadyEvent() {
		send(new IDebugEvent.Ready());
	}
	
	@Override
	public void handleStartedEvent(IWorker worker) {
		send(new IDebugEvent.Started(worker));
	}
	
	@Override
	public void handleSuspendedEvent(IWorker worker, SuspendReason reason) {
		send(new IDebugEvent.Suspended(worker, reason));
	}

	@Override
	public void handleResumedEvent(IWorker worker, ResumeReason reason) {
		send(new IDebugEvent.Resumed(worker, reason));
	}
	
	@Override
	public void handleCompletedEvent(IWorker worker) {
		send(new IDebugEvent.Completed(worker));
	}

	@Override
	public void handleTerminatedEvent() {
		send(new IDebugEvent.Terminated());
	}

	protected abstract IAcknowledgement send(IDebugEvent event);

	protected void sendDebugEvent(OutputStream output, IDebugEvent event) throws Exception {
		Serializer.writeDebugEvent(output, event);
	}

	protected IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
		return Serializer.readAcknowledgement(input);
	}

}
