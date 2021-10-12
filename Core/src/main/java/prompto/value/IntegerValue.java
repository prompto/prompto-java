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
import prompto.type.IntegerType;

public class IntegerValue extends BaseValue implements INumberValue, Comparable<INumberValue>, IMultiplyable {
	
	public static IntegerValue Parse(String text) {
		return new IntegerValue(Long.parseLong(text));
	}

	long value;

	public IntegerValue(long value) {
		super(IntegerType.instance());
		this.value = value;
	}

	@Override
	public Long getStorableData() {
		return value;
	}
	
	@Override
	public long longValue() {
		return value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue)
			return new IntegerValue(this.longValue() + ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return new DecimalValue(((DecimalValue) value).doubleValue() + this.value);
		else
			throw new SyntaxError("Illegal: Integer + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue)
			return new IntegerValue(this.longValue() - ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return new DecimalValue(this.doubleValue() - ((DecimalValue) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Integer - " + value.getClass().getSimpleName());
	}

	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue)
			return new IntegerValue(this.longValue() * ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return new DecimalValue(((DecimalValue) value).doubleValue() * this.longValue());
		else if (value instanceof IMultiplyable)
			return value.multiply(context, this);
		else
			throw new SyntaxError("Illegal: Integer * " + value.getClass().getSimpleName());
	}

	@Override
	public IValue divide(Context context, IValue value) throws PromptoError {
		if (value instanceof INumberValue) {
			if (((INumberValue) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new DecimalValue(this.doubleValue() / ((INumberValue) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Integer / " + value.getClass().getSimpleName());
	}

	@Override
	public IValue intDivide(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue) {
			if (((IntegerValue) value).longValue() == 0)
				throw new DivideByZeroError();
			else
				return new IntegerValue(this.longValue() / ((IntegerValue) value).longValue());
		} else
			throw new SyntaxError("Illegal: Integer \\ " + value.getClass().getSimpleName());
	}
	
	@Override
	public IValue modulo(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue) {
			long mod = ((IntegerValue) value).longValue();
			if (mod == 0)
				throw new DivideByZeroError();
			return new IntegerValue(this.longValue() % mod);
		} else
			throw new SyntaxError("Illegal: Integer % " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(INumberValue obj) {
		return Long.compare(value, obj.longValue());
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue)
			return Long.compare(this.value, ((IntegerValue) value).longValue());
		else if (value instanceof DecimalValue)
			return Double.compare(this.doubleValue(), ((DecimalValue) value).doubleValue());
		else
			throw new SyntaxError("Illegal comparison: Integer and " + value.getClass().getSimpleName());

	}

	@Override
	public Object toJavaValue(Context context, Type type) {
		if(type==double.class || type==Double.class)
			return (double)value;
		else if(type==long.class || type==Long.class)
			return value;
		else if(type==int.class || type==Integer.class)
			return (int)value;
		else
			return super.toJavaValue(context, type);
	}

	@Override
	public String toString() {
		return Long.toString(value);
	}
	
	@Override
	public int hashCode() {
		return Long.valueOf(value).hashCode();
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
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeNumber(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	public IValue negate() {
		return new IntegerValue(-value);
	}

}
