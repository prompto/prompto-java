package prompto.utils;

public class ErrorLogger extends PrintStreamLogger {

	@SuppressWarnings("resource")
	public static void install() {
		System.setErr(new ErrorLogger());
	}
	
	protected ErrorLogger() {
		super(ErrorLogger.class.getName());
	}


}
