package prompto.config;

public class DebugConfiguration implements IDebugConfiguration {

	IConfigurationReader reader;

	public DebugConfiguration(IConfigurationReader reader) {
		this.reader = reader;
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
