package prompto.value;

import java.io.IOException;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.DateTimeType;

import com.fasterxml.jackson.core.JsonGenerator;


public class DateTime extends BaseValue implements Comparable<DateTime> {

	PromptoDateTime value;

	public DateTime(PromptoDateTime dt) {
		super(DateTimeType.instance());
		this.value = dt;
	}

	public DateTime(int year, int month, int day, int hour, int minute, int second) {
		super(DateTimeType.instance());
		this.value = new PromptoDateTime(year, month, day, hour, minute, second, 0);
	}

	public DateTime(int year, int month, int day, int hour, int minute, int second, int milli) {
		super(DateTimeType.instance());
		this.value = new PromptoDateTime(year, month, day, hour, minute, second, milli);
	}

	public DateTime(String value) {
		super(DateTimeType.instance());
		this.value = PromptoDateTime.parse(value);
	}

	public PromptoDateTime getValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws PromptoError {
		if (value instanceof Period)
			return new DateTime(this.value.plus(((Period) value).value));
		else
			throw new SyntaxError("Illegal: DateTime + " + value.getClass().getSimpleName());
	}
	
	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression value, boolean toNative) throws SyntaxError {
		ResultInfo right = value.compile(context, method, false);
		if(right.getType()!=PromptoPeriod.class)
			throw new SyntaxError("Illegal: DateTime + " + value.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoDateTime.class, "plus", 
				PromptoPeriod.class, PromptoDateTime.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoDateTime.class, true);
	}
	


	@Override
	public IValue Subtract(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTime) {
			long millis = this.value.toJavaTime();
			millis -= ((DateTime) value).value.toJavaTime();
			PromptoPeriod result = new PromptoPeriod(millis);
			if (result.getNativeHours() > 24)
				result = new PromptoPeriod(0, 0, 0, 
						result.getNativeHours() / 24, 
						result.getNativeHours() % 24, 
						result.getNativeMinutes(), 
						result.getNativeSeconds(), 
						result.getNativeMillis());
			return new Period(result);
		} else if (value instanceof Period)
			return new DateTime(this.value.minus(((Period)value).getValue()));
		else
			throw new SyntaxError("Illegal: DateTime - " + value.getClass().getSimpleName());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTime)
			return this.value.compareTo(((DateTime) value).value);
		else
			throw new SyntaxError("Illegal comparison: DateTime + " + value.getClass().getSimpleName());

	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("year".equals(name))
			return new Integer(this.value.getYear());
		else if ("month".equals(name))
			return new Integer(this.value.getNativeMonth());
		else if ("dayOfMonth".equals(name))
			return new Integer(this.value.getNativeDayOfMonth());
		else if ("dayOfYear".equals(name))
			return new Integer(this.value.getNativeDayOfYear());
		else if ("hour".equals(name))
			return new Integer(this.value.getNativeHour());
		else if ("minute".equals(name))
			return new Integer(this.value.getNativeMinute());
		else if ("second".equals(name))
			return new Integer(this.value.getNativeSecond());
		else if ("millis".equals(name))
			return new Integer(this.value.getNativeMillis());
		else if ("tzOffset".equals(name))
			return new Integer(this.value.getNativeTzOffset());
		else if ("tzName".equals(name))
			return new Text(this.value.getTzName());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public Object convertTo(Class<?> type) {
		return value;
	}

	public int compareTo(DateTime other) {
		return this.value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DateTime)
			return value.equals(((DateTime) obj).value);
		else
			return value.equals(obj);
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
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeString(this.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
	}


}
