package prompto.expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.custom.PromptoMap;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.BaseList;
import prompto.value.Date;
import prompto.value.Decimal;
import prompto.value.Dictionary;
import prompto.value.Integer;
import prompto.value.IValue;
import prompto.value.Period;
import prompto.value.Text;
import prompto.value.Character;

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
		map.put(Double.class, Decimal::compileAdd);
		map.put(Long.class, Integer::compileAdd);
		map.put(LocalDate.class, Date::compileAdd);
		map.put(DateTime.class, prompto.value.DateTime::compileAdd);
		map.put(PromptoMap.class, Dictionary::compileAdd);
		map.put(ArrayList.class, BaseList::compileAdd);
		map.put(org.joda.time.Period.class, Period::compileAdd);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		ResultInfo lval = left.compile(context, method);
		IOperatorFunction adder = adders.get(lval.getType());
		if(adder==null) {
			System.err.println("Missing IOperatorFunction for add " + lval.getType().getName());
			throw new SyntaxError("Cannot add " + lval.getType().getName() + " to " + right.check(context).getName());
		}
		return adder.compile(context, method, right);
	}

	

}
