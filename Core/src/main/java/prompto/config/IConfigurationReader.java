package prompto.config;

import java.util.List;

import prompto.security.ISecretKeyFactory;
import prompto.store.IStoreFactory;

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
	default IStoreConfiguration readStoreConfiguration(String key) {
		IConfigurationReader child = getObject(key);
		if(child==null)
			return null;
		String factoryName = child.getString("factory");
		if(factoryName==null)
			return new StoreConfiguration(child);
		else try {
			@SuppressWarnings("unchecked")
			Class<? extends IStoreFactory> klass = (Class<? extends IStoreFactory>) Class.forName(factoryName);
			IStoreFactory factory = klass.newInstance();
			return factory.newConfiguration(child);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	default ISecretKeyConfiguration readSecretKeyConfiguration(String key) {
		IConfigurationReader child = getObject(key);
		if(child==null)
			return null;
		String factoryName = child.getString("factory");
		if(factoryName==null)
			return new SecretKeyConfiguration(child);
		else try {
			@SuppressWarnings("unchecked")
			Class<? extends ISecretKeyFactory> klass = (Class<? extends ISecretKeyFactory>) Class.forName(factoryName);
			ISecretKeyFactory factory = klass.newInstance();
			return factory.newConfiguration(child);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
