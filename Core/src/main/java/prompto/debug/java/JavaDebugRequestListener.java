package prompto.debug.java;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import prompto.debug.IDebugRequestListener;
import prompto.debug.IDebugger;
import prompto.debug.Serializer;
import prompto.debug.event.ConnectedDebugEvent;
import prompto.debug.request.IDebugRequest;
import prompto.debug.response.IDebugResponse;
import prompto.utils.Logger;

/* a class which listens to IDebugRequest messages (such as step, get stack frames...) and forwards them to the debugger */
public class JavaDebugRequestListener implements IDebugRequestListener {

	private static Logger logger = new Logger();

	IDebugger debugger;
	Thread thread;
	int port;
	boolean loop;

	
	public JavaDebugRequestListener(IDebugger debugger) {
		this.debugger = debugger;
	}
	
	public Thread getThread() {
		return thread;
	}
	
	public int getPort() {
		return port;
	}
	

	@Override
	public ConnectedDebugEvent startListening() throws Exception {
		Object lock = new Object();
		this.thread = new Thread(() -> {
			try(ServerSocket server = new ServerSocket(0)) {
				server.setSoTimeout(10); // make it fast to exit
				port = server.getLocalPort();
				logger.debug(()->"DebugRequestServer listening on " + port);
				synchronized(lock) {
					lock.notify();
				}			
				loop = true;
				logger.debug(()->"DebugRequestServer entering loop");
				while(loop) {
					try {
						Socket client = server.accept();
						handleMessage(client);
					} catch(SocketTimeoutException e) {
						// nothing to do, just helps exit the loop
					}
				}
				logger.debug(()->"DebugRequestServer exiting loop");
			} catch (Throwable t) {
				t.printStackTrace(System.err);
			}
		}, "Prompto debug server");
		this.thread.start();
		synchronized(lock) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// OK
			}
		}
		// TODO use host name
		return new ConnectedDebugEvent("localhost", port);
	}

	@Override
	public void stopListening() {
		loop = false;
		if(thread!=Thread.currentThread()) try {
			thread.join();
		} catch(InterruptedException e) {
		}
	}

	private void handleMessage(Socket client) throws Exception {
		synchronized(this) {
			// don't close these streams since that would close the underlying socket
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			IDebugRequest request = readRequest(input);
			logger.debug(()->"DebugRequestServer receives " + request.getClass().getName());
			IDebugResponse response = request.execute(debugger);
			logger.debug(()->"DebugRequestServer responds " + response.getClass().getName());
			sendResponse(output, response);
			output.flush();
		}
	}

	private IDebugRequest readRequest(InputStream input) throws Exception {
		return Serializer.readDebugRequest(input);
	}


	private void sendResponse(OutputStream output, IDebugResponse response) throws Exception {
		Serializer.writeMessage(output, response);
	}


}
