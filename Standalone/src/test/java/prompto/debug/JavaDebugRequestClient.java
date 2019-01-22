package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* a client which is able to send debug requests (such as step, get stack frames...) to a debug request server using Java serialization */
public class JavaDebugRequestClient extends DebugRequestClient {

	JavaDebugEventListener eventServer;
	Supplier<Boolean> remoteAlive;
	
	public JavaDebugRequestClient(Thread thread, JavaDebugEventListener eventServer) {
		this.eventServer = eventServer;
		this.remoteAlive = ()->thread.isAlive();
	}

	public JavaDebugRequestClient(Process process, JavaDebugEventListener eventServer) {
		this.eventServer = eventServer;
		this.remoteAlive = ()->process.isAlive();
	}
	
	@Override
	protected boolean isRemoteAlive() {
		return remoteAlive.get();
	}

	@Override
	protected IDebugResponse sendRequest(IDebugRequest request, Consumer<Exception> errorHandler) {
		LocalDebugger.logEvent("DebugRequestClient sends " + request.getType());
		try(Socket client = new Socket(remoteHost, remotePort)) {
			try(OutputStream output = client.getOutputStream()) {
				Serializer.writeDebugRequest(output, request);
				try(InputStream input = client.getInputStream()) {
					IDebugResponse response = Serializer.readDebugResponse(input);
					LocalDebugger.logEvent("DebugRequestClient receives " + response.getType());
					return response;
				}
			}
		} catch(Exception e) {
			if(errorHandler!=null)
				errorHandler.accept(e);
			else
				e.printStackTrace(System.err);
			return null;
		}
	}

	@Override
	public void setListener(IDebugEventListener listener) {
		this.eventServer.listener = listener;
	}
	

	@Override
	public boolean isTerminated() {
		return eventServer==null || !eventServer.isListening();
	}

	@Override
	public void notifyTerminated() {
		if(eventServer!=null)
			eventServer.stopListening();
	}

	@Override
	public void terminate() {
		connected = false;
		eventServer.stopListening();
	}


}
