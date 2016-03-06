package prompto.compiler;

import java.rmi.UnexpectedException;
import java.util.HashMap;
import java.util.Map;

public abstract class CompilerUtils {

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

	static Map<Class<?>, String> descriptors = createDescriptorsMap();
	
	private static Map<Class<?>, String> createDescriptorsMap() {
		Map<Class<?>, String> map = new HashMap<>();
		map.put(byte.class, "B");
		map.put(char.class, "C");
		map.put(double.class, "D");
		map.put(float.class, "F");
		map.put(int.class, "I");
		map.put(long.class, "J");
		map.put(short.class, "S");
		map.put(boolean.class, "B");
		map.put(void.class, "V");
		return map;
	}

	public static String getDescriptor(Class<?> type) {
		/*
		B	byte	signed byte
		C	char	Unicode character code point in the Basic Multilingual Plane, encoded with UTF-16
		D	double	double-precision floating-point value
		F	float	single-precision floating-point value
		I	int	integer
		J	long	long integer
		L ClassName ;	reference	an instance of class ClassName
		S	short	signed short
		Z	boolean	true or false
		[	reference	one array dimension
		 */
		if(type.isArray())
			return "L" + getDescriptor(type.getComponentType());
		String s = descriptors.get(type);
		return s!=null ? s : "L" + getClassName(type) + ';';
	}

	public static String getClassName(Class<?> type) {
		return type.getName().replace('.', '/');
	}

	public static String createProto(Class<?>[] parameterTypes, Class<?> returnType) {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		for(Class<?> type : parameterTypes) {
			sb.append(getDescriptor(type));
		}
		sb.append(')');
		sb.append(getDescriptor(returnType));
		return sb.toString();
	}

}
