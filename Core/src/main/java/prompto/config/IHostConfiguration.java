package prompto.config;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.document.YamlElement;

public interface IHostConfiguration {

	String getHost();
	Integer getPort();
	YamlElement toYaml() throws YamlException;

}
