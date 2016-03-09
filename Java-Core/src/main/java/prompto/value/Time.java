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
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.TimeType;

import com.fasterxml.jackson.core.JsonGenerator;


public class Time extends BaseValue implements Comparable<Time> {
	public static Time Parse(String text) {
		return new Time(PromptoTime.parse(text));
	}

	PromptoTime value;

	public Time(PromptoTime time) {
		super(TimeType.instance());
		this.value = time;
	}

	public Time(int hours, int minutes, int seconds, int millis) {
		super(TimeType.instance());
		this.value = new PromptoTime(hours, minutes, seconds, millis);
	}

	public PromptoTime getValue() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws SyntaxError {
		if (value instanceof Period)
			return new Time(this.value.plus(((Period)value).value));
		else
			throw new SyntaxError("Illegal: Time + " + value.getClass().getSimpleName());
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		ResultInfo right = exp.compile(context, method, false);
		if(right.getType()!=PromptoPeriod.class)
			throw new SyntaxError("Illegal: Date + " + exp.getClass().getSimpleName());
		MethodConstant oper = new MethodConstant(PromptoTime.class, "plus", PromptoPeriod.class, PromptoTime.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(PromptoTime.class, true);
	}
	
	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof Time)
			return new Period(this.value.minus(((Time)value).value));
		else if (value instanceof Period)
			return new Time(this.value.minus(((Period)value).value));
		else
			throw new SyntaxError("Illegal: Time - " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		ResultInfo right = exp.compile(context, method, false);
		if(right.getType()==PromptoTime.class) {
			MethodConstant oper = new MethodConstant(PromptoTime.class, "minus", 
					PromptoTime.class, PromptoPeriod.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoPeriod.class, true);
		} else if(right.getType()==PromptoPeriod.class) {
			MethodConstant oper = new MethodConstant(PromptoTime.class, "minus", PromptoPeriod.class, PromptoTime.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoTime.class, true);
			
		} else
			throw new SyntaxError("Illegal: Date + " + exp.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Context context, IValue value) throws SyntaxError {
		if (value instanceof Time)
			return this.value.compareTo(((Time) value).value);
		else
			throw new SyntaxError("Illegal comparison: Time + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("hour".equals(name))
			return new Integer(this.value.getNativeHour());
		else if ("minute".equals(name))
			return new Integer(this.value.getNativeMinute());
		else if ("second".equals(name))
			return new Integer(this.value.getNativeSecond());
		else if ("millis".equals(name))
			return new Integer(this.value.getNativeMillis());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public Object convertTo(Class<?> type) {
		return value;
	}

	public long getMillisOfDay() {
		return value.getNativeMillisOfDay();
	}

	@Override
	public int compareTo(Time other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Time)
			return value.equals(((Time) obj).value);
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
