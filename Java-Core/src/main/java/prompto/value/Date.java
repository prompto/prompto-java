package prompto.value;

import java.io.IOException;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.DateType;

public class Date extends BaseValue implements Comparable<Date> {

	public static Date Parse(String text) {
		LocalDate value = LocalDate.parse(text);
		return new Date(value);
	}

	LocalDate value;

	public Date(LocalDate value) {
		super(DateType.instance());
		this.value = value;

	}

	public Date(int year, int month, int day) {
		super(DateType.instance());
		value = new LocalDate(year, month, day);
	}

	public LocalDate getValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws PromptoError {
		if (value instanceof Period)
			return this.plus((Period) value);
		else
			throw new SyntaxError("Illegal: Date + "
					+ value.getClass().getSimpleName());
	}

	@Override
	public IValue Subtract(Context context, IValue value) throws PromptoError {
		if (value instanceof Date) {
			LocalDate other = ((Date) value).value;
			org.joda.time.Period result = new org.joda.time.Period(
					this.value.getYear() - other.getYear(),
					this.value.getMonthOfYear() - other.getMonthOfYear(), 0,
					this.value.getDayOfMonth() - other.getDayOfMonth(), 0, 0,
					0, 0);
			return new Period(result);
		} else if (value instanceof Period)
			return this.minus((Period) value);
		else
			throw new SyntaxError("Illegal: Date - "
					+ value.getClass().getSimpleName());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof Date)
			return this.value.compareTo(((Date) value).value);
		else
			throw new SyntaxError("Illegal comparison: Date - "
					+ value.getClass().getSimpleName());

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
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public Object ConvertTo(Class<?> type) {
		return value;
	}

	public Date minus(Period period) {
		return new Date(this.value.minus(period.value));
	}

	public Date toDateMidnight() {
		return this;
	}

	Date plus(Period period) {
		return new Date(this.value.plus(period.value));
	}

	public int compareTo(Date other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Date)
			return value.equals(((Date) obj).value);
		else
			return value.equals(obj);
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.toString("yyyy-MM-dd");
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator) throws IOException {
		generator.writeString(this.toString());
	}
}
