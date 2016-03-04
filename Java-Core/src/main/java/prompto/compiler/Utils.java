package prompto.compiler;

import java.rmi.UnexpectedException;

abstract class Utils {

	static int getParamsCount(String proto) {
		int count = 0;
		while(proto.length()>0) {
			switch(proto.charAt(0)) {
			case '(':
			case '[':
				proto = proto.substring(1);
				continue;
			case ')':
				return count;
			case 'L':
				count++;
				proto = proto.substring(proto.indexOf(';') + 1);
				continue;
			default:
				count++;
				proto = proto.substring(1);
				continue;
			}
		}
		throw new CompilerException(new UnexpectedException("Should never get there"));
	}

}
