package prompto.debug;

import prompto.config.IDebugConfiguration;

public interface IDebugRequestListenerFactory {

	IDebugRequestListener newInstance(IDebugConfiguration config, LocalDebugger debugger);

}
