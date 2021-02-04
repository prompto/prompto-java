package prompto.debug.java;

import prompto.config.IConfigurationReader;
import prompto.config.IDebugRequestListenerConfiguration;
import prompto.debug.IDebugRequestListener;
import prompto.debug.IDebugRequestListenerFactory;
import prompto.debug.IDebugger;

public class JavaDebugRequestListenerFactory implements IDebugRequestListenerFactory {

	@Override
	public IDebugRequestListener newListener(IDebugRequestListenerConfiguration config, IDebugger debugger) {
		return new JavaDebugRequestListener(debugger);
	}

	@Override
	public IDebugRequestListenerConfiguration newConfiguration(IConfigurationReader reader) {
		return new IDebugRequestListenerConfiguration.Inline().withFactory(this.getClass().getName());
	}
	
	
}
