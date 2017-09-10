package prompto.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import prompto.code.Version;
import prompto.store.IStoreFactory;

public class RuntimeConfiguration implements IRuntimeConfiguration {

	IConfigurationReader reader;
	Map<String, String> arguments;
	Supplier<Collection<URL>> runtimeLibsSupplier;
	
	protected RuntimeConfiguration(IConfigurationReader reader, Map<String, String> arguments) {
		this.reader = reader;
		this.arguments = arguments;
	}
	
	@Override
	public IDebugConfiguration getDebugConfiguration() {
		IConfigurationReader child = reader.getObject("debug");
		return child==null ? null : new DebugConfiguration(child);
	}
	
	@Override
	public IStoreConfiguration getCodeStoreConfiguration() {
		return getStoreConfiguration("codeStore");
	}
	
	@Override
	public IStoreConfiguration getDataStoreConfiguration() {
		return getStoreConfiguration("dataStore");
	}
	
	private IStoreConfiguration getStoreConfiguration(String key) {
		IConfigurationReader child = reader.getObject(key);
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

	@Override
	public Supplier<Collection<URL>> getRuntimeLibsSupplier() {
		return this.runtimeLibsSupplier;
	}
	
	@Override
	public void setRuntimeLibsSupplier(Supplier<Collection<URL>> supplier) {
		this.runtimeLibsSupplier = supplier;
	}
	
	@Override
	public Map<String, String> getArguments() {
		return arguments;
	}

	@Override
	public boolean isTestMode() {
		return reader.getBooleanOrDefault("testMode", false);
	}
	
	@Override
	public boolean isLoadRuntime() {
		return reader.getBooleanOrDefault("loadRuntime", true);
	}

	@Override
	public URL[] getAddOnURLs() {
		return getURLs("addOnURLs");
	}

	@Override
	public String getApplicationName() {
		return reader.getString("applicationName");
	}

	@Override
	public Version getApplicationVersion() {
		String version = reader.getString("applicationVersion");
		return version==null ? Version.LATEST : Version.parse(version);
	}

	@Override
	public URL[] getResourceURLs() {
		return getURLs("resourceURLs");
	}
	
	private URL[] getURLs(String key) {
		List<Object> list = reader.getArray(key);
		if(list==null || list.isEmpty())
			return null;
		URL[] urls = new URL[list.size()];
		for(int i=0;i<urls.length;i++) {
			urls[i] = convertToURL(list.get(i).toString());
		}
		return urls;
	}

	private static URL convertToURL(String resourceName) {
		try {
			if(resourceName.startsWith("\""))
				resourceName = resourceName.substring(1);
			if(resourceName.endsWith("\""))
				resourceName = resourceName.substring(0, resourceName.length()-1);
			if(resourceName.startsWith("file:") || resourceName.startsWith("jar:"))
				return new URL(resourceName);
			URL url = Thread.currentThread().getContextClassLoader().getResource(resourceName);
			if(url!=null)
				return url;
			File file = new File(resourceName);
			if(!file.exists())
				throw new FileNotFoundException(resourceName);
			return file.toURI().toURL();
		} catch(Throwable t) {
			throw new RuntimeException(t);
		}
	}

}
