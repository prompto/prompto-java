package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDateTime;
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
	
	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTimeValue)
			return new PeriodValue(this.value.minus(((DateTimeValue)value).value));
		else if (value instanceof PeriodValue)
			return new DateTimeValue(this.value.minus(((PeriodValue)value).value));
		else
			throw new SyntaxError("Illegal: DateTime - " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof DateTimeValue)
			return this.value.compareTo(((DateTimeValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: DateTime + " + value.getClass().getSimpleName());

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
		else if ("date".equals(name))
			return new DateValue(this.value.getDate());
		else if ("time".equals(name))
			return new TimeValue(this.value.getTime());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public Object toJavaValue(Context context, Type type) {
		if(type==PromptoDateTime.class)
			return value;
		else
			return super.toJavaValue(context, type);
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
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
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
	
	@Override
	public IValue toDocumentValue(Context context) {
		return new TextValue(this.toString());
	}


}
