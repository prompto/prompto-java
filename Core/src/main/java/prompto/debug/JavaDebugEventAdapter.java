package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import prompto.debug.IDebugEvent;

/* an implementation which uses JavaSerialization to communicate with the client */
public class JavaDebugEventAdapter implements IDebugEventAdapter {

	
	String host;
	int port;
	
	public JavaDebugEventAdapter(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public void handleConnectedEvent(IDebugEvent.Connected event) {
		send(event);
	}
	
	@Override
	public void handleSuspendedEvent(SuspendReason reason) {
		send(new IDebugEvent.Suspended(reason));
	}

	@Override
	public void handleResumedEvent(ResumeReason reason) {
		send(new IDebugEvent.Resumed(reason));
	}

	@Override
	public void handleTerminatedEvent() {
		send(new IDebugEvent.Terminated());
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
