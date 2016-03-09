package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.PeriodType;
import prompto.utils.CodeWriter;
import prompto.value.Decimal;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.Period;

public class MinusExpression implements IUnaryExpression {

	IExpression expression;
	
	public MinusExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("-");
		expression.toDialect(writer);
	}
	
	@Override
	public String toString() {
		return "-" + expression.toString();
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = expression.check(context);
		if(type instanceof IntegerType || type instanceof DecimalType || type instanceof PeriodType)
			return type;
		else
			throw new SyntaxError("Cannot negate " + type.getId());
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Object val = expression.interpret(context);
		if(val instanceof Integer) 
			return new Integer(-((Integer)val).longValue());
		else if(val instanceof Decimal) 
			return new Decimal(-((Decimal)val).doubleValue());
		else if(val instanceof Period) { 
			PromptoPeriod p = ((Period)val).getValue();
			return new Period(-p.getNativeYears(),-p.getNativeMonths(),-p.getNativeWeeks(),
					-p.getNativeDays(),-p.getNativeHours(), -p.getNativeMinutes(),
					-p.getNativeSeconds(),-p.getNativeMillis());
		} else
			throw new SyntaxError("Illegal: - " + val.getClass().getSimpleName());
	}

	public IExpression getExpression() {
		return expression;
	}

}
