package prompto.compiler;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;

public abstract class CompilerUtils {

	static String[] parseDescriptor(String proto) {
		List<String> params = new ArrayList<>(); 
		while(proto.length()>0) {
			switch(proto.charAt(0)) {
			case '(':
			case '[':
				proto = proto.substring(1);
				continue;
			case ')':
				params.add(proto.substring(1));
				return params.toArray(new String[params.size()]);
			case 'L':
				int idx = proto.indexOf(';') + 1;
				params.add(proto.substring(0, idx));
				proto = proto.substring(idx);
				continue;
			default:
				params.add(proto.substring(0, 1));
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
	
	public static String createProto(Context context, ArgumentList arguments, IType returnType) {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		arguments.forEach((arg)->sb.append(arg.getJavaDescriptor(context)));
		sb.append(')');
		sb.append(returnType.getJavaDescriptor(context));
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
		IOperand oper = new MethodConstant(
				Boolean.class, 
				"valueOf",
				boolean.class, Boolean.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Boolean.class, true);
	}
	
	public static ResultInfo BooleanToboolean(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Boolean.class, 
				"booleanValue",
				boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(boolean.class, true);
	}

	public static ResultInfo ByteToLong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Byte.class, 
				"longValue",
				Long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return longToLong(method);
	}

	public static ResultInfo ShortToLong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Short.class, 
				"longValue",
				Long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return longToLong(method);
	}

	public static ResultInfo intTolong(MethodInfo method) {
		method.addInstruction(Opcode.I2L);
		return new ResultInfo(long.class, true);
	}

	public static ResultInfo intToLong(MethodInfo method) {
		method.addInstruction(Opcode.I2L);
		return longToLong(method);
	}

	public static ResultInfo longToint(MethodInfo method) {
		method.addInstruction(Opcode.L2I);
		return new ResultInfo(int.class, true);
	}

	public static ResultInfo IntegerToLong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Integer.class, 
				"longValue",
				long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return longToLong(method);
	}

	public static ResultInfo longToLong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Long.class, 
				"valueOf",
				long.class, Long.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Long.class, true);
	}
	
	public static ResultInfo longTodouble(MethodInfo method) {
		method.addInstruction(Opcode.L2D);
		return new ResultInfo(double.class, false);
	}

	public static ResultInfo doubleTolong(MethodInfo method) {
		method.addInstruction(Opcode.D2L);
		return new ResultInfo(long.class, false);
	}

	public static ResultInfo floatToDouble(MethodInfo method) {
		method.addInstruction(Opcode.F2D);
		return doubleToDouble(method);
	}

	public static ResultInfo FloatToDouble(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Float.class, 
				"doubleValue",
				Double.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return doubleToDouble(method);
	}

	public static ResultInfo LongTodouble(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Long.class, 
				"doubleValue",
				double.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(double.class, true);
	}

	public static ResultInfo LongTolong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Long.class, 
				"longValue",
				long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(long.class, true);
	}

	public static ResultInfo LongToint(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Long.class, 
				"intValue",
				int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(int.class, true);
	}

	public static ResultInfo LongToDouble(MethodInfo method) {
		LongTodouble(method);
		return doubleToDouble(method);
	}

	public static ResultInfo DoubleTodouble(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Double.class, 
				"doubleValue",
				double.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(double.class, true);
	}

	public static ResultInfo DoubleTolong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Double.class, 
				"longValue",
				long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(long.class, true);
	}

	public static ResultInfo doubleToDouble(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Double.class, 
				"valueOf",
				double.class, Double.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Double.class, true);
	}

	public static void numberToNative(MethodInfo method, ResultInfo info, boolean toDecimal) {
		if(toDecimal)
			numberTodouble(method, info);
		else	
			numberTolong(method, info);
	}
	
	public static void numberTodouble(MethodInfo method, ResultInfo info) {
		 if(info.getType()==long.class)
			longTodouble(method);
		else if(info.getType()==Long.class)
			LongTodouble(method);
		else if(info.getType()==Double.class)
			DoubleTodouble(method);
	}

	public static void numberTolong(MethodInfo method, ResultInfo info) {
		if(double.class==info.getType())
			doubleTolong(method);
		else if(Long.class==info.getType())
			LongTolong(method);
		else if(Double.class==info.getType())
			DoubleTolong(method);
	}

	public static ResultInfo charToCharacter(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Character.class, 
				"valueOf",
				char.class, Character.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Character.class, true);
	}

	public static ResultInfo CharacterTochar(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Character.class, 
				"charValue",
				char.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(char.class, true);
	}

	public static ResultInfo newInstance(MethodInfo method, Class<?> klass, Class<?> ... params) {
		IOperand c = new ClassConstant(klass);
		method.addInstruction(Opcode.NEW, c);
		// call constructor
		method.addInstruction(Opcode.DUP); // need to keep a reference on top of stack
		c = new MethodConstant(getClassName(klass), "<init>", createProto(params, void.class));
		method.addInstruction(Opcode.INVOKESPECIAL, c);
		// done
		return new ResultInfo(klass, true);
	}

}
