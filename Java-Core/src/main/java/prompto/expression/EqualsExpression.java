package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.AttributeInfo;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.EqOp;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoRange;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.runtime.LinkedValue;
import prompto.runtime.LinkedVariable;
import prompto.store.IPredicateExpression;
import prompto.store.IQuery;
import prompto.store.IQuery.MatchOp;
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
import prompto.value.RangeBase;
import prompto.value.SetValue;
import prompto.value.Text;
import prompto.value.Time;
import prompto.value.TypeValue;

public class EqualsExpression implements IPredicateExpression, IAssertion {

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
	public IType check(Context context) {
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

	public Context downCastForCheck(Context context) {
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
	
	public Context prepareAutodowncast(Context context, MethodInfo method) {
		if(operator==EqOp.IS_A) {
			Identifier name = readLeftName();
			if(name!=null) {
				IType type = ((TypeExpression)right).getType();
				ClassConstant c = new ClassConstant(type.getJavaType());
				StackLocal local = method.getRegisteredLocal(name.toString());
				((StackLocal.ObjectLocal)local).markForAutodowncast(c);
				return downCastForCheck(context);
			}
		}
		return context;
	}

	public void cancelAutodowncast(Context context, MethodInfo method) {
		if(operator==EqOp.IS_A) {
			Identifier name = readLeftName();
			if(name!=null) {
				StackLocal local = method.getRegisteredLocal(name.toString());
				((StackLocal.ObjectLocal)local).unmarkForAutodowncast();
			}
		}
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
	public void interpretQuery(Context context, IQuery query) throws PromptoError {
		IValue value = null;
		String name = readFieldName(left);
		if(name!=null)
			value = right.interpret(context);
		else {
			name = readFieldName(right);
			if(name!=null)
				value = left.interpret(context);
			else
				throw new SyntaxError("Unable to interpret predicate");
		}
		if(value instanceof IInstance)
			value = ((IInstance)value).getMember(context, new Identifier(IStore.dbIdName), false);
		AttributeDeclaration decl = context.findAttribute(name);
		AttributeInfo info = decl==null ? null : decl.getAttributeInfo();
		Object data = value==null ? null : value.getStorableData();
		MatchOp match = getMatchOp();
		query.<Object>verify(info, match, data);
	}
	
	private MatchOp getMatchOp() {
		switch(operator) {
		case EQUALS:
			return MatchOp.EQUALS;
		case ROUGHLY:
			return MatchOp.ROUGHLY;
		case NOT_EQUALS:
			return MatchOp.EQUALS;
		default:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		method.addInstruction(Opcode.DUP); // IQuery -> IQuery, IQuery
		boolean reverse = compileAttributeInfo(context, method, flags);
		MatchOp match = getMatchOp();
		CompilerUtils.compileJavaEnum(context, method, flags, match);
		if(reverse)
			left.compile(context, method, flags);
		else
			right.compile(context, method, flags);
		InterfaceConstant m = new InterfaceConstant(IQuery.class,
				"verify", AttributeInfo.class, MatchOp.class, Object.class, void.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
	}
	

	private boolean compileAttributeInfo(Context context, MethodInfo method, Flags flags) {
		String name = readFieldName(left);
		boolean reverse = name==null;
		if(reverse)
			name = readFieldName(right);
		AttributeInfo info = context.findAttribute(name).getAttributeInfo();
		CompilerUtils.compileAttributeInfo(context, method, flags, info);
		return reverse;
	}

	private String readFieldName(IExpression exp) {
		if(exp instanceof UnresolvedIdentifier
			|| exp instanceof InstanceExpression
			|| exp instanceof MemberSelector)
			return exp.toString();
		else
			return null;
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
		map.put(PromptoRange.Long.class, RangeBase::compileEquals); 
		map.put(PromptoRange.Character.class, RangeBase::compileEquals); 
		map.put(PromptoRange.Date.class, RangeBase::compileEquals); 
		map.put(PromptoRange.Time.class, RangeBase::compileEquals); 
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
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		switch(operator) {
		case EQUALS:
			return compileEquals(context, method, flags.withReverse(false));
		case NOT_EQUALS:
			return compileEquals(context, method, flags.withReverse(true));
		case ROUGHLY:
			return compileEquals(context, method, flags.withReverse(false).withRoughly(true));
		case IS:
			return compileIs(context, method, flags.withReverse(false));
		case IS_NOT:
			return compileIs(context, method, flags.withReverse(true));
		case IS_A:
			return compileIsA(context, method, flags.withReverse(false));
		case IS_NOT_A:
			return compileIsA(context, method, flags.withReverse(true));
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	private ResultInfo compileIsA(Context context, MethodInfo method, Flags flags) {
		right.compile(context, method, flags.withPrimitive(false));
		left.compile(context, method, flags.withPrimitive(false));
		MethodConstant m = new MethodConstant(Class.class, "isInstance", Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	public ResultInfo compileIs(Context context, MethodInfo method, Flags flags) {
		left.compile(context, method, flags.withPrimitive(false));
		right.compile(context, method, flags.withPrimitive(false));
		Opcode opcode = flags.isReverse() ? Opcode.IF_ACMPNE : Opcode.IF_ACMPEQ;
		method.addInstruction(opcode, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_0);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreStackState(branchState);
		method.placeLabel(branchState);
		method.addInstruction(Opcode.ICONST_1);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	public ResultInfo compileEquals(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags.withPrimitive(true));
		IOperatorFunction tester = testers.get(lval.getType());
		if(tester==null) {
			System.err.println("Missing IOperatorFunction for = " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot check equality of " + lval.getType().getTypeName() + " with " + right.check(context).getFamily());
		}
		return tester.compile(context, method, flags, lval, right);
	}


}
