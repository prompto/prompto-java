package prompto.config;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.document.YamlMapping;

public class HostConfiguration implements IHostConfiguration {

	protected IConfigurationReader reader;

	public HostConfiguration(IConfigurationReader reader) {
		this.reader = reader;
	}
	
	@Override
	public String toString() {
		return reader.toString();
	}

	@Override
	public String getHost() {
		return reader.getString("host");
	}
	
	@Override
	public Integer getPort() {
		return reader.getInteger("port");
	}
	
	@Override
	public YamlMapping toYaml() throws YamlException {
		YamlMapping yaml = new YamlMapping();
		yaml.setEntry("host", getHost());
		yaml.setEntry("port", getPort());
		return yaml;
	}
	
	
}
