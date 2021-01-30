package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import prompto.debug.ack.IAcknowledgement;
import prompto.debug.event.IDebugEvent;
import prompto.utils.Logger;

/* an implementation which uses plain sockets to communicate with the client */
public class JavaDebugEventAdapter extends DebugEventAdapterBase {

	static Logger logger = new Logger();
	
	String host;
	int port;
	
	public JavaDebugEventAdapter(String host, int port) {
		this.host = host;
		this.port = port;
	}


	@Override
	protected IAcknowledgement send(IDebugEvent event) {
		try(Socket client = new Socket(host, port)) {
			try(OutputStream output = client.getOutputStream()) {
				logger.debug(()->"DebugEventClient sends " + event.getClass().getName());
				sendDebugEvent(output, event);
				try(InputStream input = client.getInputStream()) {
					IAcknowledgement ack = readAcknowledgement(input);
					logger.debug(()->"DebugEventClient receives " + ack.getClass().getName());
					return ack;
				}
			}
		} catch(Exception e) {
			e.printStackTrace(System.err);
			return null;
		}
	}


}
