package prompto.debug;

import prompto.debug.IDebugEvent;

public interface IDebugRequestListener {

	IDebugEvent.Connected startListening() throws Exception;
	void stopListening();
	
}
