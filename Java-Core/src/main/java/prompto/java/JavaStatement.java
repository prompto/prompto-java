package prompto.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import prompto.compiler.Compiler;
import prompto.compiler.MethodConstant;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.runtime.VoidResult;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class JavaStatement {

	JavaExpression expression;
	boolean isReturn;
	
	public JavaStatement(JavaExpression expression,boolean isReturn) {
		this.expression = expression;
		this.isReturn = isReturn;
	}

	public IType check(Context context, IType returnType) throws SyntaxError {
		IType type = expression.check(context);
		if(type instanceof JavaClassType) 
			type = ((JavaClassType)type).convertJavaClassToPromptoType(context, returnType);
		return isReturn ? type : VoidType.instance();
	}

	public IValue interpret(Context context, IType returnType) throws PromptoError {
		Object result = expression.interpret(context);
		if(result==null) 
			return isReturn ? VoidResult.instance() : null;
		else {	
            IType type = expression.check(context);
            if (type instanceof JavaClassType)
                return ((JavaClassType)type).convertJavaValueToPromptoValue(context, result, returnType);
            else
            	// TODO warning or exception?
            	return VoidResult.instance();
		}
	}
	
	@Override
	public String toString() {
		return "" + (isReturn ? "return " : "") + expression.toString() + ";";
	}

	public void toDialect(CodeWriter writer) {
		if(isReturn)
			writer.append("return ");
		expression.toDialect(writer);
		writer.append(';');
	}

	static Map<Class<?>, Function<MethodInfo, ResultInfo>> resultConverters = createResultConverters();
	static Map<Class<?>, Function<MethodInfo, ResultInfo>> resultConsumers = createResultConsumers();
	
	private static Map<Class<?>, Function<MethodInfo, ResultInfo>> createResultConverters() {
		Map<Class<?>, Function<MethodInfo, ResultInfo>> map = new HashMap<>();
		map.put(boolean.class, JavaStatement::booleanToBoolean);
		// map.put(byte.class, JavaStatement::byteToLong);
		// map.put(Byte.class, JavaStatement::ByteToLong);
		// map.put(short.class, JavaStatement::shortToLong);
		// map.put(short.class, JavaStatement::ShortToLong);
		map.put(int.class, JavaStatement::intToLong);
		// map.put(Integer.class, JavaStatement::IntgerToLong);
		map.put(long.class, JavaStatement::longToLong);
		// map.put(float.class, JavaStatement::floatToDouble);
		// map.put(Float.class, JavaStatement::FloatToDouble);
		// map.put(double.class, JavaStatement::doubleToDouble);
		return map;
	}
	
	private static Map<Class<?>, Function<MethodInfo, ResultInfo>> createResultConsumers() {
		Map<Class<?>, Function<MethodInfo, ResultInfo>> map = new HashMap<>();
		return map;
	}

	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		ResultInfo info = expression.compile(context, compiler, method);
		if(isReturn) {
			if(info.getType()==void.class)
				throw new SyntaxError("Cannot return void!"); // TODO add a test to ensure this has been caught earlier
			// convert native type to object type
			Function<MethodInfo, ResultInfo> converter = resultConverters.get(info.getType());
			if(converter!=null)
				info = converter.apply(method);
			method.addInstruction(Opcode.ARETURN);
			return info;
		} else if(info.getType()!=void.class) {
			Function<MethodInfo, ResultInfo> consumer = resultConsumers.get(info.getType());
			if(consumer!=null)
				info = consumer.apply(method);
			else
				method.addInstruction(Opcode.POP);
			return new ResultInfo(void.class, false);
		} else
			return info;
	}

	private static ResultInfo booleanToBoolean(MethodInfo method) {
		Operand oper = new MethodConstant("java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Boolean.class, true);
	}

	private static ResultInfo intToLong(MethodInfo method) {
		method.addInstruction(Opcode.I2L);
		return longToLong(method);
	}

	private static ResultInfo longToLong(MethodInfo method) {
		Operand oper = new MethodConstant("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(Boolean.class, true);
	}
}
