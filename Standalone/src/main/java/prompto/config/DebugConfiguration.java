package prompto.config;

public class DebugConfiguration implements IDebugConfiguration {

	IConfigurationReader reader;

	public DebugConfiguration(IConfigurationReader reader) {
		this.reader = reader;
	}

	@Override
	public String getEventAdapterFactory() {
		return reader.getString("eventAdapterFactory");
	}
	
	@Override
	public String getRequestListenerFactory() {
		return reader.getString("requestListenerFactory");
	}
	
	@Override
	public String getHost() {
		return reader.getStringOrDefault("host", "localhost");
	}
	
	@Override
	public Integer getPort() {
		return reader.getInteger("port");
	}
	
}
