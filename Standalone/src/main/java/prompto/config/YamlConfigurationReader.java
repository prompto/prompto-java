package prompto.config;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlReader;

public class YamlConfigurationReader implements IConfigurationReader {

	@SuppressWarnings("unchecked")
	static Map<String, Object> parseYaml(InputStream input) {
		try {
			YamlReader reader = new YamlReader(new InputStreamReader(input));
			return reader.read(Map.class);
		} catch(Throwable t) {
			throw new RuntimeException(t);
		}
	}

	Map<String, Object> data;
	
	public YamlConfigurationReader(InputStream input) {
		this(parseYaml(input));
	}
	
	@SuppressWarnings("unchecked")
	public YamlConfigurationReader(Map<String, Object> data) {
		if(data.containsKey("<<")) {
			this.data = new HashMap<String, Object>();
			this.data.putAll((Map<String, Object>)data.get("<<"));
			this.data.putAll(data);
			this.data.remove("<<");
		} else
			this.data = data;
	}
	
	@Override
	public String getString(String key) {
		Object value = data.get(key);
		return value==null ? null : value.toString();
	}
	
	@Override
	public Boolean getBoolean(String key) {
		Object value = data.get(key);
		return value==null ? null : Boolean.parseBoolean(value.toString());
	}
	
	@Override
	public Integer getInteger(String key) {
		Object value = data.get(key);
		return value==null ? null : Integer.parseInt(value.toString());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getArray(String key) {
		Object value = data.get(key);
		if(value instanceof List)
			return (List<T>) value;
		else
			return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IConfigurationReader getObject(String key) {
		Object value = data.get(key);
		return value instanceof Map ? new YamlConfigurationReader((Map<String, Object>)value): null;
	}
	
}
