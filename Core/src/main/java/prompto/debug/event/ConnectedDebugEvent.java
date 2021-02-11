package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public class ConnectedDebugEvent implements IDebugEvent {
	
	String host;
	int port;
	
	public ConnectedDebugEvent() {
	}
	
	public ConnectedDebugEvent(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getHost() {
		return host;
	}
	
	public int getPort() {
		return port;
	}
	
	@Override
	public void execute(IDebugEventListener listener) {
		listener.onConnectedEvent(this);
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || other instanceof ConnectedDebugEvent;
	}

}