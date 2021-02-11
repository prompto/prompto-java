package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;

import prompto.debug.ack.IAcknowledgement;
import prompto.debug.event.WorkerCompletedDebugEvent;
import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.event.IDebugEvent;
import prompto.debug.event.ProcessReadyDebugEvent;
import prompto.debug.event.WorkerResumedDebugEvent;
import prompto.debug.event.WorkerStartedDebugEvent;
import prompto.debug.event.WorkerSuspendedDebugEvent;
import prompto.debug.worker.IWorker;
import prompto.debug.event.ProcessTerminatedDebugEvent;
import prompto.utils.Logger;

public abstract class DebugEventAdapterBase implements IDebugEventAdapter {

	static Logger logger = new Logger();
	
	@Override
	public void onConnectedEvent(ConnectedDebugEvent event) {
		send(event);
	}
	
	@Override
	public void onProcessReadyEvent() {
		send(new ProcessReadyDebugEvent());
	}
	
	@Override
	public void onWorkerStartedEvent(IWorker worker) {
		send(new WorkerStartedDebugEvent(worker));
	}
	
	@Override
	public void onWorkerSuspendedEvent(IWorker worker, SuspendReason reason) {
		send(new WorkerSuspendedDebugEvent(worker, reason));
	}

	@Override
	public void onWorkerResumedEvent(IWorker worker, ResumeReason reason) {
		send(new WorkerResumedDebugEvent(worker, reason));
	}
	
	@Override
	public void onWorkerCompletedEvent(IWorker worker) {
		send(new WorkerCompletedDebugEvent(worker));
	}

	@Override
	public void onProcessTerminatedEvent() {
		send(new ProcessTerminatedDebugEvent());
	}

	protected abstract IAcknowledgement send(IDebugEvent event);

	protected void sendDebugEvent(OutputStream output, IDebugEvent event) throws Exception {
		Serializer.writeMessage(output, event);
	}

	protected IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
		return Serializer.readAcknowledgement(input);
	}

}
