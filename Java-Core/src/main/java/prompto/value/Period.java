package prompto.value;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.type.PeriodType;

public class Period extends BaseValue implements IMultiplyable {
	public static final Period ZERO = new Period(0, 0, 0, 0, 0, 0, 0, 0);

	PromptoPeriod value;

	public Period(long years, long months, long weeks, long days, long hours,
			long minutes, long seconds, long millis) {
		super(PeriodType.instance());
		value = new PromptoPeriod(years, months, weeks, days, hours, minutes,
				seconds, millis);
	}

	public Period(PromptoPeriod value) {
		super(PeriodType.instance());
		this.value = value;
	}

	public PromptoPeriod getValue() {
		return value;
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof Period)
			return new Period(this.value.plus(((Period) value).value));
		else
			throw new SyntaxError("Illegal: Period + "
					+ value.getClass().getSimpleName());
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method,
			ResultInfo left, IExpression exp, boolean toNative)
			throws SyntaxError {
		ResultInfo right = exp.compile(context, method, false);
		if (right.getType() != PromptoPeriod.class)
			throw new SyntaxError("Illegal: Period + "
					+ exp.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoPeriod.class, "plus",
				PromptoPeriod.class, PromptoPeriod.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoPeriod.class, true);
	}

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		if (value instanceof Period)
			return new Period(this.value.minus(((Period) value).value));
		else
			throw new SyntaxError("Illegal: Period - "
					+ value.getClass().getSimpleName());
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method,
			ResultInfo left, IExpression exp, boolean toNative)
			throws SyntaxError {
		ResultInfo right = exp.compile(context, method, false);
		if (right.getType() != PromptoPeriod.class)
			throw new SyntaxError("Illegal: Period - "
					+ exp.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoPeriod.class, "minus",
				PromptoPeriod.class, PromptoPeriod.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoPeriod.class, true);
	}

	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			int count = (int) ((Integer) value).longValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			if (count == 0)
				return Period.ZERO;
			if (count == 1)
				return this;
			return new Period(this.value.multiply(count));
		} else
			throw new SyntaxError("Illegal: Period * "
					+ value.getClass().getSimpleName());
	}
	
	

	@Override
	public Object convertTo(Class<?> type) {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Period)
			return this.value.equals(((Period) obj).value);
		else
			return false;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public IValue negate() {
		return new Period(value.negate());
	}

	public static ResultInfo compileNegate(Context context, MethodInfo method,
			ResultInfo value, boolean toNative) throws SyntaxError {
		MethodConstant oper = new MethodConstant(PromptoPeriod.class, "negate",
				PromptoPeriod.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(PromptoPeriod.class, true);
	}

}
