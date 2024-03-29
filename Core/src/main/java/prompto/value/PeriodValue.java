package prompto.value;

import java.lang.reflect.Type;
import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.type.PeriodType;

public class PeriodValue extends BaseValue implements IMultiplyable {
	
	public static final PeriodValue ZERO = new PeriodValue(0, 0, 0, 0, 0, 0, 0, 0);

	PromptoPeriod value;

	public PeriodValue(long years, long months, long weeks, long days, long hours,
			long minutes, long seconds, long millis) {
		super(PeriodType.instance());
		value = new PromptoPeriod(years, months, weeks, days, hours, minutes,
				seconds, millis);
	}

	public PeriodValue(PromptoPeriod value) {
		super(PeriodType.instance());
		this.value = value;
	}

	@Override
	public PromptoPeriod getStorableData() {
		return value;
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
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof PeriodValue)
			return new PeriodValue(this.value.plus(((PeriodValue) value).value));
		else
			throw new SyntaxError("Illegal: Period + "
					+ value.getClass().getSimpleName());
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof PeriodValue)
			return new PeriodValue(this.value.minus(((PeriodValue) value).value));
		else
			throw new SyntaxError("Illegal: Period - "
					+ value.getClass().getSimpleName());
	}

	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue) {
			int count = (int) ((IntegerValue) value).longValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			if (count == 0)
				return PeriodValue.ZERO;
			if (count == 1)
				return this;
			return new PeriodValue(this.value.multiply(count));
		} else
			throw new SyntaxError("Illegal: Period * "
					+ value.getClass().getSimpleName());
	}
	
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("years".equals(name))
			return new IntegerValue(this.value.getNativeYears());
		else if ("months".equals(name))
			return new IntegerValue(this.value.getNativeMonths());
		else if ("weeks".equals(name))
			return new IntegerValue(this.value.getNativeWeeks());
		else if ("days".equals(name))
			return new IntegerValue(this.value.getNativeDays());
		else if ("hours".equals(name))
			return new IntegerValue(this.value.getNativeHours());
		else if ("minutes".equals(name))
			return new IntegerValue(this.value.getNativeMinutes());
		else if ("seconds".equals(name))
			return new IntegerValue(this.value.getNativeSeconds());
		else if ("milliseconds".equals(name))
			return new IntegerValue(this.value.getNativeMillis());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public Object toJavaValue(Context context, Type type) {
		if(type==PromptoPeriod.class)
			return value;
		else
			return super.toJavaValue(context, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PeriodValue)
			return this.value.equals(((PeriodValue) obj).value);
		else
			return false;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public IValue negate() {
		return new PeriodValue(value.negate());
	}

}
