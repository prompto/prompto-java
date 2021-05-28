package prompto.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.intrinsic.PromptoList;

public abstract class JavaValueConverter {

	static Map<Class<?>, Function<MethodInfo, ResultInfo>> resultConverters = createResultConverters();
	
	private static Map<Class<?>, Function<MethodInfo, ResultInfo>> createResultConverters() {
		Map<Class<?>, Function<MethodInfo, ResultInfo>> map = new HashMap<>();
		map.put(boolean.class, CompilerUtils::booleanToBoolean);
		map.put(byte.class, CompilerUtils::intTolong); // no byte in the JVM
		map.put(Byte.class, CompilerUtils::ByteToLong);
		map.put(short.class, CompilerUtils::intToLong); // no short in the JVM
		map.put(short.class, CompilerUtils::ShortToLong);
		map.put(int.class, CompilerUtils::intToLong);
		map.put(Integer.class, CompilerUtils::IntegerToLong);
		map.put(long.class, CompilerUtils::longToLong);
		map.put(float.class, CompilerUtils::floatToDouble);
		map.put(Float.class, CompilerUtils::FloatToDouble);
		map.put(double.class, CompilerUtils::doubleToDouble);
		map.put(char.class, CompilerUtils::charToCharacter);
		map.put(List.class, JavaValueConverter::ListToPromptoList);
		return map;
	}

	
	public static ResultInfo convertResult(MethodInfo method, ResultInfo info) {
		Function<MethodInfo, ResultInfo> converter = resultConverters.get(info.getType());
		if(converter!=null)
			return converter.apply(method);
		else
			return info;
	}
	
	public static ResultInfo ListToPromptoList(MethodInfo method) {
		CompilerUtils.compileNewRawInstance(method, PromptoList.class);
		method.addInstruction(Opcode.DUP_X1); // need to keep a reference on top of stack
		method.addInstruction(Opcode.SWAP);
		method.addInstruction(Opcode.ICONST_0);
		return CompilerUtils.compileCallConstructor(method, PromptoList.class, Collection.class, boolean.class);
	}

	public static boolean canBeAutoboxed(Class<?> from, Class<?> to) {
		return canBeAutoboxed(from, to, true);
	}
	
	public static boolean canBeAutoboxed(Class<?> from, Class<?> to, boolean tryReverse) {
		return (from==char.class && to==Character.class)
			|| (from==boolean.class && to==Boolean.class)
			|| (from==long.class && to==Long.class)
			|| (from==double.class && to==Double.class)
			|| (tryReverse && canBeAutoboxed(to, from, false));
	}

	public static ResultInfo compileAutoboxing(MethodInfo method, ResultInfo from, Class<?> to) {
		if(from.getType()==to)
			return from;
		else if(from.getType()==char.class && to==Character.class)
			return CompilerUtils.charToCharacter(method);
		else if(from.getType()==Character.class && to==char.class)
			return CompilerUtils.CharacterTochar(method);
		else if(from.getType()==boolean.class && to==Boolean.class)
			return CompilerUtils.booleanToBoolean(method);
		else if(from.getType()==Boolean.class && to==boolean.class)
			return CompilerUtils.BooleanToboolean(method);
		else if(from.getType()==long.class && to==Long.class)
			return CompilerUtils.longToLong(method);
		else if(from.getType()==Long.class && to==long.class)
			return CompilerUtils.LongTolong(method);
		else if(from.getType()==double.class && to==Double.class)
			return CompilerUtils.doubleToDouble(method);
		else if(from.getType()==Double.class && to==double.class)
			return CompilerUtils.DoubleTodouble(method);
		else
			return from;
	}
	

}
