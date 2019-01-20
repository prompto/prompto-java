package prompto.config;

public interface IDebugConfiguration {

	String getEventAdapterFactory();
	String getRequestListenerFactory();
	String getHost();
	Integer getPort();

}
