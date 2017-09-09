package prompto.config;

import java.util.List;

public interface IConfigurationReader {

	Boolean getBoolean(String key);
	String getString(String key);
	Integer getInteger(String key);
	<T extends Object> List<T> getArray(String key);
	IConfigurationReader getObject(String key);
}
