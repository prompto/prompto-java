package prompto.utils;

public class OutLogger extends PrintStreamLogger {

	@SuppressWarnings("resource")
	public static void install() {
		System.setOut(new OutLogger());
	}
	
	protected OutLogger() {
		super(OutLogger.class.getName());
	}

}
