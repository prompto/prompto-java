package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;

import prompto.debug.ack.IAcknowledgement;
import prompto.debug.event.CompletedDebugEvent;
import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.event.IDebugEvent;
import prompto.debug.event.ReadyDebugEvent;
import prompto.debug.event.ResumedDebugEvent;
import prompto.debug.event.StartedDebugEvent;
import prompto.debug.event.WorkerSuspendedDebugEvent;
import prompto.debug.event.TerminatedDebugEvent;
import prompto.utils.Logger;

public abstract class DebugEventAdapterBase implements IDebugEventAdapter {

	static Logger logger = new Logger();
	
	@Override
	public void handleConnectedEvent(ConnectedDebugEvent event) {
		send(event);
	}
	
	@Override
	public void handleReadyEvent() {
		send(new ReadyDebugEvent());
	}
	
	@Override
	public void handleStartedEvent(IWorker worker) {
		send(new StartedDebugEvent(worker));
	}
	
	@Override
	public void handleSuspendedEvent(IWorker worker, SuspendReason reason) {
		send(new WorkerSuspendedDebugEvent(worker, reason));
	}

	@Override
	public void handleResumedEvent(IWorker worker, ResumeReason reason) {
		send(new ResumedDebugEvent(worker, reason));
	}
	
	@Override
	public void handleCompletedEvent(IWorker worker) {
		send(new CompletedDebugEvent(worker));
	}

	@Override
	public void handleTerminatedEvent() {
		send(new TerminatedDebugEvent());
	}

	protected abstract IAcknowledgement send(IDebugEvent event);

	protected void sendDebugEvent(OutputStream output, IDebugEvent event) throws Exception {
		Serializer.writeMessage(output, event);
	}

	protected IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
		return Serializer.readAcknowledgement(input);
	}

}
