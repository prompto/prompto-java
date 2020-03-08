package prompto.config;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.document.YamlMapping;

import prompto.security.IKeyStoreFactory;


public interface IKeyStoreFactoryConfiguration {

	IKeyStoreFactory getKeyStoreFactory();
	YamlMapping toYaml() throws YamlException;

}
