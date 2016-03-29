package prompto.compiler;

import java.lang.reflect.Type;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import prompto.declaration.AttributeInfo;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IType.Family;

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

	static Map<Type, String> descriptors = createDescriptorsMap();
	
	private static Map<Type, String> createDescriptorsMap() {
		Map<Type, String> map = new HashMap<>();
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

	public static String getDescriptor(Type type) {
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
		if(type instanceof Class<?> && ((Class<?>)type).isArray())
			return "[" + getDescriptor(((Class<?>)type).getComponentType());
		String s = descriptors.get(type);
		return s!=null ? s : "L" + makeClassName(type) + ';';
	}

	public static String makeClassName(Type type) {
		return makeClassName(type.getTypeName());
	}

	public static String makeClassName(String name) {
		return name.replace('.', '/');
	}

	public static String createProto(Type ... types) {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		for(int i=0;i<types.length-1;i++)
			sb.append(getDescriptor(types[i]));
		sb.append(')');
		sb.append(getDescriptor(types[types.length-1]));
		return sb.toString();
	}
	
	public static Descriptor.Method createMethodDescriptor(Context context, ArgumentList arguments, IType returnType) {
		List<Type> argTypes = new ArrayList<>();
		arguments.forEach((arg)->argTypes.add(arg.getJavaType(context)));
		return new Descriptor.Method(argTypes.toArray(new Type[argTypes.size()]), returnType.getJavaType());
	}

	public static String createProto(Type[] parameterTypes, Type returnType) {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		for(Type type : parameterTypes) {
			sb.append(getDescriptor(type));
		}
		sb.append(')');
		sb.append(getDescriptor(returnType));
		return sb.toString();
	}

	public static final char PROMPTO_CHAR = 'π';
	public static final String INNER_SEPARATOR = "$%";

	public static final String GLOBAL_METHOD_PACKAGE_PREFIX = "π.µ.";
	public static final String CATEGORY_PACKAGE_PREFIX = "π.χ.";
	public static final String CATEGORY_ENUM_PACKAGE_PREFIX = "π.ε.";
	public static final String NATIVE_ENUM_PACKAGE_PREFIX = "π.η.";

	public static Type getGlobalMethodType(Identifier id) {
		return CompilerUtils.getGlobalMethodType(id.toString());
	}

	public static Type getGlobalMethodType(String name) {
		return new PromptoType(GLOBAL_METHOD_PACKAGE_PREFIX + name);
	}
	
	public static Type concreteTypeFrom(String fullName) {
		int idx = fullName.indexOf('$');
		if(idx<0)
			fullName += INNER_SEPARATOR + categorySimpleNameFrom(fullName);
		return new PromptoType(fullName);
	}

	public static Type abstractTypeFrom(String fullName) {
		return interfaceTypeFrom(fullName);
	}
	
	public static Type singletonTypeFrom(String fullName) {
		return interfaceTypeFrom(fullName);
	}
	
	public static Type interfaceTypeFrom(String fullName) {
		int idx = fullName.indexOf(INNER_SEPARATOR);
		if(idx>=0)
			fullName = fullName.substring(0, idx);
		return new PromptoType(fullName);
	}

	public static String categorySimpleNameFrom(String fullName) {
		String simpleName = fullName.substring(CATEGORY_PACKAGE_PREFIX.length());
		int idx = simpleName.indexOf(INNER_SEPARATOR);
		if(idx>=0)
			simpleName = simpleName.substring(idx + INNER_SEPARATOR.length()); 
		return simpleName;
	}
	
	public static String categoryEnumSimpleNameFrom(String fullName) {
		String simpleName =  fullName.substring(CATEGORY_ENUM_PACKAGE_PREFIX.length());
		int idx = simpleName.indexOf(INNER_SEPARATOR);
		if(idx>=0)
			simpleName = simpleName.substring(idx + INNER_SEPARATOR.length()); 
		return simpleName;
	}
	
	public static String nativeEnumSimpleNameFrom(String fullName) {
		String simpleName =  fullName.substring(NATIVE_ENUM_PACKAGE_PREFIX.length());
		int idx = simpleName.indexOf(INNER_SEPARATOR);
		if(idx>=0)
			simpleName = simpleName.substring(idx + INNER_SEPARATOR.length()); 
		return simpleName;
	}
	
	public static Type getCategoryInterfaceType(Identifier id) {
		return getCategoryInterfaceType(id.toString());
	}

	public static Type getCategorySingletonType(Identifier id) {
		return getCategoryInterfaceType(id.toString());
	}
	
	public static Type getCategoryConcreteType(Identifier id) {
		return getCategoryConcreteType(id.toString());
	}
	
	public static Type getCategoryInterfaceType(String name) {
		return new PromptoType(CATEGORY_PACKAGE_PREFIX + name);
	}
	
	public static Type getCategoryConcreteType(String name) {
		return new PromptoType(CATEGORY_PACKAGE_PREFIX + name + INNER_SEPARATOR + name);
	}
	
	public static Type getCategoryEnumInterfaceType(Identifier id) {
		return getCategoryEnumInterfaceType(id.toString());
	}

	public static Type getCategoryEnumConcreteType(Identifier id) {
		return getCategoryEnumConcreteType(id.toString());
	}

	public static Type getNativeEnumType(Identifier id) {
		return getNativeEnumType(id.toString());
	}

	public static Type getNativeEnumType(String name) {
		return new PromptoType(NATIVE_ENUM_PACKAGE_PREFIX + name);
	}

	public static Type getCategoryEnumInterfaceType(String name) {
		return new PromptoType(CATEGORY_ENUM_PACKAGE_PREFIX + name);
	}

	public static Type getCategoryEnumConcreteType(String name) {
		return new PromptoType(CATEGORY_ENUM_PACKAGE_PREFIX + name + INNER_SEPARATOR + name);
	}

	public static ResultInfo reverseBoolean(MethodInfo method) {
		// perform 1-0
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.SWAP);
		method.addInstruction(Opcode.ISUB);
		return new ResultInfo(boolean.class);
	}

	public static ResultInfo booleanToBoolean(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Boolean.class, 
				"valueOf",
				boolean.class, Boolean.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Boolean.class);
	}
	
	public static ResultInfo BooleanToboolean(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Boolean.class, 
				"booleanValue",
				boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(boolean.class);
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
		return new ResultInfo(long.class);
	}

	public static ResultInfo intToLong(MethodInfo method) {
		method.addInstruction(Opcode.I2L);
		return longToLong(method);
	}

	public static ResultInfo longToint(MethodInfo method) {
		method.addInstruction(Opcode.L2I);
		return new ResultInfo(int.class);
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
		return new ResultInfo(Long.class);
	}
	
	public static ResultInfo longTodouble(MethodInfo method) {
		method.addInstruction(Opcode.L2D);
		return new ResultInfo(double.class);
	}

	public static ResultInfo doubleTolong(MethodInfo method) {
		method.addInstruction(Opcode.D2L);
		return new ResultInfo(long.class);
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
		return new ResultInfo(double.class);
	}

	public static ResultInfo LongTolong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Long.class, 
				"longValue",
				long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(long.class);
	}

	public static ResultInfo LongToint(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Long.class, 
				"intValue",
				int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(int.class);
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
		return new ResultInfo(double.class);
	}

	public static ResultInfo DoubleTolong(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Double.class, 
				"longValue",
				long.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(long.class);
	}

	public static ResultInfo longToDouble(MethodInfo method) {
		method.addInstruction(Opcode.L2D);
		return doubleToDouble(method);
	}
	
	public static ResultInfo doubleToDouble(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Double.class, 
				"valueOf",
				double.class, Double.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Double.class);
	}

	public static void numberToPrimitive(MethodInfo method, ResultInfo info, boolean toDecimal) {
		if(toDecimal)
			numberTodouble(method, info);
		else	
			numberTolong(method, info);
	}
	
	public static ResultInfo numberTodouble(MethodInfo method, ResultInfo info) {
		 if(double.class==info.getType())
			return info;
		 else if(long.class==info.getType())
			return longTodouble(method);
		else if(Long.class==info.getType())
			return LongTodouble(method);
		else if(Double.class==info.getType())
			return DoubleTodouble(method);
		else
			throw new CompilerException("Cannot convert " + info.getType().getTypeName() + " to double");
	}

	public static ResultInfo numberTolong(MethodInfo method, ResultInfo info) {
		 if(long.class==info.getType())
			return info;
		 else if(double.class==info.getType())
			return doubleTolong(method);
		else if(Long.class==info.getType())
			return LongTolong(method);
		else if(Double.class==info.getType())
			return DoubleTolong(method);
		else
			throw new CompilerException("Cannot convert " + info.getType().getTypeName() + " to long");
	}

	public static ResultInfo numberToint(MethodInfo method, ResultInfo info) {
		numberTolong(method, info);
		return longToint(method);
	}

	public static ResultInfo charToCharacter(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Character.class, 
				"valueOf",
				char.class, Character.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Character.class);
	}
	
	public static ResultInfo charToString(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Character.class, 
				"toString",
				char.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class);
	}

	public static ResultInfo CharacterTochar(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Character.class, 
				"charValue",
				char.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(char.class);
	}
	
	public static ResultInfo CharacterToString(MethodInfo method) {
		IOperand oper = new MethodConstant(
				Character.class, 
				"toString",
				String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(String.class);
	}

	public static ResultInfo compileNewRawInstance(MethodInfo method, Type klass) {
		IOperand c = new ClassConstant(klass);
		method.addInstruction(Opcode.NEW, c);
		return new ResultInfo(klass);
	}
	
	public static ResultInfo compileCallConstructor(MethodInfo method, Type klass, Type ... params) {
		Descriptor.Method desc = new Descriptor.Method(params, void.class);
		IOperand c = new MethodConstant(klass, "<init>", desc);
		method.addInstruction(Opcode.INVOKESPECIAL, c);
		return new ResultInfo(klass);
	}
	
	public static ResultInfo compileNewInstance(MethodInfo method, Type klass) {
		compileNewRawInstance(method, klass);
		method.addInstruction(Opcode.DUP); // need to keep a reference on top of stack
		return compileCallConstructor(method, klass);
	}

	public static Type getCategoryClass(Identifier identifier) {
		return getCategoryClass(identifier.toString());
	}

	public static Type getCategoryClass(String name) {
		name = name.replace('.', '/');
		return new PromptoType(name);
	}

	public static String setterName(String name) {
		return "set" + name.substring(0,1).toUpperCase() + name.substring(1);
	}

	public static String getterName(String name) {
		return "get" + name.substring(0,1).toUpperCase() + name.substring(1);
	}

	public static MethodInfo compileEmptyConstructor(ClassFile classFile) {
		Descriptor proto = new Descriptor.Method(void.class);
		MethodInfo method = classFile.newMethod("<init>", proto);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_UninitializedThis, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", void.class);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		method.addInstruction(Opcode.RETURN);
		return method;
	}

	public static void compileJavaEnum(Context context, MethodInfo method, Flags flags, Enum<?> value) {
		method.addInstruction(Opcode.GETSTATIC, 
				new FieldConstant(value.getClass(), value.name(), value.getClass()));
	}

	public static void compileAttributeInfo(Context context, MethodInfo method, Flags flags, AttributeInfo info) {
		compileNewRawInstance(method, AttributeInfo.class);
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.LDC, new StringConstant(info.getName()));
		compileJavaEnum(context, method, flags, info.getFamily());
		method.addInstruction(info.isCollection() ? Opcode.ICONST_1 : Opcode.ICONST_0);
		method.addInstruction(info.isKey() ? Opcode.ICONST_1 : Opcode.ICONST_0);
		method.addInstruction(info.isValue() ? Opcode.ICONST_1 : Opcode.ICONST_0);
		method.addInstruction(info.isWords() ? Opcode.ICONST_1 : Opcode.ICONST_0);
		compileCallConstructor(method, AttributeInfo.class,
				String.class, Family.class, boolean.class, 
				boolean.class, boolean.class, boolean.class);
	}

	public static ResultInfo compileALOAD(MethodInfo method, String localName) {
		StackLocal value = method.getRegisteredLocal(localName);
		return compileALOAD(method, value);
	}
	
	public static ResultInfo compileALOAD(MethodInfo method, StackLocal value) {
		ClassConstant klass = value instanceof StackLocal.ObjectLocal ?
				((StackLocal.ObjectLocal)value).getClassName() :
				new ClassConstant(Object.class);
		if(value.getIndex()<4) {
			Opcode opcode = Opcode.values()[value.getIndex()+Opcode.ALOAD_0.ordinal()];
			method.addInstruction(opcode, klass);
		} else if(value.getIndex()<255)
			method.addInstruction(Opcode.ALOAD, new ByteOperand((byte)value.getIndex()), klass);
		else
			throw new UnsupportedOperationException();
		return new ResultInfo(klass.getType());
	}

	public static void compileASTORE(MethodInfo method, StackLocal value) {
		ClassConstant klass = value instanceof StackLocal.ObjectLocal ?
				((StackLocal.ObjectLocal)value).getClassName() :
				new ClassConstant(Object.class);
		if(value.getIndex()<4) {
			Opcode opcode = Opcode.values()[value.getIndex() + Opcode.ASTORE_0.ordinal()];
			method.addInstruction(opcode, klass);
		} else if(value.getIndex()<255)
			method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)value.getIndex()), klass);
		else
			throw new UnsupportedOperationException();
	}






}
