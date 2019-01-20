package prompto.debug;

import prompto.config.IDebugConfiguration;

public class JavaDebugEventAdapterFactory implements IDebugEventAdapterFactory {

	@Override
	public IDebugEventAdapter newInstance(IDebugConfiguration config) {
		return new JavaDebugEventAdapter(config.getHost(), config.getPort());
	}
}
