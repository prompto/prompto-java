package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.type.DateType;

public class DateValue extends BaseValue implements Comparable<DateValue> {

	public static DateValue Parse(String text) {
		PromptoDate value = PromptoDate.parse(text);
		return new DateValue(value);
	}

	PromptoDate value;

	public DateValue(PromptoDate date) {
		super(DateType.instance());
		this.value = date;

	}

	public DateValue(int year, int month, int day) {
		super(DateType.instance());
		value = new PromptoDate(year, month, day);
	}

	@Override
	public PromptoDate getStorableData() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof PeriodValue)
			return new DateValue(this.value.plus(((PeriodValue)value).value));
		else if (value instanceof TimeValue)
			return new DateTimeValue(this.value.plus(((TimeValue)value).value));
		else
			throw new SyntaxError("Illegal: Date + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof DateValue) {
			PromptoDate other = ((DateValue) value).value;
			PromptoPeriod result = this.value.minus(other);
			return new PeriodValue(result);
		} else if (value instanceof PeriodValue)
			return new DateValue(this.value.minus(((PeriodValue)value).value));
		else
			throw new SyntaxError("Illegal: Date - "
					+ value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof DateValue)
			return this.value.compareTo(((DateValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: Date - "
					+ value.getClass().getSimpleName());

	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("year".equals(name))
			return new IntegerValue(this.value.getNativeYear());
		else if ("month".equals(name))
			return new IntegerValue(this.value.getNativeMonth());
		else if ("dayOfMonth".equals(name))
			return new IntegerValue(this.value.getNativeDayOfMonth());
		else if ("dayOfYear".equals(name))
			return new IntegerValue(this.value.getNativeDayOfYear());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public Object toJavaValue(Context context, Type type) {
		if(type==PromptoDate.class)
			return value;
		else
			return super.toJavaValue(context, type);
	}

	public DateValue toDateMidnight() {
		return this;
	}

	@Override
	public int compareTo(DateValue other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DateValue)
			return value.equals(((DateValue) obj).value);
		else
			return value.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.format("yyyy-MM-dd");
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
				generator.writeString(DateType.instance().getTypeName());
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
