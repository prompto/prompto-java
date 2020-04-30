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
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.PeriodType;
import prompto.type.SetType;
import prompto.type.TimeType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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
		map.put(double.class, DecimalType::compileMinus);
		map.put(Double.class, DecimalType::compileMinus);
		map.put(long.class, IntegerType::compileMinus);
		map.put(Long.class, IntegerType::compileMinus);
		map.put(PromptoDate.class, DateType::compileMinus);
		map.put(PromptoDateTime.class, DateTimeType::compileMinus); 
		map.put(PromptoTime.class, TimeType::compileMinus);
		map.put(PromptoPeriod.class, PeriodType::compileMinus);
		map.put(PromptoList.class, ListType::compileMinus);
		map.put(PromptoSet.class, SetType::compileMinus);
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
			throw new SyntaxError("Cannot sub " + right.check(context).getFamilyInfo()  + " from " + lval.getType().getTypeName() );
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
