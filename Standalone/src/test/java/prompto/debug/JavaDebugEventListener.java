package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import prompto.debug.ack.Acknowledged;
import prompto.debug.event.IDebugEvent;
import prompto.utils.Logger;

/* a server which listens to IDebugEvents sent by the remote debugged process */ 
public class JavaDebugEventListener {
	
	private static Logger logger = new Logger();
	
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
				logger.debug(()->"DebugEventServer listening on " + port);
				synchronized(lock) {
					lock.notify();
				}
				logger.debug(()->"DebugEventServer entering loop");
				listening = true;
				while(listening) {
					try (var client = server.accept()) {
						handleMessage(client);
					} catch(SocketTimeoutException e) {
						// nothing to do, just helps exit the loop
					}
				}
				logger.debug(()->"DebugEventServer exiting loop");
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
		try(var input = client.getInputStream()) {
			try(var output = client.getOutputStream()) {
				IDebugEvent event = readDebugEvent(input);
				logger.debug(()->"DebugEventServer receives " + event.getClass().getName());
				event.execute(listener);
				logger.debug(()->"DebugEventServer sends " + event.getClass().getName());
				sendAcknowledged(output);
				output.flush();
			}
		}
	}

	
	private IDebugEvent readDebugEvent(InputStream input) throws Exception {
		return Serializer.readDebugEvent(input);
	}


	private void sendAcknowledged(OutputStream output) throws Exception {
		Serializer.writeMessage(output, new Acknowledged());
	}

	public boolean isListening() {
		return listening;
	}


}