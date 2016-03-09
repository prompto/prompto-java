package prompto.value;

import java.io.IOException;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.DivideByZeroError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.DecimalType;

import com.fasterxml.jackson.core.JsonGenerator;

public class Decimal extends BaseValue implements INumber, Comparable<INumber>, IMultiplyable {
	
	public static Decimal Parse(String text) {
		return new Decimal(Double.parseDouble(text));
	}

	double value;

	public Decimal(double value) {
		super(DecimalType.instance());
		this.value = value;
	}

	public long longValue() {
		return (long) value;
	}

	public double doubleValue() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws SyntaxError {
		if (value instanceof Integer)
			return new Decimal(this.value + ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(this.value + ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Decimal + " + value.getClass().getSimpleName());
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		return compileOperation(context, method, left, exp, toNative, true, Opcode.DADD);
	}

	private static ResultInfo compileOperation(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative, boolean isDecimal, Opcode opcode) throws SyntaxError {
		CompilerUtils.numberToNative(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, true);
		CompilerUtils.numberToNative(method, right, isDecimal);
		method.addInstruction(opcode);
		if(toNative)
			return new ResultInfo(double.class, false);
		else
			return CompilerUtils.doubleToDouble(method);
	}


	@Override
	public IValue minus(Context context, IValue value) throws SyntaxError {
		if (value instanceof Integer)
			return new Decimal(this.value - ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(this.value - ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Decimal - " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		return compileOperation(context, method, left, exp, toNative, true, Opcode.DSUB);
	}

	@Override
	public IValue multiply(Context context, IValue value) throws SyntaxError {
		if (value instanceof Integer)
			return new Decimal(this.doubleValue() * ((Integer) value).longValue());
		else if (value instanceof Decimal)
			return new Decimal(this.doubleValue() * ((Decimal) value).doubleValue());
		else
			throw new SyntaxError("Illegal: Decimal * " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		return compileOperation(context, method, left, exp, toNative, true, Opcode.DMUL);
	}

	@Override
	public IValue divide(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new Decimal(this.doubleValue() / ((INumber) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Decimal / " + value.getClass().getSimpleName());
	}
	
	public static ResultInfo compileDivide(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		return compileOperation(context, method, left, exp, toNative, true, Opcode.DDIV);
	}

	@Override
	public IValue intDivide(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			if (((Integer) value).longValue() == 0)
				throw new DivideByZeroError();
			else
				return new Integer(this.longValue() / ((Integer) value).longValue());
		} else
			throw new SyntaxError("Illegal: Decimal \\ " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileIntDivide(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		return compileOperation(context, method, left, exp, toNative, false, Opcode.LDIV);
	}


	@Override
	public IValue modulo(Context context, IValue value) throws PromptoError {
		if (value instanceof INumber) {
			if (((INumber) value).doubleValue() == 0.0)
				throw new DivideByZeroError();
			else
				return new Decimal(this.doubleValue() % ((INumber) value).doubleValue());
		} else
			throw new SyntaxError("Illegal: Decimal % " + value.getClass().getSimpleName());
	}
	
	public static ResultInfo compileModulo(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		return compileOperation(context, method, left, exp, toNative, true, Opcode.DREM);
	}


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
	public Object convertTo(Class<?> type) {
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

	public IValue negate() {
		return new Decimal(-value);
	}
	
	public static ResultInfo compileNegate(Context context, MethodInfo method, ResultInfo value, boolean toNative) throws SyntaxError {
		CompilerUtils.numberToNative(method, value, true);
		method.addInstruction(Opcode.DNEG);
		if(toNative)
			return new ResultInfo(double.class, false);
		else
			return CompilerUtils.doubleToDouble(method);
	}

}
