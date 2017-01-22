package prompto.code;

import java.security.InvalidParameterException;

public class Version {
	
	public static Version parse(String version) {
		String[] parts = version.split("\\.");
		if(parts.length<3)
			throw new InvalidParameterException("Version must be like 1.2.3!");
		Version v = new Version();
		v.major = Integer.parseInt(parts[0]);
		v.minor = Integer.parseInt(parts[1]);
		v.fix = Integer.parseInt(parts[2]);
		return v;
	}
	
	int major;
	int minor;
	int fix;
	
	@Override
	public String toString() {
		return "" + major + '.' + minor + '.' + fix;
	}

	public int asInt() {
		return major << 24 & 0xFF000000
			| minor << 16 & 0x00FF0000
			| fix & 0x0000FFFF;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Version)
			return this.asInt() == ((Version)obj).asInt();
		else
			return false;
	}
}
