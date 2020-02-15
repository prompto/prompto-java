package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.type.TimeType;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;


public class TimeValue extends BaseValue implements Comparable<TimeValue> {
	public static TimeValue Parse(String text) {
		return new TimeValue(PromptoTime.parse(text));
	}

	PromptoTime value;

	public TimeValue(PromptoTime time) {
		super(TimeType.instance());
		this.value = time;
	}

	public TimeValue(int hours, int minutes, int seconds, int millis) {
		super(TimeType.instance());
		this.value = new PromptoTime(hours, minutes, seconds, millis);
	}

	@Override
	public PromptoTime getStorableData() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) {
		if (value instanceof PeriodValue)
			return new TimeValue(this.value.plus(((PeriodValue)value).value));
		else
			throw new SyntaxError("Illegal: Time + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof TimeValue)
			return new PeriodValue(this.value.minus(((TimeValue)value).value));
		else if (value instanceof PeriodValue)
			return new TimeValue(this.value.minus(((PeriodValue)value).value));
		else
			throw new SyntaxError("Illegal: Time - " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Context context, IValue value) {
		if (value instanceof TimeValue)
			return this.value.compareTo(((TimeValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: Time + " + value.getClass().getSimpleName());
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("hour".equals(name))
			return new IntegerValue(this.value.getNativeHour());
		else if ("minute".equals(name))
			return new IntegerValue(this.value.getNativeMinute());
		else if ("second".equals(name))
			return new IntegerValue(this.value.getNativeSecond());
		else if ("millisecond".equals(name))
			return new IntegerValue(this.value.getNativeMillis());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public Object convertTo(Context context, Type type) {
		return value;
	}

	public long getMillisOfDay() {
		return value.getNativeMillisOfDay();
	}

	@Override
	public int compareTo(TimeValue other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TimeValue)
			return value.equals(((TimeValue) obj).value);
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
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(TimeType.instance().getTypeName());
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
