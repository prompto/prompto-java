package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.DivideByZeroError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.DecimalType;

public class DecimalValue extends BaseValue implements INumber, Comparable<INumber>, IMultiplyable {
	
	public static DecimalValue Parse(String text) {
		return new DecimalValue(Double.parseDouble(text));
	}

	double value;

	public DecimalValue(double value) {
		super(DecimalType.instance());
		this.value = value;
	}
	
	@Override
	public Double getStorableData() {
		return value;
	}

	@Override
	public long longValue() {
		return (long) value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) {
		if (value instanceof IntegerValue)
			return new DecimalValue(this.value + ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return new DecimalValue(this.value + ((DecimalValue) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Decimal + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue minus(Context context, IValue value) {
		if (value instanceof IntegerValue)
			return new DecimalValue(this.value - ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return new DecimalValue(this.value - ((DecimalValue) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Decimal - " + value.getClass().getSimpleName());
	}

	@Override
	public IValue multiply(Context context, IValue value) {
		if (value instanceof IntegerValue)
			return new DecimalValue(this.doubleValue() * ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return new DecimalValue(this.doubleValue() * ((DecimalValue) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Decimal * " + value.getClass().getSimpleName());
	}

	@Override
	public IValue divide(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new DecimalValue(this.doubleValue() / ((INumber) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Decimal / " + value.getClass().getSimpleName());
	}
	
	@Override
	public IValue intDivide(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue) {
			if (((IntegerValue) value).longValue() == 0)
				throw new DivideByZeroError();
			else
				return new IntegerValue(this.longValue() / ((IntegerValue) value).longValue());
		} else
			throw new SyntaxError("Illegal: Decimal \\ " + value.getClass().getSimpleName());
	}

	@Override
	public IValue modulo(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new DecimalValue(this.doubleValue() % ((INumber) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Decimal % " + value.getClass().getSimpleName());
	}
	
	@Override
	public int compareTo(INumber obj) {
		return Double.compare(value, obj.doubleValue());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber)
			return Double.compare(this.value, ((INumber) value).doubleValue());
		else
			throw new SyntaxError("Illegal comparison: Decimal and " + value.getClass().getSimpleName());

	}
	
	@Override
	public Object convertTo(Context context, Type type) {
		return value;
	}

	@Override
	public String toString() {
		return Double.toString(value); // .ToString("0.0######");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IntegerValue)
			return value == ((IntegerValue) obj).value;
		else if (obj instanceof DecimalValue)
			return value == ((DecimalValue) obj).value;
		else
			return false;
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.numberNode(value);
	}


	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeNumber(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	public IValue negate() {
		return new DecimalValue(-value);
	}

}
