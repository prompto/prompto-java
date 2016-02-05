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
import prompto.type.DecimalType;

public class Decimal extends BaseValue implements INumber, Comparable<INumber>, IMultiplyable {
	
	public static Decimal Parse(String text) {
		return new Decimal(Double.parseDouble(text));
	}

	double value;

	public Decimal(double value) {
		super(DecimalType.instance());
		this.value = value;
	}

	public long IntegerValue() {
		return (long) value;
	}

	public double DecimalValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws SyntaxError {
		if (value instanceof Integer)
			return new Decimal(this.value + ((Integer) value).IntegerValue());
		else if (value instanceof Decimal)
			return new Decimal(this.value + ((Decimal) value).DecimalValue());
		else
			throw new SyntaxError("Illegal: Decimal + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Subtract(Context context, IValue value) throws SyntaxError {
		if (value instanceof Integer)
			return new Decimal(this.value - ((Integer) value).IntegerValue());
		else if (value instanceof Decimal)
			return new Decimal(this.value - ((Decimal) value).DecimalValue());
		else
			throw new SyntaxError("Illegal: Decimal - " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Multiply(Context context, IValue value) throws SyntaxError {
		if (value instanceof Integer)
			return new Decimal(this.DecimalValue() * ((Integer) value).IntegerValue());
		else if (value instanceof Decimal)
			return new Decimal(this.DecimalValue() * ((Decimal) value).DecimalValue());
		else
			throw new SyntaxError("Illegal: Decimal * " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Divide(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).DecimalValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new Decimal(this.DecimalValue() / ((INumber) value).DecimalValue());
		} else
			throw new SyntaxError("Illegal: Decimal / " + value.getClass().getSimpleName());
	}
	
	@Override
	public IValue IntDivide(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			if (((Integer) value).IntegerValue() == 0)
				throw new DivideByZeroError();
			else
				return new Integer(this.IntegerValue() / ((Integer) value).IntegerValue());
		} else
			throw new SyntaxError("Illegal: Decimal \\ " + value.getClass().getSimpleName());
	}

	@Override
	public IValue Modulo(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).DecimalValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new Decimal(this.DecimalValue() % ((INumber) value).DecimalValue());
		} else
			throw new SyntaxError("Illegal: Decimal % " + value.getClass().getSimpleName());
	}
	
	public int compareTo(INumber obj) {
		return Double.compare(value, obj.DecimalValue());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber)
			return Double.compare(this.value, ((INumber) value).DecimalValue());
		else
			throw new SyntaxError("Illegal comparison: Decimal and " + value.getClass().getSimpleName());

	}

	@Override
	public Object ConvertTo(Class<?> type) {
		return value;
	}

	@Override
	public String toString() {
		return Double.toString(value); // .ToString("0.0######");
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
