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
import prompto.grammar.EqOp;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.grammar.UnresolvedIdentifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.runtime.LinkedValue;
import prompto.runtime.LinkedVariable;
import prompto.store.IFilterBuilder;
import prompto.store.IStore;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.Character;
import prompto.value.Date;
import prompto.value.DateTime;
import prompto.value.Decimal;
import prompto.value.Dictionary;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;
import prompto.value.NullValue;
import prompto.value.Period;
import prompto.value.SetValue;
import prompto.value.Text;
import prompto.value.Time;
import prompto.value.TypeValue;

public class EqualsExpression implements IExpression, IAssertion {

	IExpression left;
	EqOp operator;
	IExpression right;
	
	public EqualsExpression(IExpression left, EqOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	static final String VOWELS = "AEIO"; // sufficient here
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" ");
		writer.append(operator.toString(writer.getDialect()));
		// make this a AN
		if(operator==EqOp.IS_A || operator==EqOp.IS_NOT_A) {
			String name = right.toString();
			if(VOWELS.indexOf(name.charAt(0))>=0)
				writer.append("n");
		}
		writer.append(" ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		left.check(context);
		right.check(context);
		return BooleanType.instance(); // can compare all objects
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		if(lval==null)
			lval = NullValue.instance();
		IValue rval = right.interpret(context);
		if(rval==null)
			rval = NullValue.instance();
		return interpret(context, lval, rval);
	}

	private IValue interpret(Context context, IValue lval, IValue rval) throws PromptoError {
		boolean equal = false;
		switch(operator) {
		case IS:
			equal = lval==rval;
			break;
		case IS_NOT:
			equal = lval!=rval;
			break;
		case IS_A:
			equal = interpretIsA(context,lval,rval);
			break;
		case IS_NOT_A:
			equal = !interpretIsA(context,lval,rval);
			break;
		case EQUALS:
			equal = interpretEquals(context,lval,rval);
			break;
		case NOT_EQUALS:
			equal = !interpretEquals(context,lval,rval);
			break;
		case ROUGHLY:
			equal = lval.roughly(context, rval);
			break;
		}
		return Boolean.valueOf(equal);	}

	private boolean interpretIsA(Context context, IValue lval, IValue rval) throws PromptoError {
		IType actual = lval.getType();
		IType toCheck = ((TypeValue)rval).getValue();
		return actual.isAssignableTo(context, toCheck);
	}

	private boolean interpretEquals(Context context, IValue lval, IValue rval) throws PromptoError {
		if(lval==rval)
			return true;
		else if(lval==NullValue.instance() || rval==NullValue.instance())
			return false;
		else
			return lval.equals(rval);
	}

	public Context downCastForCheck(Context context) throws SyntaxError {
		try {
			return downCast(context, false);
		} catch(PromptoError e) {
			throw new RuntimeException("Should never get there!");
		}
	}
	public Context downCastForInterpret(Context context) throws PromptoError {
		return downCast(context, true);
	}

	private Context downCast(Context context, boolean setValue) throws PromptoError {
		if(operator==EqOp.IS_A) {
			Identifier name = readLeftName();
			if(name!=null) {
				INamed value = context.getRegisteredValue(INamed.class, name);
				IType type = ((TypeExpression)right).getType();
				Context local = context.newChildContext();
				value = new LinkedVariable(type, value);
				local.registerValue(value, false);
				if(setValue)
					local.setValue(name, new LinkedValue(context, type));
				context = local;
			}
		}
		return context;
	}
	
	private Identifier readLeftName() {
		if(left instanceof InstanceExpression)
			return ((InstanceExpression)left).getId();
		else if(left instanceof UnresolvedIdentifier)
			return ((UnresolvedIdentifier)left).getId();
		return null;
	}
	
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = interpret(context, lval, rval);
		if(result==Boolean.TRUE) 
			return true;
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		String expected = writer.toString();
		String actual = lval.toString() + " " + operator.toString(test.getDialect()) + " " + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}
	
	@Override
	public void toFilter(Context context, IFilterBuilder builder) throws PromptoError {
		String name = null;
		IValue value = null;
		if(left instanceof UnresolvedIdentifier) {
			name = ((UnresolvedIdentifier)left).getName();
			value = right.interpret(context);
		} else if(left instanceof InstanceExpression) {
			name = ((InstanceExpression)left).getName();
			value = right.interpret(context);
		} else if(right instanceof UnresolvedIdentifier) {
			name = ((UnresolvedIdentifier)right).getName();
			value = left.interpret(context);
		} else if(right instanceof InstanceExpression) {
			name = ((InstanceExpression)right).getName();
			value = left.interpret(context);
		}
		if(name==null || value==null)
			IExpression.super.toFilter(context, builder);
		else {
			if(value instanceof IInstance)
				value = ((IInstance)value).getMember(context, IStore.dbIdIdentifier, false);
			builder.push(context, name, operator, value);
		}
	}
	
	static Map<Class<?>, IOperatorFunction> testers = createTesters();
	
	private static Map<Class<?>, IOperatorFunction> createTesters() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(boolean.class, Boolean::compileEquals); 
		map.put(java.lang.Boolean.class, Boolean::compileEquals); 
		map.put(char.class, Character::compileEquals);
		map.put(java.lang.Character.class, Character::compileEquals);
		map.put(String.class, Text::compileEquals); 
		map.put(double.class, Decimal::compileEquals);
		map.put(Double.class, Decimal::compileEquals); 
		map.put(long.class, Integer::compileEquals);
		map.put(Long.class, Integer::compileEquals); 
		map.put(PromptoDate.class, Date::compileEquals); 
		map.put(PromptoDateTime.class, DateTime::compileEquals); 
		map.put(PromptoTime.class, Time::compileEquals); 
		map.put(PromptoPeriod.class, Period::compileEquals); 
		map.put(PromptoDict.class, Dictionary::compileEquals);
		map.put(PromptoSet.class, SetValue::compileEquals);  /*
		map.put(PromptoTuple.class, TupleValue::compileEquals); */
		map.put(PromptoList.class, ListValue::compileEquals); 
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		switch(operator) {
		case EQUALS:
			return compileEquals(context, method, flags.withReverse(false));
		case NOT_EQUALS:
			return compileEquals(context, method, flags.withReverse(true));
		case ROUGHLY:
			return compileEquals(context, method, flags.withReverse(false).withRoughly(true));
		/*
		case IS:
			equal = lval==rval;
			break;
		case IS_NOT:
			equal = lval!=rval;
			break;
		case IS_A:
			equal = isA(context,lval,rval);
			break;
		case IS_NOT_A:
			equal = !isA(context,lval,rval);
			break;
			equal = interpretEquals(context,lval,rval);
			break;
			equal = !interpretEquals(context,lval,rval);
			break;
		*/
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	public ResultInfo compileEquals(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo lval = left.compile(context, method, flags.withNative(true));
		IOperatorFunction tester = testers.get(lval.getType());
		if(tester==null) {
			System.err.println("Missing IOperatorFunction for = " + lval.getType().getName());
			throw new SyntaxError("Cannot check equality of " + lval.getType().getName() + " with " + right.check(context).getName());
		}
		return tester.compile(context, method, lval, right, flags);
	}
}
