package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.error.DivideByZeroError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
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

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DADD), left, exp);
	}

	private static ResultInfo compileOperation(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		CompilerUtils.numberToPrimitive(method, left, flags.isDecimal());
		ResultInfo right = exp.compile(context, method, flags);
		CompilerUtils.numberToPrimitive(method, right, flags.isDecimal());
		method.addInstruction(flags.opcode());
		if(flags.isDecimal()) {
			if(flags.toPrimitive())
				return new ResultInfo(double.class);
			else 
				return CompilerUtils.doubleToDouble(method);
		} else {
			if(flags.toPrimitive())
				return new ResultInfo(long.class);
			else 
				return CompilerUtils.longToLong(method);
		}
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

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DSUB), left, exp);
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

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DMUL), left, exp);
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
	
	public static ResultInfo compileDivide(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DDIV), left, exp);
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

	public static ResultInfo compileIntDivide(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(false).withOpcode(Opcode.LDIV), left, exp);
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
	
	public static ResultInfo compileModulo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DREM), left, exp);
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
	
	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		CompilerUtils.numberTodouble(method, left);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		CompilerUtils.numberTodouble(method, right);
		method.addInstruction(Opcode.DCMPG);
		return BaseValue.compileCompareToEpilogue(method, flags);
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
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		left = CompilerUtils.numberTodouble(method, left);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		right = CompilerUtils.numberTodouble(method, right);
		method.addInstruction(Opcode.DCMPG);
		Opcode opcode = flags.isReverse() ? Opcode.IFNE : Opcode.IFEQ;
		method.addInstruction(opcode, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_0);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreFullStackState(branchState);
		method.placeLabel(branchState);
		method.addInstruction(Opcode.ICONST_1);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
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
	
	public static ResultInfo compileNegate(Context context, MethodInfo method, Flags flags, ResultInfo value) {
		CompilerUtils.numberToPrimitive(method, value, true);
		method.addInstruction(Opcode.DNEG);
		if(flags.toPrimitive())
			return new ResultInfo(double.class);
		else
			return CompilerUtils.doubleToDouble(method);
	}

}
