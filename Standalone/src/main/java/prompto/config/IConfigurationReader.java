package prompto.config;

import java.util.List;

public interface IConfigurationReader {

	Boolean getBoolean(String key);
	default boolean getBooleanOrDefault(String key, boolean value) {
		Boolean read = getBoolean(key);
		return read==null ? value : read.booleanValue();
	}
	String getString(String key);
	default String getStringOrDefault(String key, String value)  {
		String read = getString(key);
		return read==null ? value : read;
	}
	Integer getInteger(String key);
	default int getIntegerOrDefault(String key, int value)  {
		Integer read = getInteger(key);
		return read==null ? value : read.intValue();
	}
	<T extends Object> List<T> getArray(String key);
	IConfigurationReader getObject(String key);
}
