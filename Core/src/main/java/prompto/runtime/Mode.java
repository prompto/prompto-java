package prompto.runtime;

import prompto.utils.Logger;

public enum Mode {
	PRODUCTION,
	VALIDATION,
	INTEGRATION,
	DEVELOPMENT,
	UNITTEST;

	static final Logger logger = new Logger();
	static Mode instance = PRODUCTION;
	
	public static void set(Mode mode) {
		if(mode!=null) {
			logger.info(()->"Setting runtime mode to " + mode.name());
			instance = mode;
		}
	}
	
	public static Mode get() {
		return instance;
	}
}
