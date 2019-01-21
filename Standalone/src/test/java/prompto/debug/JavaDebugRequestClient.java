package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;

/* a client which is able to send debug requests (such as step, get stack frames...) to a debug request server using Java serialization */
public class JavaDebugRequestClient extends DebugRequestClient {

	JavaDebugEventListener eventServer;
	
	public JavaDebugRequestClient(Thread thread, JavaDebugEventListener eventServer) {
		this.eventServer = eventServer;
		this.remoteAlive = ()->thread.isAlive();
	}

	public JavaDebugRequestClient(Process process, JavaDebugEventListener eventServer) {
		this.eventServer = eventServer;
		this.remoteAlive = ()->process.isAlive();
	}

	@Override
	protected void sendRequest(OutputStream output, IDebugRequest request) throws Exception {
		Serializer.writeDebugRequest(output, request);
	}


	@Override
	protected IDebugResponse readResponse(InputStream input) throws Exception {
		return Serializer.readDebugResponse(input);
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
