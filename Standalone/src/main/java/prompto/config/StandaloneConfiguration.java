package prompto.config;

import java.util.Map;

public class StandaloneConfiguration extends RuntimeConfiguration implements IStandaloneConfiguration {

	public StandaloneConfiguration(IConfigurationReader reader, Map<String, String> arguments) {
		super(reader, arguments);
	}

	@Override
	public String getMainMethod() {
		return reader.getStringOrDefault("mainMethod", "main");
	}

	@Override
	public String getTestMethod() {
		return reader.getString("testMethod");
	}


}
