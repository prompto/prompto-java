package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Context;
import prompto.type.DateType;
import prompto.type.VersionType;

import com.fasterxml.jackson.core.JsonGenerator;

public class VersionValue extends BaseValue implements Comparable<VersionValue> {

	public static VersionValue Parse(String text) {
		PromptoVersion value = PromptoVersion.parse(text);
		return new VersionValue(value);
	}

	PromptoVersion value;

	public VersionValue(PromptoVersion value) {
		super(DateType.instance());
		this.value = value;

	}

	@Override
	public PromptoVersion getStorableData() {
		return value;
	}

	
	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof VersionValue)
			return this.value.compareTo(((VersionValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: Version - "
					+ value.getClass().getSimpleName());

	}
	
	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoVersion.class, 
				"compareTo", PromptoVersion.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseValue.compileCompareToEpilogue(method, flags);
	}



	@Override
	public Object convertTo(Context context, Type type) {
		return value;
	}

	@Override
	public int compareTo(VersionValue other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VersionValue)
			return value.equals(((VersionValue) obj).value);
		else
			return value.equals(obj);
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoVersion.class, 
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

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, Object instanceId, Identifier fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(VersionType.instance().getTypeName());
				generator.writeFieldName("value");
				generator.writeString(this.toString());
				generator.writeEndObject();
			} else
				generator.writeString(this.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
}
