package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import prompto.debug.IDebugEvent.ConnectedEvent;
import prompto.debug.IDebugEvent.SuspendedEvent;
import prompto.debug.IDebugEvent.ResumedEvent;
import prompto.debug.IDebugEvent.TerminatedEvent;

/* a client which can be notified when events occur in a remote debugged process */ 
public abstract class DebugEventClient implements IDebugEventListener {

	String host;
	int port;
	
	public DebugEventClient(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public void handleConnectedEvent(String host, int port) {
		send(new ConnectedEvent(host, port));
	}
	
	@Override
	public void handleSuspendedEvent(SuspendReason reason) {
		send(new SuspendedEvent(reason));
	}

	@Override
	public void handleResumedEvent(ResumeReason reason) {
		send(new ResumedEvent(reason));
	}

	@Override
	public void handleTerminatedEvent() {
		send(new TerminatedEvent());
	}
	
	protected abstract IAcknowledgement send(IDebugEvent event);
	
	/* an implementation which uses JavaSerialization to communicate with the server */
	public static class Java extends DebugEventClient {
		
		public Java(String host, int port) {
			super(host, port);
		}

		protected IAcknowledgement send(IDebugEvent event) {
			try(Socket client = new Socket(host, port)) {
				try(OutputStream output = client.getOutputStream()) {
					LocalDebugger.logEvent("DebugEventClient sends " + event.getType());
					sendDebugEvent(output, event);
					try(InputStream input = client.getInputStream()) {
						IAcknowledgement ack = readAcknowledgement(input);
						LocalDebugger.logEvent("DebugEventClient receives " + ack.getType());
						return ack;
					}
				}
			} catch(Exception e) {
				e.printStackTrace(System.err);
				return null;
			}
		}
	
		private void sendDebugEvent(OutputStream output, IDebugEvent event) throws Exception {
			Serializer.writeDebugEvent(output, event);
		}
	
		private IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
			return Serializer.readAcknowledgement(input);
		}
	}

}
