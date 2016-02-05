package prompto.value;

import java.io.IOException;

import org.joda.time.LocalTime;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.TimeType;


public class Time extends BaseValue implements Comparable<Time> {
	public static Time Parse(String text) {
		return new Time(LocalTime.parse(text));
	}

	LocalTime value;

	public Time(LocalTime value) {
		super(TimeType.instance());
		this.value = value;
	}

	public Time(int hours, int minutes, int seconds, int millis) {
		super(TimeType.instance());
		this.value = new LocalTime(hours, minutes, seconds, millis);
	}

	public LocalTime getValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws SyntaxError {
		if (value instanceof Period)
			return new Time(this.value.plus(((Period) value).value));
		else
			throw new SyntaxError("Illegal: Time + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Subtract(Context context, IValue value) throws PromptoError {
		if (value instanceof Time) {
			LocalTime other = ((Time) value).value;
			org.joda.time.Period res = new org.joda.time.Period(0, 0, 0, 0, this.value.getHourOfDay() - other.getHourOfDay(), this.value.getMinuteOfHour() - other.getMinuteOfHour(), this.value.getSecondOfMinute() - other.getSecondOfMinute(), this.value.getMillisOfSecond()
					- other.getMillisOfSecond());
			return new Period(res);
		} else if (value instanceof Period)
			return this.minus((Period) value);
		else
			throw new SyntaxError("Illegal: Time - " + value.getClass().getSimpleName());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws SyntaxError {
		if (value instanceof Time)
			return this.value.compareTo(((Time) value).value);
		else
			throw new SyntaxError("Illegal comparison: Time + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("hour".equals(name))
			return new Integer(this.value.getHourOfDay());
		else if ("minute".equals(name))
			return new Integer(this.value.getMinuteOfHour());
		else if ("second".equals(name))
			return new Integer(this.value.getSecondOfMinute());
		else if ("millis".equals(name))
			return new Integer(this.value.getMillisOfSecond());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public Object ConvertTo(Class<?> type) {
		return value;
	}

	public Time minus(Period period) {
		return new Time(value.minus(period.value));
	}

	public long getMillisOfDay() {
		return value.getMillisOfDay();
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
