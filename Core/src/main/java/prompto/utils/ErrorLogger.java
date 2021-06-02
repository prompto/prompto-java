package prompto.utils;

public class ErrorLogger extends PrintStreamLogger {

	public static void install() {
		System.setErr(new ErrorLogger());
	}
	
	protected ErrorLogger() {
		super(ErrorLogger.class.getName());
	}


}
