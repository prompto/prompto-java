package prompto.config;

import java.util.Map;
import java.util.function.Supplier;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.document.YamlMapping;

public class StandaloneConfiguration extends RuntimeConfiguration implements IStandaloneConfiguration {

	Supplier<String> mainMethod = ()->null;
	Supplier<String> testMethod = ()->null;
	
	public StandaloneConfiguration(IConfigurationReader reader, Map<String, String> arguments) {
		super(reader, arguments);
		mainMethod = ()->reader.getStringOrDefault("mainMethod", "main");
		testMethod = ()->reader.getString("testMethod");
	}
	
	
	@Override public String getMainMethod() { 
		return mainMethod.get(); 
	}
	
	@Override public String getTestMethod() { 
		return testMethod.get(); 
	}

	@Override
	public IStandaloneConfiguration withMainMethod(String method) {
		mainMethod = ()->method;
		return this;
	}
	@Override
	public IStandaloneConfiguration withTestMethod(String method) {
		testMethod = ()->method;
		return this;
	}

	@Override
	public YamlMapping toYaml() throws YamlException {
		YamlMapping yaml = super.toYaml();
		String main = mainMethod.get();
		if(main!=null)
			yaml.setEntry("mainMethod", main);
		return yaml;
	}

}
