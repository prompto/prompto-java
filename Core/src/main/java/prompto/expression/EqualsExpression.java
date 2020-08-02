package prompto.expression;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.EqOp;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoAny;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoRange;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTime;
import prompto.intrinsic.PromptoVersion;
import prompto.literal.NullLiteral;
import prompto.parser.Dialect;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.LinkedValue;
import prompto.runtime.LinkedVariable;
import prompto.runtime.Variable;
import prompto.store.AttributeInfo;
import prompto.store.DataStore;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CharacterType;
import prompto.type.ContainerType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.NullType;
import prompto.type.PeriodType;
import prompto.type.RangeType;
import prompto.type.SetType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.UuidType;
import prompto.type.VersionType;
import prompto.utils.CodeWriter;
import prompto.utils.StoreUtils;
import prompto.value.BooleanValue;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;
import prompto.value.TypeValue;

public class EqualsExpression extends Section implements IPredicateExpression, IAssertion {

	IExpression left;
	EqOp operator;
	IExpression right;
	
	public EqualsExpression(IExpression left, EqOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left.toString() + ' ' + operator.toString() + ' ' + right.toString();
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
		IType lt = left.check(context);
		if(lt instanceof ContainerType)
			lt = ((ContainerType)lt).getItemType();
		IType rt = right.check(context);
		if(rt instanceof ContainerType)
			rt = ((ContainerType)rt).getItemType();
		switch(operator) {
			case CONTAINS:
			case NOT_CONTAINS:
				if(lt!=TextType.instance() || (rt!=TextType.instance() && rt!=CharacterType.instance()))
					throw new SyntaxError("'contains' only operates on textual values!");
			default:	
				return BooleanType.instance(); // can compare all objects
		}
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
		case CONTAINS:
			equal = interpretContains(context,lval,rval);
			break;
		case NOT_CONTAINS:
			equal = !interpretContains(context,lval,rval);
			break;
		}
		return BooleanValue.valueOf(equal);	}

	private boolean interpretIsA(Context context, IValue lval, IValue rval) throws PromptoError {
		IType actual = lval.getType();
		if(actual==NullType.instance())
			return false;
		IType expected = ((TypeValue)rval).getValue();
		return expected.isAssignableFrom(context, actual);
	}

	private boolean interpretEquals(Context context, IValue lval, IValue rval) throws PromptoError {
		if(lval==rval)
			return true;
		else if(lval==NullValue.instance() || rval==NullValue.instance())
			return false;
		else
			return lval.equals(rval);
	}

	private boolean interpretContains(Context context, IValue lval, IValue rval) throws PromptoError {
		if(lval==rval)
			return true;
		else if(lval==NullValue.instance() || rval==NullValue.instance())
			return false;
		else 
			return lval.contains(context, rval);
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
				ClassConstant c = new ClassConstant(type.getJavaType(context));
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
		if(result==BooleanValue.TRUE) 
			return true;
		String expected = buildExpectedMessage(context, test);
		String actual = lval.toString() + " " + operator.toString(test.getDialect()) + " " + rval.toString();
		test.printFailedAssertion(context, expected, actual);
		return false;
	}

	private String buildExpectedMessage(Context context, TestMethodDeclaration test) {
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		return writer.toString();
	}

	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		context = context.newChildContext();
		StackState finalState = method.captureStackState();
		// compile left and store in local
		IType leftType = this.left.check(context);
		ResultInfo leftInfo = this.left.compile(context, method, flags.withPrimitive(false));
		String leftName = method.nextTransientName("left");
		StackLocal left = method.registerLocal(leftName, VerifierType.ITEM_Object, new ClassConstant(leftInfo.getType()));
		CompilerUtils.compileASTORE(method, left);
		// compile right and store in local
		IType rightType = this.right.check(context);
		ResultInfo rightInfo = this.right.compile(context, method, flags.withPrimitive(false));
		String rightName = method.nextTransientName("right");
		StackLocal right = method.registerLocal(rightName, VerifierType.ITEM_Object, new ClassConstant(rightInfo.getType()));
		CompilerUtils.compileASTORE(method, right);
		// call regular compile
		IExpression newLeft = new InstanceExpression(new Identifier(leftName));
		context.registerValue(new Variable(new Identifier(leftName), leftType));
		IExpression newRight = new InstanceExpression(new Identifier(rightName));
		context.registerValue(new Variable(new Identifier(rightName), rightType));
		EqualsExpression newExp = new EqualsExpression(newLeft, this.operator, newRight);
		ResultInfo info = newExp.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		// 1 = success
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.IFNE, finalListener); 
		// increment failure counter
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.IADD);
		// build failure message
		String message = buildExpectedMessage(context, test);
		message = test.buildFailedAssertionMessagePrefix(message);
		method.addInstruction(Opcode.LDC, new StringConstant(message));
		CompilerUtils.compileALOAD(method, left);
		MethodConstant stringValueOf = new MethodConstant(String.class, "valueOf", Object.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, stringValueOf);
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		method.addInstruction(Opcode.LDC, new StringConstant(" " + operator.toString(test.getDialect()) + " "));
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		CompilerUtils.compileALOAD(method, right);
		method.addInstruction(Opcode.INVOKESTATIC, stringValueOf);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		test.compileFailure(context, method, flags);
		// success/final
		method.unregisterLocal(right);
		method.unregisterLocal(left);
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		method.inhibitOffsetListener(finalListener);
	}
	
	
	@Override
	public void checkQuery(Context context) throws PromptoError {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null)
			return;
		if(!decl.isStorable(context)) {
			context.getProblemListener().reportNotStorable(this, decl.getName());	
			return;
		}
		right.check(context);
	}
	
	
	@Override
	public void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null || !decl.isStorable(context))
			throw new SyntaxError("Unable to interpret predicate");
		IValue value = right.interpret(context);
		if(value instanceof IInstance)
			value = ((IInstance)value).getMember(context, new Identifier(IStore.dbIdName), false);
		Object data = null;
		if(value!=null)
		if(IStore.dbIdName.equals(decl.getName()))
			data = DataStore.getInstance().convertToDbId(value);
		else
			data = value.getStorableData();
		
		AttributeInfo info = StoreUtils.getAttributeInfo(context, decl.getName(), store);
		MatchOp match = getMatchOp();
		query.<Object>verify(info, match, data);
		if(operator.isNot())
			query.not();
	}
	
	private MatchOp getMatchOp() {
		switch(operator) {
		case IS:
		case IS_NOT:
		case EQUALS:
		case NOT_EQUALS:
			return MatchOp.EQUALS;
		case ROUGHLY:
			return MatchOp.ROUGHLY;
		case CONTAINS:
		case NOT_CONTAINS:
			return MatchOp.CONTAINS;
		default:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		compileAttributeInfo(context, method, flags);
		MatchOp match = getMatchOp();
		CompilerUtils.compileJavaEnum(context, method, flags, match);
		right.compile(context, method, flags);
		InterfaceConstant m = new InterfaceConstant(IQueryBuilder.class,
				"verify", AttributeInfo.class, MatchOp.class, Object.class, IQueryBuilder.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		if(operator.isNot()) {
			m = new InterfaceConstant(IQueryBuilder.class, "not", IQueryBuilder.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, m);
		}
	}
	

	private void compileAttributeInfo(Context context, MethodInfo method, Flags flags) {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null || !decl.isStorable(context))
	    	throw new SyntaxError("Unable to compile predicate");
	    if(!decl.isStorable(context)) {
			context.getProblemListener().reportNotStorable(this, decl.getName());	
			return;
		}
		AttributeInfo info = context.findAttribute(decl.getName()).getAttributeInfo(context);
		CompilerUtils.compileAttributeInfo(context, method, flags, info);
	}

	static Map<Class<?>, IOperatorFunction> EQUALS_COMPILERS = createEqualsCompilers();
	
	private static Map<Class<?>, IOperatorFunction> createEqualsCompilers() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(boolean.class, BooleanType::compileEquals); 
		map.put(java.lang.Boolean.class, BooleanType::compileEquals); 
		map.put(char.class, CharacterType::compileEquals);
		map.put(java.lang.Character.class, CharacterType::compileEquals);
		map.put(String.class, TextType::compileEquals); 
		map.put(double.class, DecimalType::compileEquals);
		map.put(Double.class, DecimalType::compileEquals); 
		map.put(long.class, IntegerType::compileEquals);
		map.put(Long.class, IntegerType::compileEquals); 
		map.put(PromptoAny.class, AnyType::compileEquals); 
		map.put(PromptoRange.Long.class, RangeType::compileEquals); 
		map.put(PromptoRange.Character.class, RangeType::compileEquals); 
		map.put(PromptoRange.Date.class, RangeType::compileEquals); 
		map.put(PromptoRange.Time.class, RangeType::compileEquals); 
		map.put(PromptoDate.class, DateType::compileEquals); 
		map.put(PromptoDateTime.class, DateTimeType::compileEquals); 
		map.put(PromptoTime.class, TimeType::compileEquals); 
		map.put(PromptoPeriod.class, PeriodType::compileEquals); 
		map.put(PromptoVersion.class, VersionType::compileEquals); 
		map.put(PromptoDict.class, DictType::compileEquals);
		map.put(PromptoSet.class, SetType::compileEquals);  /*
		map.put(PromptoTuple.class, TupleValue::compileEquals); */
		map.put(PromptoList.class, ListType::compileEquals); 
		map.put(UUID.class, UuidType::compileEquals); 
		map.put(Object.class, AnyType::compileEquals); 
		return map;
	}


	static Map<Class<?>, IOperatorFunction> CONTAINS_COMPILERS = createContainsCompilers();
	
	private static Map<Class<?>, IOperatorFunction> createContainsCompilers() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(String.class, TextType::compileContains); 
		/*
		map.put(PromptoRange.Long.class, RangeBase::compileContains); 
		map.put(PromptoRange.Character.class, RangeBase::compileContains); 
		map.put(PromptoRange.Date.class, RangeBase::compileContains); 
		map.put(PromptoRange.Time.class, RangeBase::compileContains); 
		map.put(PromptoSet.class, SetValue::compileContains);  
		map.put(PromptoTuple.class, TupleValue::compileContains); 
		map.put(PromptoList.class, ListValue::compileContains); 
		*/
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
		case CONTAINS:
			return compileContains(context, method, flags.withReverse(false));
		case NOT_CONTAINS:
			return compileContains(context, method, flags.withReverse(true));
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
		if(left.equals(right)) 
			method.addInstruction(flags.isReverse() ? Opcode.ICONST_0 : Opcode.ICONST_1);
		else if(left instanceof NullLiteral)
			compileIsNull(context, method, flags, right);
		else if(right instanceof NullLiteral)
			compileIsNull(context, method, flags, left);
		else 
			compileIsInstance(context, method, flags);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	private void compileIsNull(Context context, MethodInfo method, Flags flags, IExpression value) {
		StackState initialState = method.captureStackState();
		value.compile(context, method, flags.withPrimitive(false));
		Opcode opcode = flags.isReverse() ? Opcode.IFNONNULL : Opcode.IFNULL;
		method.addInstruction(opcode, new ShortOperand((short)7));
		compileIsEpilogue(context, method, flags, initialState);
	}

	private void compileIsEpilogue(Context context, MethodInfo method, Flags flags, StackState initialState) {
		method.addInstruction(Opcode.ICONST_0);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreFullStackState(initialState);
		method.placeLabel(initialState);
		method.addInstruction(Opcode.ICONST_1);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
	}

	private void compileIsInstance(Context context, MethodInfo method, Flags flags) {
		StackState initialState = method.captureStackState();
		left.compile(context, method, flags.withPrimitive(false));
		right.compile(context, method, flags.withPrimitive(false));
		Opcode opcode = flags.isReverse() ? Opcode.IF_ACMPNE : Opcode.IF_ACMPEQ;
		method.addInstruction(opcode, new ShortOperand((short)7));
		compileIsEpilogue(context, method, flags, initialState);
	}

	public ResultInfo compileEquals(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags.withPrimitive(true));
		IOperatorFunction compiler = getEqualsCompiler(lval.getType());
		if(compiler==null) {
			System.err.println("Missing IOperatorFunction for = " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot check equality of " + lval.getType().getTypeName() + " with " + right.check(context).getFamilyInfo(context));
		}
		return compiler.compile(context, method, flags, lval, right);
	}

	private IOperatorFunction getEqualsCompiler(Type type) {
		IOperatorFunction function = EQUALS_COMPILERS.get(type);
		if(function==null && CompilerUtils.isEnumNativeType(type))
			return NativeSymbol::compileEquals;
		return function;
	}

	public ResultInfo compileContains(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags.withPrimitive(true));
		IOperatorFunction compiler = CONTAINS_COMPILERS.get(lval.getType());
		if(compiler==null) {
			System.err.println("Missing IOperatorFunction for 'contains' " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot check that " + lval.getType().getTypeName() + " contains " + right.check(context).getFamilyInfo(context));
		}
		return compiler.compile(context, method, flags, lval, right);
	}

	@Override
	public void declare(Transpiler transpiler) {
	    this.left.declare(transpiler);
	    this.right.declare(transpiler);
	    if(this.operator == EqOp.ROUGHLY) {
	        transpiler.require("removeAccents");
	    }
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    switch (this.operator) {
        case EQUALS:
            this.transpileEquals(transpiler);
            break;
        case NOT_EQUALS:
            this.transpileNotEquals(transpiler);
            break;
        case ROUGHLY:
            this.transpileRoughly(transpiler);
            break;
        case CONTAINS:
            this.transpileContains(transpiler);
            break;
        case NOT_CONTAINS:
            this.transpileNotContains(transpiler);
            break;
        case IS:
            this.transpileIs(transpiler);
            break;
        case IS_NOT:
            this.transpileIsNot(transpiler);
            break;
        case IS_A:
            this.transpileIsA(transpiler);
            break;
        case IS_NOT_A:
            this.transpileIsNotA(transpiler);
            break;
        default:
            throw new Error("Cannot transpile:" + this.operator.toString());
	    }
	    return false;
    }

	private void transpileIsNotA(Transpiler transpiler) {
		transpiler.append("!(");
		transpileIsA(transpiler);
		transpiler.append(")");
	}
	
	private void transpileIsA(Transpiler transpiler) {
		if(!(this.right instanceof TypeExpression))
			throw new Error("Cannot transpile:" + this.right.getClass().getName());
		IType type = ((TypeExpression)this.right).getType();
		if(type==BooleanType.instance()) {
	        transpiler.append("isABoolean(");
	        this.left.transpile(transpiler);
	        transpiler.append(")");
	    } else if(type==IntegerType.instance()) {
	        transpiler.append("isAnInteger(");
	        this.left.transpile(transpiler);
	        transpiler.append(")");
	    } else if(type==DecimalType.instance()) {
	        transpiler.append("isADecimal(");
	        this.left.transpile(transpiler);
	        transpiler.append(")");
	    } else if(type==TextType.instance()) {
	        transpiler.append("isAText(");
	        this.left.transpile(transpiler);
	        transpiler.append(")");
	    } else if(type==CharacterType.instance()) {
	        transpiler.append("isACharacter(");
	        this.left.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        this.left.transpile(transpiler);
	        transpiler.append(" instanceof ");
	        this.right.transpile(transpiler);
	    }
	}

	private void transpileRoughly(Transpiler transpiler) {
	    transpiler.append("removeAccents(");
	    this.left.transpile(transpiler);
	    transpiler.append(").toLowerCase() === removeAccents(");
	    this.right.transpile(transpiler);
	    transpiler.append(").toLowerCase()");
	}

	private void transpileIsNot(Transpiler transpiler) {
	    this.left.transpile(transpiler);
	    transpiler.append(" !== ");
	    this.right.transpile(transpiler);
	}

	private void transpileIs(Transpiler transpiler) {
	    this.left.transpile(transpiler);
	    transpiler.append(" === ");
	    this.right.transpile(transpiler);
	}
	
	
	private void transpileEquals(Transpiler transpiler) {
	    IType lt = this.left.check(transpiler.getContext());
	    if(lt == BooleanType.instance() || lt == IntegerType.instance() || lt == DecimalType.instance() || lt == CharacterType.instance() || lt == TextType.instance()) {
	        this.left.transpile(transpiler);
	        transpiler.append(" === ");
	        this.right.transpile(transpiler);
	    } else {
	        this.left.transpile(transpiler);
	        transpiler.append(".equals(");
	        this.right.transpile(transpiler);
	        transpiler.append(")");
	    }
	}

	private void transpileNotEquals(Transpiler transpiler) {
	    IType lt = this.left.check(transpiler.getContext());
	    if(lt == BooleanType.instance() || lt == IntegerType.instance() || lt == DecimalType.instance() || lt == CharacterType.instance() || lt == TextType.instance()) {
	        this.left.transpile(transpiler);
	        transpiler.append(" !== ");
	        this.right.transpile(transpiler);
	    } else {
	    	transpiler.append("!");
	        this.left.transpile(transpiler);
	        transpiler.append(".equals(");
	        this.right.transpile(transpiler);
	        transpiler.append(")");
	    }
	}
	
	private void transpileContains(Transpiler transpiler) {
	    this.left.transpile(transpiler);
	    transpiler.append(".contains(");
	    this.right.transpile(transpiler);
	    transpiler.append(")");
	};
	
	
	private void transpileNotContains(Transpiler transpiler) {
    	transpiler.append("!");
    	transpileNotContains(transpiler);
	}
	
	@Override
	public void declareQuery(Transpiler transpiler) {
	    transpiler.require("MatchOp");
	    this.left.declare(transpiler);
	    this.right.declare(transpiler);
	}
	
	@Override
	public void transpileQuery(Transpiler transpiler, String builderName) {
	    AttributeDeclaration decl = left.checkAttribute(transpiler.getContext(), this);
        if(decl==null || !decl.isStorable(transpiler.getContext()))
        		throw new SyntaxError("Unable to interpret predicate");
	    AttributeInfo info = decl.getAttributeInfo(transpiler.getContext());
	    MatchOp matchOp = this.getMatchOp();
	    // TODO check for dbId field of instance value
	    transpiler.append(builderName).append(".verify(").append(info.toTranspiled()).append(", MatchOp.").append(matchOp.name()).append(", ");
	    right.transpile(transpiler);
	    transpiler.append(");").newLine();
	    if (operator.isNot()) 
	        transpiler.append(builderName).append(".not();").newLine();
	}
	
	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
	    transpiler.append("(");
	    this.left.transpile(transpiler);
	    transpiler.append(") + ' ").append(this.operator.toString(dialect)).append(" ' + (");
	    this.right.transpile(transpiler);
	    transpiler.append(")");
	}

}
