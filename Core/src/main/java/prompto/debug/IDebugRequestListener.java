package prompto.debug;

import prompto.debug.event.ConnectedDebugEvent;

public interface IDebugRequestListener {

	ConnectedDebugEvent startListening() throws Exception;
	void stopListening();
	
}
