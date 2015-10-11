package prompto.value;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.DateTimeType;


public class DateTime extends BaseValue implements Comparable<DateTime> {

	org.joda.time.DateTime value;

	public DateTime(org.joda.time.DateTime value) {
		super(DateTimeType.instance());
		this.value = value;
	}

	public DateTime(int year, int month, int day, int hour, int minute, int second) {
		super(DateTimeType.instance());
		this.value = new org.joda.time.DateTime(year, month, day, hour, minute, second, 0);
	}

	public DateTime(int year, int month, int day, int hour, int minute, int second, int milli) {
		super(DateTimeType.instance());
		this.value = new org.joda.time.DateTime(year, month, day, hour, minute, second, milli);
	}

	public org.joda.time.DateTime getValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws PromptoError {
		if (value instanceof Period)
			return new DateTime(this.value.plus(((Period) value).value));
		else
			throw new SyntaxError("Illegal: DateTime + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Subtract(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTime) {
			long millis = this.value.getMillis();
			millis -= ((DateTime) value).value.getMillis();
			org.joda.time.Period result = new org.joda.time.Period(millis);
			if (result.getHours() > 24)
				result = new org.joda.time.Period(0, 0, 0, result.getHours() / 24, result.getHours() % 24, result.getMinutes(), result.getSeconds(), result.getMillis());
			return new Period(result);
		} else if (value instanceof Period)
			return this.minus((Period) value);
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
	public IValue getMember(Context context, Identifier id) throws PromptoError {
		String name = id.toString();
		if ("year".equals(name))
			return new Integer(this.value.getYear());
		else if ("month".equals(name))
			return new Integer(this.value.getMonthOfYear());
		else if ("dayOfMonth".equals(name))
			return new Integer(this.value.getDayOfMonth());
		else if ("dayOfYear".equals(name))
			return new Integer(this.value.getDayOfYear());
		else if ("hour".equals(name))
			return new Integer(this.value.getHourOfDay());
		else if ("minute".equals(name))
			return new Integer(this.value.getMinuteOfHour());
		else if ("second".equals(name))
			return new Integer(this.value.getSecondOfMinute());
		else if ("millis".equals(name))
			return new Integer(this.value.getMillisOfSecond());
		else if ("tzOffset".equals(name))
			return new Integer(this.value.getZone().toTimeZone().getRawOffset() / 1000);
		else if ("tzName".equals(name))
			return new Text(this.value.getZone().toTimeZone().getDisplayName(Locale.ENGLISH));
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public Object ConvertTo(Class<?> type) {
		return value;
	}

	public DateTime minus(Period period) {
		return new DateTime(this.value.minus(period.value));
	}

	DateTime plus(Period period) {
		return new DateTime(this.value.plus(period.value));
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
	public void toJson(Context context, JsonGenerator generator) throws IOException {
		generator.writeString(this.toString());
	}


}
