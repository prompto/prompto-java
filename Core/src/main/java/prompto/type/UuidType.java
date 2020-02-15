package prompto.type;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.NullValue;

import com.fasterxml.jackson.databind.JsonNode;

public class UuidType extends NativeType {

	static UuidType instance = new UuidType();
	
	public static UuidType instance() {
		return instance;
	}
	
	private UuidType() {
		super(Family.UUID);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return UUID.class;
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		if(value.isNull())
			return NullValue.instance();
		else
			return new prompto.value.UuidValue(value.asText());
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		return new prompto.value.UuidValue((UUID)value);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("UUID");
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("UUID");
	}

	@Override
	public void transpileCode(Transpiler transpiler) {
		transpiler.append(".toString()");
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				UUID.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
}