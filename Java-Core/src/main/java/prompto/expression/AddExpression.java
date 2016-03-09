package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
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
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Character;
import prompto.value.Date;
import prompto.value.DateTime;
import prompto.value.Decimal;
import prompto.value.Dictionary;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;
import prompto.value.Period;
import prompto.value.SetValue;
import prompto.value.Text;
import prompto.value.Time;
import prompto.value.TupleValue;

public class AddExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public AddExpression(IExpression left, IExpression right) {
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
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkAdd(context, rt, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.Add(context, rval);
 	}
	
	static Map<Class<?>, IOperatorFunction> adders = createAdders();
	
	private static Map<Class<?>, IOperatorFunction> createAdders() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(String.class, Text::compileAdd);
		map.put(java.lang.Character.class, Character::compileAdd);
		map.put(double.class, Decimal::compileAdd);
		map.put(Double.class, Decimal::compileAdd);
		map.put(long.class, Integer::compileAdd);
		map.put(Long.class, Integer::compileAdd);
		map.put(PromptoDate.class, Date::compileAdd);
		map.put(PromptoDateTime.class, DateTime::compileAdd);
		map.put(PromptoTime.class, Time::compileAdd);
		map.put(PromptoPeriod.class, Period::compileAdd);
		map.put(PromptoDict.class, Dictionary::compileAdd);
		map.put(PromptoSet.class, SetValue::compileAdd);
		map.put(PromptoTuple.class, TupleValue::compileAdd);
		map.put(PromptoList.class, ListValue::compileAdd);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		ResultInfo lval = left.compile(context, method, false);
		IOperatorFunction adder = adders.get(lval.getType());
		if(adder==null) {
			System.err.println("Missing IOperatorFunction for add " + lval.getType().getName());
			throw new SyntaxError("Cannot add " + lval.getType().getName() + " to " + right.check(context).getName());
		}
		return adder.compile(context, method, lval, right, toNative);
	}

	

}
