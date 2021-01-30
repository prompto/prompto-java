package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.function.Consumer;
import java.util.function.Supplier;

import prompto.debug.request.IDebugRequest;
import prompto.debug.response.IDebugResponse;
import prompto.utils.Logger;

/* a client which is able to send debug requests (such as step, get stack frames...) to a debug request server using Java serialization */
public class JavaDebugRequestClient extends DebugRequestClient {

	private static Logger logger = new Logger();
	
	JavaDebugEventListener eventListener;
	Supplier<Boolean> remoteAlive;
	
	protected JavaDebugRequestClient(JavaDebugEventListener eventListener, Supplier<Boolean> remoteAlive) {
		this.eventListener = eventListener;
		this.remoteAlive = remoteAlive;
	}
	
	public static class Thread extends JavaDebugRequestClient {
		
		public Thread(java.lang.Thread thread, JavaDebugEventListener eventListener) {
			super(eventListener, ()->thread.isAlive());
		}
		
	}
	
	
	public static class Process extends JavaDebugRequestClient {

		public Process(java.lang.Process process, JavaDebugEventListener eventListener) {
			super(eventListener, ()->process.isAlive());
		}

	}
	
	@Override
	protected boolean isRemoteAlive() {
		return remoteAlive.get();
	}
	
	@Override
	public Status getProcessStatus() {
		return isRemoteAlive() ? Status.RUNNING : Status.TERMINATED;
	}

	@Override
	protected IDebugResponse sendRequest(IDebugRequest request, Consumer<Exception> errorHandler) {
		logger.debug(()->"DebugRequestClient sends " + request.getClass().getName());
		try(Socket client = new Socket(remoteHost, remotePort)) {
			try(OutputStream output = client.getOutputStream()) {
				Serializer.writeMessage(output, request);
				try(InputStream input = client.getInputStream()) {
					IDebugResponse response = Serializer.readDebugResponse(input);
					logger.debug(()->"DebugRequestClient receives " + response.getClass().getName());
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
		this.eventListener.listener = listener;
	}
	

	@Override
	public boolean isTerminated() {
		return eventListener==null || !eventListener.isListening();
	}

	@Override
	public void notifyTerminated() {
		if(eventListener!=null)
			eventListener.stopListening();
	}

	@Override
	public void terminate() {
		connected = false;
		eventListener.stopListening();
	}


}
