package prompto.debug;

import prompto.config.IDebugConfiguration;

public class JavaDebugRequestListenerFactory implements IDebugRequestListenerFactory {

	@Override
	public IDebugRequestListener newInstance(IDebugConfiguration config, LocalDebugger debugger) {
		return new JavaDebugRequestListener(debugger);
	}

}
