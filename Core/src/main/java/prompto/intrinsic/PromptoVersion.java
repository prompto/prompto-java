package prompto.intrinsic;

import java.security.InvalidParameterException;

public class PromptoVersion implements Comparable<PromptoVersion> {
	
	public static final PromptoVersion LATEST = parseInt(0xFFFFFFFF);
	public static final PromptoVersion DEVELOPMENT = parseInt(0xEFEFEFEF);

	public static PromptoVersion parse(String literal) {
		if("latest".equals(literal))
			return LATEST;
		else if("development".equals(literal))
			return DEVELOPMENT;
		else
			return parsePrefixedSemanticVersion(literal);
	}
	
	public static PromptoVersion parsePrefixedSemanticVersion(String literal) {
		if(literal.startsWith("v"))
			literal = literal.substring(1);
		return parseSemanticVersion(literal);
	}
	
	public static PromptoVersion parseSemanticVersion(String literal) {
		String[] parts = literal.split("-");
		PromptoVersion version = parseVersionNumber(parts[0]);
		if(parts.length > 1)
			version.qualifier = parseQualifier(parts[1]);
		return version;
	}
	
	public static PromptoVersion parseVersionNumber(String literal) {
		String[] parts = literal.split("\\.");
		if(parts.length<2)
			throw new InvalidParameterException("Version number must be like 1.2{.3}!");
		try {
			PromptoVersion v = new PromptoVersion();
			v.major = Integer.parseInt(parts[0]);
			v.minor = Integer.parseInt(parts[1]);
			if(parts.length>2)
				v.fix = Integer.parseInt(parts[2]);
			return v;
		} catch(NumberFormatException e) {
			throw new InvalidParameterException("Version number must be like 1.2{.3}!");
		}
	}

	private static int parseQualifier(String literal) {
		switch(literal) {
		case "alpha":
			return -3;
		case "beta":
			return -2;
		case "candidate":
			return -1;
		default:
			throw new InvalidParameterException("Version qualifier must be 'alpha', 'beta' or 'candidate'!");
		}
	}

	public static PromptoVersion parseInt(int version) {
		PromptoVersion v = new PromptoVersion();
		v.major = version >> 24 & 0x000000FF;
		v.minor = version >> 16 & 0x000000FF;
		v.fix = version >> 8 & 0x000000FF;
		v.qualifier = version & 0x000000FF;
		// gracefully convert legacy versions
		if(v.fix==0 && v.qualifier>0) {
			v.fix = v.qualifier;
			v.qualifier = 0;
		}
		return v;
	}
	
	int major;
	int minor;
	int fix;
	int qualifier;
	
	@Override
	public String toString() {
		if(this==LATEST)
			return "latest";
		else if(this==DEVELOPMENT)
			return "development";
		else {
			StringBuilder sb = new StringBuilder("v")
				.append(major)
				.append('.')
				.append(minor);
			if(fix > 0) {
				sb.append('.')
					.append(fix);
			}
			if(qualifier < 0) {
				sb.append('-')
					.append(qualifierString());
			}
			return sb.toString();	
		}
	}

	private String qualifierString() {
		switch(qualifier) {
		case -3:
			return "alpha";
		case -2:
			return "beta";
		case -1:
			return "candidate";
		default:
			return "";
		}
	}

	public int asInt() {
		return major << 24 & 0xFF000000
			| minor << 16 & 0x00FF0000
			| fix & 0x0000FFFF;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PromptoVersion)
			return this.asInt() == ((PromptoVersion)obj).asInt();
		else
			return false;
	}

	@Override
	public int compareTo(PromptoVersion o) {
		return Integer.compare(this.asInt(), o.asInt());
	}

}
