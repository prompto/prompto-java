package prompto.config;

import java.net.URL;
import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

import prompto.intrinsic.PromptoVersion;

public interface IRuntimeConfiguration {
	Supplier<Collection<URL>> getRuntimeLibs();
	IStoreConfiguration getCodeStoreConfiguration();
	IStoreConfiguration getDataStoreConfiguration();
	IDebugConfiguration getDebugConfiguration();
	Map<String, String> getArguments();
	String getApplicationName();
	PromptoVersion getApplicationVersion();
	boolean isTestMode();
	URL[] getAddOnURLs();
	URL[] getResourceURLs();
	boolean isLoadRuntime();
	
	<T extends IRuntimeConfiguration> T withRuntimeLibs(Supplier<Collection<URL>> supplier);
	<T extends IRuntimeConfiguration> T withAddOnURLs(URL[] addOnURLS);
	<T extends IRuntimeConfiguration> T withApplicationName(String name);
	<T extends IRuntimeConfiguration> T withApplicationVersion(PromptoVersion version);
	<T extends IRuntimeConfiguration> T withResourceURLs(URL[] resourceURLs);
	<T extends IRuntimeConfiguration> T withTestMode(boolean testMode);


	@SuppressWarnings("unchecked")
	public static class Inline implements IRuntimeConfiguration {
		
		Supplier<Collection<URL>> runtimeLibs = null; // always passed from code
		Supplier<Map<String, String>> arguments = ()->null;
		Supplier<IDebugConfiguration> debugConfiguration = ()->null;
		Supplier<IStoreConfiguration> codeStoreConfiguration = ()->null;
		Supplier<IStoreConfiguration> dataStoreConfiguration = ()->null;
		Supplier<Boolean> testMode = ()->null;
		Supplier<Boolean> loadRuntime = ()->null;
		Supplier<URL[]> addOnURLs = ()->null;
		Supplier<URL[]> resourceURLs = ()->null;
		Supplier<String> applicationName = ()->null;
		Supplier<PromptoVersion> applicationVersion = ()->null;

		@Override public Supplier<Collection<URL>>getRuntimeLibs() { return runtimeLibs; }
		@Override public IStoreConfiguration getCodeStoreConfiguration() { return codeStoreConfiguration.get(); }
		@Override public IStoreConfiguration getDataStoreConfiguration() { return dataStoreConfiguration.get(); }
		@Override public IDebugConfiguration getDebugConfiguration() { return debugConfiguration.get(); }
		@Override public Map<String, String> getArguments() { return arguments.get(); }
		@Override public String getApplicationName() { return applicationName.get(); }
		@Override public PromptoVersion getApplicationVersion() { return applicationVersion.get(); }
		@Override public boolean isTestMode() { return testMode.get(); }
		@Override public URL[] getAddOnURLs() { return addOnURLs.get(); }
		@Override public URL[] getResourceURLs() { return resourceURLs.get(); }
		@Override public boolean isLoadRuntime() { return loadRuntime.get(); }
		
		@Override 
		public <T extends IRuntimeConfiguration> T withRuntimeLibs(Supplier<Collection<URL>> runtimeLibs) {
			this.runtimeLibs = runtimeLibs;
			return (T)this;
		}
		
		@Override 
		public <T extends IRuntimeConfiguration> T withAddOnURLs(URL[] urls) {
			this.addOnURLs = ()->urls;
			return (T)this;
		}

		@Override 
		public <T extends IRuntimeConfiguration> T withApplicationName(String name) {
			this.applicationName = ()->name;
			return (T)this;
		}

		@Override 
		public <T extends IRuntimeConfiguration> T withApplicationVersion(PromptoVersion version) {
			this.applicationVersion = ()->version;
			return (T)this;
		}
		
		@Override 
		public <T extends IRuntimeConfiguration> T withResourceURLs(URL[] urls) {
			this.resourceURLs = ()->urls;
			return (T)this;
		}
		
		@Override
		public <T extends IRuntimeConfiguration> T withTestMode(boolean mode) {
			this.testMode = ()->mode;
			return (T)this;
		}
		
	}

}
