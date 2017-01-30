package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import prompto.debug.IDebugRequest.Type;

public class DebugRequestServer {

	LocalDebugger debugger;
	Thread thread;
	int port;
	boolean loop;
	
	public DebugRequestServer(LocalDebugger debugger, int port) {
		this.debugger = debugger;
		this.port = port;
	}
	
	public Thread getThread() {
		return thread;
	}

	public void startListening() throws Exception {
		Object lock = new Object();
		this.thread = new Thread(() -> {
			try {
				listenInLoop(lock);
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
	}
	
	
	private void listenInLoop(Object lock) throws Exception {
		loop = true;
		try(ServerSocket server = new ServerSocket(port)) {
			server.setSoTimeout(10); // make it fast to exit
			System.err.println("DebugRequestServer entering loop");
			while(loop) {
				try {
					Socket client = server.accept();
					if(handleMessage(client)) synchronized(lock) {
						lock.notify();
					}
				} catch(SocketTimeoutException e) {
					// nothing to do, just helps exit the loop
				}
			}
			System.err.println("DebugRequestServer exiting loop");
		}
	}

	public void stopListening() {
		loop = false;
		if(thread!=Thread.currentThread()) try {
			thread.join();
		} catch(InterruptedException e) {
		}
	}

	private boolean handleMessage(Socket client) throws Exception {
		synchronized(this) {
			// don't close these streams since that would close the underlying socket
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			IDebugRequest request = readRequest(input);
			System.err.println("DebugRequestServer receives " + request.getType());
			IDebugResponse response = request.execute(debugger);
			System.err.println("DebugRequestServer responds " + response.getType());
			sendResponse(output, response);
			output.flush();
			return request.getType()==Type.CONNECT;
		}
	}

	private IDebugRequest readRequest(InputStream input) throws Exception {
		return Serializer.readDebugRequest(input);
	}


	private void sendResponse(OutputStream output, IDebugResponse response) throws Exception {
		Serializer.writeDebugResponse(output, response);
	}



}
