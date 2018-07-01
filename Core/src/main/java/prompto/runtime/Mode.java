package prompto.runtime;

public enum Mode {
	PRODUCTION,
	VALIDATION,
	INTEGRATION,
	DEVELOPMENT,
	UNITTEST;

	static Mode instance = PRODUCTION;
	
	public static void set(Mode mode) {
		instance = mode!=null ? mode : PRODUCTION;
	}
	
	public static Mode get() {
		return instance;
	}
}
