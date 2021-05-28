package prompto.utils;

public enum OS {
	LINUX,
	WINDOWS,
	MACOSX;
	
	public static OS current() {
		String os = System.getProperty("os.name").toLowerCase();
		if(os.contains("nux"))
			return LINUX;
		else if(os.contains("win"))
			return WINDOWS;
		else if(os.contains("mac") || os.contains("darwin"))
			return MACOSX;
		else
			throw new IllegalArgumentException("Unknown OS: " + os);
	}
}
