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
}
