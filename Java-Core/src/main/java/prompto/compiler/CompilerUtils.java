package prompto.compiler;

import java.rmi.UnexpectedException;
import java.util.HashMap;
import java.util.Map;

import prompto.grammar.Identifier;

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
		map.put(boolean.class, "Z");
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
			return "[" + getDescriptor(type.getComponentType());
		String s = descriptors.get(type);
		return s!=null ? s : "L" + getClassName(type) + ';';
	}

	public static String getClassName(Class<?> type) {
		return type.getName().replace('.', '/');
	}

	public static String createProto(Class<?> ... types) {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		for(int i=0;i<types.length-1;i++)
			sb.append(getDescriptor(types[i]));
		sb.append(')');
		sb.append(getDescriptor(types[types.length-1]));
		return sb.toString();
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

	static final char PROMPTO_CHAR = 'π';
	static final char METHOD_CHAR = 'µ';
	static final char CLASS_CHAR = 'χ';

	public static String getGlobalMethodClassName(Identifier id, boolean useSlash) {
		return CompilerUtils.getGlobalMethodClassName(id.getName(), useSlash);
	}

	public static String getGlobalMethodClassName(String name, boolean useSlash) {
		return useSlash ?
				"" + PROMPTO_CHAR + '/' + METHOD_CHAR + '/' + name
				: "" + PROMPTO_CHAR + '.' + METHOD_CHAR + '.' + name;
	}
	
	public static ResultInfo booleanToBoolean(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Boolean.class), 
				"valueOf",
				CompilerUtils.createProto(boolean.class, Boolean.class));
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Boolean.class, true);
	}

	public static ResultInfo ByteToLong(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Byte.class), 
				"longValue",
				CompilerUtils.createProto(Long.class));
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return longToLong(method);
	}

	public static ResultInfo ShortToLong(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Short.class), 
				"longValue",
				CompilerUtils.createProto(Long.class));
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return longToLong(method);
	}

	public static ResultInfo intToLong(MethodInfo method) {
		method.addInstruction(Opcode.I2L);
		return longToLong(method);
	}

	public static ResultInfo IntegerToLong(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Integer.class), 
				"longValue",
				CompilerUtils.createProto(long.class));
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return longToLong(method);
	}

	public static ResultInfo longToLong(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Long.class), 
				"valueOf",
				CompilerUtils.createProto(long.class, Long.class));
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Long.class, true);
	}
	
	public static ResultInfo floatToDouble(MethodInfo method) {
		method.addInstruction(Opcode.F2D);
		return doubleToDouble(method);
	}

	public static ResultInfo FloatToDouble(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Float.class), 
				"doubleValue",
				CompilerUtils.createProto(Double.class));
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return doubleToDouble(method);
	}

	public static ResultInfo doubleToDouble(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Double.class), 
				"valueOf",
				CompilerUtils.createProto(double.class, Double.class));
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Double.class, true);
	}

	public static ResultInfo charToCharacter(MethodInfo method) {
		Operand oper = new MethodConstant(
				CompilerUtils.getClassName(Character.class), 
				"valueOf",
				CompilerUtils.createProto(char.class, Character.class));
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Character.class, true);
	}

}
