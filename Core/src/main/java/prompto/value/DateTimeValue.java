package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

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
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.type.DateTimeType;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;


public class DateTimeValue extends BaseValue implements Comparable<DateTimeValue> {

	PromptoDateTime value;

	public DateTimeValue(PromptoDateTime dt) {
		super(DateTimeType.instance());
		this.value = dt;
	}

	public DateTimeValue(int year, int month, int day, int hour, int minute, int second) {
		super(DateTimeType.instance());
		this.value = new PromptoDateTime(year, month, day, hour, minute, second, 0);
	}

	public DateTimeValue(int year, int month, int day, int hour, int minute, int second, int milli) {
		super(DateTimeType.instance());
		this.value = new PromptoDateTime(year, month, day, hour, minute, second, milli);
	}

	public DateTimeValue(String value) {
		super(DateTimeType.instance());
		this.value = PromptoDateTime.parse(value);
	}

	@Override
	public PromptoDateTime getStorableData() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof PeriodValue)
			return new DateTimeValue(this.value.plus(((PeriodValue) value).value));
		else
			throw new SyntaxError("Illegal: DateTime + " + value.getClass().getSimpleName());
	}
	
	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		ResultInfo right = value.compile(context, method, flags);
		if(right.getType()!=PromptoPeriod.class)
			throw new SyntaxError("Illegal: DateTime + " + value.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoDateTime.class, "plus", 
				PromptoPeriod.class, PromptoDateTime.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoDateTime.class);
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTimeValue)
			return new PeriodValue(this.value.minus(((DateTimeValue)value).value));
		else if (value instanceof PeriodValue)
			return new DateTimeValue(this.value.minus(((PeriodValue)value).value));
		else
			throw new SyntaxError("Illegal: DateTime - " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		ResultInfo right = value.compile(context, method, flags);
		if(right.getType()==PromptoDateTime.class) {
			MethodConstant c = new MethodConstant(PromptoDateTime.class, "minus", 
					PromptoDateTime.class, PromptoPeriod.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			return new ResultInfo(PromptoPeriod.class);
		} else if(right.getType()==PromptoPeriod.class) {
			MethodConstant c = new MethodConstant(PromptoDateTime.class, "minus", 
					PromptoPeriod.class, PromptoDateTime.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			return new ResultInfo(PromptoDateTime.class);
		} else
			throw new SyntaxError("Illegal: DateTime - " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTimeValue)
			return this.value.compareTo(((DateTimeValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: DateTime + " + value.getClass().getSimpleName());

	}
	
	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoDateTime.class, 
				"compareTo", PromptoDateTime.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseValue.compileCompareToEpilogue(method, flags);
	}


	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("year".equals(name))
			return new IntegerValue(this.value.getYear());
		else if ("month".equals(name))
			return new IntegerValue(this.value.getNativeMonth());
		else if ("dayOfMonth".equals(name))
			return new IntegerValue(this.value.getNativeDayOfMonth());
		else if ("dayOfYear".equals(name))
			return new IntegerValue(this.value.getNativeDayOfYear());
		else if ("hour".equals(name))
			return new IntegerValue(this.value.getNativeHour());
		else if ("minute".equals(name))
			return new IntegerValue(this.value.getNativeMinute());
		else if ("second".equals(name))
			return new IntegerValue(this.value.getNativeSecond());
		else if ("millisecond".equals(name))
			return new IntegerValue(this.value.getNativeMillis());
		else if ("tzOffset".equals(name))
			return new IntegerValue(this.value.getNativeTzOffset());
		else if ("tzName".equals(name))
			return new TextValue(this.value.getTzName());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public Object convertTo(Context context, Type type) {
		return value;
	}

	@Override
	public int compareTo(DateTimeValue other) {
		return this.value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DateTimeValue)
			return value.equals(((DateTimeValue) obj).value);
		else
			return value.equals(obj);
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDateTime.class, 
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
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.textNode(this.toString());
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(DateTimeType.instance().getTypeName());
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
