package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import prompto.debug.IAcknowledgement.Acknowledgement;

/* a server which listens to IDebugEvents sent by the remote debugged process */ 
public class JavaDebugEventListener {
	
	IDebugEventListener listener;
	Thread thread;
	int port = 0;
	boolean listening;

	public JavaDebugEventListener(IDebugEventListener listener) {
		this.listener = listener;
	}

	public int getPort() {
		return port;
	}

	public int startListening() {
		Object lock = new Object();
		thread = new Thread(()->{
			try(ServerSocket server = new ServerSocket(0)) {
				server.setSoTimeout(10); // make it fast to exit
				port = server.getLocalPort();
				LocalDebugger.logEvent("DebugEventServer listening on " + port);
				synchronized(lock) {
					lock.notify();
				}
				LocalDebugger.logEvent("DebugEventServer entering loop");
				listening = true;
				while(listening) {
					try {
						Socket client = server.accept();
						handleMessage(client);
					} catch(SocketTimeoutException e) {
						// nothing to do, just helps exit the loop
					}
				}
				LocalDebugger.logEvent("DebugEventServer exiting loop");
			} catch(Exception e) {
				e.printStackTrace(System.err);
			}
			
		}, "Prompto debug notification listener");
		thread.start();
		synchronized(lock) {
			try {
				lock.wait();
			} catch(InterruptedException e) {
				
			}
		}
		return port;
	}

	public void stopListening() {
		listening = false;
		if(thread!=Thread.currentThread()) try {
			thread.join();
		} catch(InterruptedException e) {
		}
	}

	private void handleMessage(Socket client) throws Exception {
		InputStream input = client.getInputStream();
		OutputStream output = client.getOutputStream();
		IDebugEvent event = readDebugEvent(input);
		LocalDebugger.logEvent("DebugEventServer receives " + event.getType());
		event.execute(listener);
		LocalDebugger.logEvent("DebugEventServer sends " + IAcknowledgement.Type.RECEIVED);
		sendAcknowledgement(output);
		output.flush();
	}

	
	private IDebugEvent readDebugEvent(InputStream input) throws Exception {
		return Serializer.readDebugEvent(input);
	}


	private void sendAcknowledgement(OutputStream output) throws Exception {
		Serializer.writeAcknowledgement(output, new Acknowledgement());
	}

	public boolean isListening() {
		return listening;
	}


}