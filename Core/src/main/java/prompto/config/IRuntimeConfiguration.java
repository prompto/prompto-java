package prompto.config;

import java.net.URL;
import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

import prompto.code.Version;

public interface IRuntimeConfiguration {
	void setRuntimeLibsSupplier(Supplier<Collection<URL>> supplier);
	Supplier<Collection<URL>> getRuntimeLibsSupplier();
	IStoreConfiguration getCodeStoreConfiguration();
	IStoreConfiguration getDataStoreConfiguration();
	IDebugConfiguration getDebugConfiguration();
	Map<String, String> getArguments();
	String getApplicationName();
	Version getApplicationVersion();
	boolean isTestMode();
	URL[] getAddOnURLs();
	URL[] getResourceURLs();
	boolean isLoadRuntime();
	
	public static class Sourced<T extends IRuntimeConfiguration> implements IRuntimeConfiguration {
		
		T source;
		
		public Sourced(T config) { this.source = config; }
		@Override public void setRuntimeLibsSupplier( Supplier<Collection<URL>> supplier) { source.setRuntimeLibsSupplier(supplier); }
		@Override public Supplier<Collection<URL>> getRuntimeLibsSupplier() { return source.getRuntimeLibsSupplier(); }
		@Override public IStoreConfiguration getCodeStoreConfiguration() { return source.getCodeStoreConfiguration(); }
		@Override public IStoreConfiguration getDataStoreConfiguration() { return source.getDataStoreConfiguration(); }
		@Override public IDebugConfiguration getDebugConfiguration() { return source.getDebugConfiguration(); }
		@Override public Map<String, String> getArguments() { return source.getArguments(); }
		@Override public String getApplicationName() { return source.getApplicationName(); }
		@Override public Version getApplicationVersion() { return source.getApplicationVersion(); }
		@Override public boolean isTestMode() { return source.isTestMode(); }
		@Override public URL[] getAddOnURLs() { return source.getAddOnURLs(); }
		@Override public URL[] getResourceURLs() { return source.getResourceURLs(); }
		@Override public boolean isLoadRuntime() { return source.isLoadRuntime(); }
		
	}

}
