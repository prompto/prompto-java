package prompto.debug;

public interface IDebugRequestListener {

	IDebugEvent.Connected startListening() throws Exception;
	void stopListening();
	
}
