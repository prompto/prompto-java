package prompto.debug;

import prompto.config.IDebugConfiguration;

public interface IDebugEventAdapterFactory {

	IDebugEventAdapter newInstance(IDebugConfiguration config);

}
