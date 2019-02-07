package prompto.debug;

import prompto.config.IConfigurationReader;
import prompto.config.IDebugRequestListenerConfiguration;

public interface IDebugRequestListenerFactory {

	IDebugRequestListener newListener(IDebugRequestListenerConfiguration config, IDebugger debugger);
	IDebugRequestListenerConfiguration newConfiguration(IConfigurationReader reader);
	
	static IDebugRequestListener newListenerFromConfig(IDebugRequestListenerConfiguration cfg, IDebugger debugger) throws Throwable {
		IDebugRequestListenerFactory factory = newListenerFactory(cfg.getFactory());
		return factory.newListener(cfg, debugger);
	}
	
	static IDebugRequestListenerFactory newListenerFactory(String factoryName) throws Throwable {
		Class<?> klass = Class.forName(factoryName, true, Thread.currentThread().getContextClassLoader());
		if(!(IDebugRequestListenerFactory.class.isAssignableFrom(klass)))
			throw new RuntimeException("Not a listener factory: " + factoryName);
		return (IDebugRequestListenerFactory)klass.newInstance();
	}


}
