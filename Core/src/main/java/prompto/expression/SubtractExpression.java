package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.DateValue;
import prompto.value.DateTimeValue;
import prompto.value.DecimalValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.ListValue;
import prompto.value.PeriodValue;
import prompto.value.SetValue;
import prompto.value.TimeValue;

public class SubtractExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public SubtractExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" - ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkSubstract(context,rt);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.minus(context, rval);
	}

	static Map<Class<?>, IOperatorFunction> minusers = createMinusers();
	
	private static Map<Class<?>, IOperatorFunction> createMinusers() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(double.class, DecimalValue::compileMinus);
		map.put(Double.class, DecimalValue::compileMinus);
		map.put(long.class, IntegerValue::compileMinus);
		map.put(Long.class, IntegerValue::compileMinus);
		map.put(PromptoDate.class, DateValue::compileMinus);
		map.put(PromptoDateTime.class, DateTimeValue::compileMinus); 
		map.put(PromptoTime.class, TimeValue::compileMinus);
		map.put(PromptoPeriod.class, PeriodValue::compileMinus);
		map.put(PromptoList.class, ListValue::compileMinus);
		map.put(PromptoSet.class, SetValue::compileMinus);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags);
		IOperatorFunction minuser = minusers.get(lval.getType());
		if(minuser==null && lval.getType().getTypeName().startsWith("π.χ."))
			minuser = CategoryDeclaration::compileMinus;
		if(minuser==null) {
			System.err.println("Missing IOperatorFunction for minus " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot sub " + right.check(context).getFamily()  + " from " + lval.getType().getTypeName() );
		}
		return minuser.compile(context, method, flags, lval, right);
	}

	@Override
	public void declare(Transpiler transpiler) {
	    IType lt = this.left.check(transpiler.getContext());
	    IType rt = this.right.check(transpiler.getContext());
	    lt.declareSubtract(transpiler, rt, this.left, this.right);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IType lt = this.left.check(transpiler.getContext());
		IType rt = this.right.check(transpiler.getContext());
	    lt.transpileSubtract(transpiler, rt, this.left, this.right);
	    return false;
	}
	
	
}
