package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.CmpOp;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoTime;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.Character;
import prompto.value.Date;
import prompto.value.DateTime;
import prompto.value.Decimal;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.Text;
import prompto.value.Time;

public class CompareExpression extends Section implements IExpression, IAssertion {

	IExpression left;
	CmpOp operator;
	IExpression right;

	public CompareExpression(IExpression left, CmpOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" ");
		writer.append(operator.toString());
		writer.append(" ");
		right.toDialect(writer);
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkCompare(context, rt, this);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		return compare(context, lval, rval);
	}

	private Boolean compare(Context context, IValue lval, IValue rval) throws PromptoError {
		int cmp = lval.compareTo(context, rval);
		switch (operator) {
		case GT:
			return Boolean.valueOf(cmp > 0);
		case LT:
			return Boolean.valueOf(cmp < 0);
		case GTE:
			return Boolean.valueOf(cmp >= 0);
		case LTE:
			return Boolean.valueOf(cmp <= 0);
		default:
			throw new SyntaxError("Illegal compare operand: " + operator.toString());
		}
	}
	
	static Map<Class<?>, IOperatorFunction> testers = createTesters();
	
	private static Map<Class<?>, IOperatorFunction> createTesters() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>(); 
		map.put(char.class, Character::compileCompareTo);
		map.put(java.lang.Character.class, Character::compileCompareTo); 
		map.put(String.class, Text::compileCompareTo); 
		map.put(double.class, Decimal::compileCompareTo);
		map.put(Double.class, Decimal::compileCompareTo); 
		map.put(long.class, Integer::compileCompareTo);
		map.put(Long.class, Integer::compileCompareTo); 
		map.put(PromptoDate.class, Date::compileCompareTo); 
		map.put(PromptoDateTime.class, DateTime::compileCompareTo); 
		map.put(PromptoTime.class, Time::compileCompareTo); 
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo lval = left.compile(context, method, flags.withNative(true));
		IOperatorFunction tester = testers.get(lval.getType());
		if(tester==null) {
			System.err.println("Missing IOperatorFunction for compare " + lval.getType().getName());
			throw new SyntaxError("Cannot compare " + lval.getType().getName() + " with " + right.check(context).getName());
		}
		return tester.compile(context, method, lval, right, flags.withCmpOp(operator));
	}
	
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = compare(context, lval, rval);
		if(result==Boolean.TRUE) 
			return true;
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		String expected = writer.toString();
		String actual = lval.toString() + " " + operator.toString() + " " + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}
}
