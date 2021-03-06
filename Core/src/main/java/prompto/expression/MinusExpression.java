package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.IUnaryFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.PeriodType;
import prompto.utils.CodeWriter;
import prompto.value.DecimalValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.PeriodValue;

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
	public IType check(Context context) {
		IType type = expression.check(context);
		if(type instanceof IntegerType || type instanceof DecimalType || type instanceof PeriodType)
			return type;
		else
			throw new SyntaxError("Cannot reverse " + type.getTypeName());
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Object val = expression.interpret(context);
		if(val instanceof IntegerValue) 
			return ((IntegerValue)val).negate();
		else if(val instanceof DecimalValue) 
			return ((DecimalValue)val).negate();
		else if(val instanceof PeriodValue) 
			return ((PeriodValue)val).negate();
		else
			throw new SyntaxError("Illegal: - " + val.getClass().getSimpleName());
	}

	public IExpression getExpression() {
		return expression;
	}
	
	static Map<Class<?>, IUnaryFunction> negators = createNegators();
	
	private static Map<Class<?>, IUnaryFunction> createNegators() {
		Map<Class<?>, IUnaryFunction> map = new HashMap<>();
		map.put(double.class, DecimalType::compileNegate);
		map.put(Double.class, DecimalType::compileNegate);
		map.put(long.class, IntegerType::compileNegate);
		map.put(Long.class, IntegerType::compileNegate);
		map.put(PromptoPeriod.class, PeriodType::compileNegate);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo val = expression.compile(context, method, flags);
		IUnaryFunction negator = negators.get(val.getType());
		if(negator==null) {
			System.err.println("Missing IOperatorFunction for negate " + val.getType().getTypeName());
			throw new SyntaxError("Cannot negate " + val.getType().getTypeName());
		}
		return negator.compile(context, method, flags, val);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    this.expression.declare(transpiler);
	    IType type = this.expression.check(transpiler.getContext());
	    type.declareMinus(transpiler, this.expression);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IType type = this.expression.check(transpiler.getContext());
	    type.transpileMinus(transpiler, this.expression);
	    return false;
	}

}
