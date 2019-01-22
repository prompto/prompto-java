package prompto.config;

public class DebugConfiguration extends IDebugConfiguration.Inline {

	IConfigurationReader reader;

	public DebugConfiguration(IConfigurationReader reader) {
		this.eventAdapterFactory = ()->reader.getString("eventAdapterFactory");
		this.requestListenerFactory = ()->reader.getString("requestListenerFactory");
		this.host = ()->reader.getStringOrDefault("host", "localhost");
		this.port = ()->reader.getInteger("port");
	}
	
}
