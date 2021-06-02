package prompto.utils;

public class OutLogger extends PrintStreamLogger {

	public static void install() {
		System.setOut(new OutLogger());
	}
	
	protected OutLogger() {
		super(OutLogger.class.getName());
	}

}
