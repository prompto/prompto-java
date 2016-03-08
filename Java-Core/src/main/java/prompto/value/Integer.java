package prompto.value;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.DivideByZeroError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.IntegerType;

public class Integer extends BaseValue implements INumber, Comparable<INumber>, IMultiplyable {
	
	public static Integer Parse(String text) {
		return new Integer(Long.parseLong(text));
	}

	long value;

	public Integer(long value) {
		super(IntegerType.instance());
		this.value = value;
	}

	public long longValue() {
		return value;
	}

	public double doubleValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return new Integer(this.longValue() + ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(((Decimal) value).doubleValue() + this.value);
		else
			throw new SyntaxError("Illegal: Integer + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Subtract(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return new Integer(this.longValue() - ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(this.doubleValue() - ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Integer - " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return new Integer(this.longValue() * ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(((Decimal) value).doubleValue() * this.longValue());
		else if (value instanceof IMultiplyable)
			return value.Multiply(context, this);
		else
			throw new SyntaxError("Illegal: Integer * " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Divide(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new Decimal(this.doubleValue() / ((INumber) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Integer / " + value.getClass().getSimpleName());
	}

	@Override
	public IValue IntDivide(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			if (((Integer) value).longValue() == 0)
				throw new DivideByZeroError();
			else
				return new Integer(this.longValue() / ((Integer) value).longValue());
		} else
			throw new SyntaxError("Illegal: Integer \\ " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Modulo(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			long mod = ((Integer) value).longValue();
			if (mod == 0)
				throw new DivideByZeroError();
			return new Integer(this.longValue() % mod);
		} else
			throw new SyntaxError("Illegal: Integer % " + value.getClass().getSimpleName());
	}

	public int compareTo(INumber obj) {
		return Long.compare(value, obj.longValue());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer)
			return Long.compare(this.value, ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return Double.compare(this.doubleValue(), ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal comparison: Integer and " + value.getClass().getSimpleName());

	}

	@Override
	public Object convertTo(Class<?> type) {
		return value;
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
		if (obj instanceof Integer)
			return value == ((Integer) obj).value;
		else if (obj instanceof Decimal)
			return value == ((Decimal) obj).value;
		else
			return false;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeNumber(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
	}

}
