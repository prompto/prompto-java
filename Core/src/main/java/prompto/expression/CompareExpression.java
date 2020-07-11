package prompto.expression;

import java.util.HashMap;
import java.util.Map;

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
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoTime;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.Dialect;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.AttributeInfo;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.VersionType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.StoreUtils;
import prompto.value.BooleanValue;
import prompto.value.IInstance;
import prompto.value.IValue;

public class CompareExpression extends Section implements IPredicateExpression, IAssertion {

	IExpression left;
	CmpOp operator;
	IExpression right;

	public CompareExpression(IExpression left, CmpOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left.toString() + " " + operator.toString() + " " + right.toString();
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
	public IType check(Context context) {
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

	private BooleanValue compare(Context context, IValue lval, IValue rval) throws PromptoError {
		int cmp = lval.compareTo(context, rval);
		switch (operator) {
		case GT:
			return BooleanValue.valueOf(cmp > 0);
		case LT:
			return BooleanValue.valueOf(cmp < 0);
		case GTE:
			return BooleanValue.valueOf(cmp >= 0);
		case LTE:
			return BooleanValue.valueOf(cmp <= 0);
		default:
			throw new SyntaxError("Illegal compare operand: " + operator.toString());
		}
	}
	
	static Map<Class<?>, IOperatorFunction> testers = createTesters();
	
	private static Map<Class<?>, IOperatorFunction> createTesters() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>(); 
		map.put(char.class, CharacterType::compileCompareTo);
		map.put(java.lang.Character.class, CharacterType::compileCompareTo); 
		map.put(String.class, TextType::compileCompareTo); 
		map.put(double.class, DecimalType::compileCompareTo);
		map.put(Double.class, DecimalType::compileCompareTo); 
		map.put(long.class, IntegerType::compileCompareTo);
		map.put(Long.class, IntegerType::compileCompareTo); 
		map.put(PromptoDate.class, DateType::compileCompareTo); 
		map.put(PromptoDateTime.class, DateTimeType::compileCompareTo); 
		map.put(PromptoTime.class, TimeType::compileCompareTo); 
		map.put(PromptoVersion.class, VersionType::compileCompareTo); 
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags.withPrimitive(true));
		IOperatorFunction tester = testers.get(lval.getType());
		if(tester==null) {
			System.err.println("Missing IOperatorFunction for compare " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot compare " + lval.getType().getTypeName() + " with " + right.check(context).getFamilyInfo(context));
		}
		return tester.compile(context, method, flags.withCmpOp(operator), lval, right);
	}
	
	@Override
	public IType checkQuery(Context context) throws PromptoError {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null)
			return VoidType.instance();
		if(!decl.isStorable(context)) {
			context.getProblemListener().reportNotStorable(this, decl.getName());	
			return VoidType.instance();
		}
		IType rt = right.check(context);
		return decl.getType().checkCompare(context, rt, this);
	}
	
	@Override
	public void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError {
		AttributeDeclaration decl = left.checkAttribute(context, this);
		if(decl==null || !decl.isStorable(context))
			throw new SyntaxError("Unable to interpret predicate: " + this.toString());
		AttributeInfo info = StoreUtils.getAttributeInfo(context, decl.getName(), store);
		IValue value = right.interpret(context);
		if(value instanceof IInstance)
			value = ((IInstance)value).getMember(context, new Identifier(IStore.dbIdName), false);
		MatchOp matchOp = getMatchOp();
		query.verify(info, matchOp, value==null ? null : value.getStorableData());
		switch(operator) {
		case GTE:
		case LTE:
			query.not();
			break;
		default:
			// nothing to do
		}
	}
	
	private MatchOp getMatchOp() {
		switch(operator) {
		case GT:
		case LTE:
			return MatchOp.GREATER;
		case GTE:
		case LT:
			return MatchOp.LESSER;
		default:
			throw new IllegalArgumentException(operator.name());
		}
	}

	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		boolean reverse = compileAttributeInfo(context, method, flags);
		MatchOp match = getMatchOp();
		CompilerUtils.compileJavaEnum(context, method, flags, match);
		if(reverse)
			left.compile(context, method, flags);
		else
			right.compile(context, method, flags);
		InterfaceConstant m = new InterfaceConstant(IQueryBuilder.class,
				"verify", AttributeInfo.class, MatchOp.class, Object.class, IQueryBuilder.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
		switch(operator) {
		case GTE:
		case LTE:
			m = new InterfaceConstant(IQueryBuilder.class, "not", IQueryBuilder.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, m);
			break;
		default:
			// ok
		}
	}
	
	
	private boolean compileAttributeInfo(Context context, MethodInfo method, Flags flags) {
		String name = readFieldName(left);
		boolean reverse = name==null;
		if(reverse)
			name = readFieldName(right);
		AttributeInfo info = context.findAttribute(name).getAttributeInfo(context);
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

	
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = compare(context, lval, rval);
		if(result==BooleanValue.TRUE) 
			return true;
		String expected = buildExpectedMessage(context, test);
		String actual = lval.toString() + " " + operator.toString() + " " + rval.toString();
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
		CompareExpression newExp = new CompareExpression(newLeft, this.operator, newRight);
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
		MethodConstant toString = new MethodConstant(leftInfo.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, toString);
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		method.addInstruction(Opcode.LDC, new StringConstant(" " + operator.toString() + " "));
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		CompilerUtils.compileALOAD(method, right);
		toString = new MethodConstant(rightInfo.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, toString);
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
	public void declare(Transpiler transpiler) {
	    this.left.declare(transpiler);
	    this.right.declare(transpiler);
	    IType lt = this.left.check(transpiler.getContext());
	    IType rt = this.right.check(transpiler.getContext());
	    lt.declareCompare(transpiler, rt);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IType lt = this.left.check(transpiler.getContext());
		IType rt = this.right.check(transpiler.getContext());
	    lt.transpileCompare(transpiler, rt, this.operator, this.left, this.right);
	    return false;
	}
	
	@Override
	public void transpileQuery(Transpiler transpiler, String builderName) {
	    String name = null;
	    IExpression value = null;
	    if (this.left instanceof UnresolvedIdentifier || this.left instanceof InstanceExpression || this.left instanceof MemberSelector) {
	        name = this.left.toString();
	        value = this.right;
	    } else if (this.right instanceof UnresolvedIdentifier || this.right instanceof InstanceExpression || this.right instanceof MemberSelector) {
	        name = this.right.toString();
	        value = this.left;
	    }
	    AttributeDeclaration decl = transpiler.getContext().findAttribute(name);
	    AttributeInfo info = decl == null ? null : decl.getAttributeInfo(transpiler.getContext());
	    MatchOp matchOp = this.getMatchOp();
	    // TODO check for dbId field of instance value
	    transpiler.append(builderName).append(".verify(").append(info.toTranspiled()).append(", MatchOp.").append(matchOp.name()).append(", ");
	    value.transpile(transpiler);
	    transpiler.append(");").newLine();
	    if (this.operator == CmpOp.GTE || this.operator==CmpOp.LTE)
	        transpiler.append(builderName).append(".not();").newLine();
	}
	
	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
	    transpiler.append("(");
	    this.left.transpile(transpiler);
	    transpiler.append(") + '").append(this.operator.toString()).append("' + (");
	    this.right.transpile(transpiler);
	    transpiler.append(")");
	}
	

}
