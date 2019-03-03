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
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTime;
import prompto.intrinsic.PromptoTuple;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.CharacterValue;
import prompto.value.DateValue;
import prompto.value.DateTimeValue;
import prompto.value.DecimalValue;
import prompto.value.DictionaryValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.ListValue;
import prompto.value.PeriodValue;
import prompto.value.SetValue;
import prompto.value.TextValue;
import prompto.value.TimeValue;
import prompto.value.TupleValue;

public class PlusExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public PlusExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left.toString() + " + " + right.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" + ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkAdd(context, rt, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.plus(context, rval);
 	}
	
	static Map<Class<?>, IOperatorFunction> adders = createAdders();
	
	private static Map<Class<?>, IOperatorFunction> createAdders() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(String.class, TextValue::compilePlus);
		map.put(java.lang.Character.class, CharacterValue::compilePlus);
		map.put(double.class, DecimalValue::compilePlus);
		map.put(Double.class, DecimalValue::compilePlus);
		map.put(long.class, IntegerValue::compilePlus);
		map.put(Long.class, IntegerValue::compilePlus);
		map.put(PromptoDate.class, DateValue::compilePlus);
		map.put(PromptoDateTime.class, DateTimeValue::compilePlus);
		map.put(PromptoTime.class, TimeValue::compilePlus);
		map.put(PromptoPeriod.class, PeriodValue::compilePlus);
		map.put(PromptoDict.class, DictionaryValue::compilePlus);
		map.put(PromptoSet.class, SetValue::compilePlus);
		map.put(PromptoTuple.class, TupleValue::compilePlus);
		map.put(PromptoList.class, ListValue::compilePlus);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags);
		IOperatorFunction adder = adders.get(lval.getType());
		if(adder==null && lval.getType().getTypeName().startsWith("π.χ."))
			adder = CategoryDeclaration::compilePlus;
		if(adder==null) {
			System.err.println("Missing IOperatorFunction for add " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot add " + lval.getType().getTypeName() + " to " + right.check(context).getFamily());
		}
		return adder.compile(context, method, flags, lval, right);
	}

	@Override
	public void declare(Transpiler transpiler) {
		Context context = transpiler.getContext();
		IType lt = left.check(context);
		IType rt = right.check(context);
		lt.declareAdd(transpiler, rt, true, this.left, this.right);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		Context context = transpiler.getContext();
		IType lt = left.check(context);
		IType rt = right.check(context);
		lt.transpileAdd(transpiler, rt, true, this.left, this.right);
		return false;
	}
	

}
