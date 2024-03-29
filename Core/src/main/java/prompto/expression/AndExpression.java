package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
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
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.CodeSection;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.BooleanValue;
import prompto.value.IValue;

public class AndExpression extends CodeSection implements IPredicate, IAssertion {

	IExpression left;
	IExpression right;
	
	public AndExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	public IExpression getLeft() {
		return left;
	}
	
	public IExpression getRight() {
		return right;
	}
	
	@Override
	public String toString() {
		return left.toString() + " and " + right.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(operatorToDialect(writer.getDialect()));
		right.toDialect(writer);
	}
	
	private String operatorToDialect(Dialect dialect) {
		switch(dialect) {
		case E:
		case M:
			return " and ";
		case O:
			return " && ";
		default:
			throw new RuntimeException("Unsupported: " + dialect.name());	
		}
	}

	@Override
	public IType check(Context context) {
		IType lt = left.check(context);
		if(!(lt instanceof BooleanType))
			context.getProblemListener().reportIllegalPredicate(this, left);
		IType rt = right.check(context);
		if(!(rt instanceof BooleanType))
			context.getProblemListener().reportIllegalPredicate(this, right);
		return BooleanType.instance();
	}
	
	@Override
	public void checkQuery(Context context) throws PromptoError {
		if(!(left instanceof IPredicate))
			context.getProblemListener().reportIllegalPredicate(this,left);
		((IPredicate)left).checkQuery(context);
		if(!(right instanceof IPredicate))
			context.getProblemListener().reportIllegalPredicate(this, right);
		((IPredicate)right).checkQuery(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		if(!(lval instanceof BooleanValue))
			throw new SyntaxError("Illegal: " + lval.getClass().getSimpleName() + " and ..., expected a Boolean" );
		if(!((BooleanValue)lval).getValue())	
			return lval;
		IValue rval = right.interpret(context);
		if(!(rval instanceof BooleanValue))
			throw new SyntaxError("Illegal: Boolean and " + rval.getClass().getSimpleName());
		return rval;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo li = left.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==li.getType())
			CompilerUtils.BooleanToboolean(method);
		IInstructionListener finalOffset = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalOffset);
		method.addInstruction(Opcode.IFEQ, finalOffset);
		ResultInfo ri = right.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==ri.getType())
			CompilerUtils.BooleanToboolean(method);
		method.addInstruction(Opcode.IFEQ, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreFullStackState(branchState);
		method.placeLabel(branchState);
		method.inhibitOffsetListener(finalOffset);
		method.addInstruction(Opcode.ICONST_0);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		((IPredicate)left).compileQuery(context, method, flags);
		((IPredicate)right).compileQuery(context, method, flags);
		InterfaceConstant m = new InterfaceConstant(IQueryBuilder.class, "and", IQueryBuilder.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, m);
	}


	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		if(!(lval instanceof BooleanValue))
			throw new SyntaxError("Illegal: " + lval.getClass().getSimpleName() + " and ..., expected a Boolean" );
		IValue rval = BooleanValue.FALSE; 
		if(((BooleanValue)lval).getValue())	{
			rval = right.interpret(context);
			if(!(rval instanceof BooleanValue))
				throw new SyntaxError("Illegal: Boolean and " + rval.getClass().getSimpleName());
			if(rval==BooleanValue.TRUE) 
				return true;
		}
		String expected = buildExpectedMessage(context, test);
		String actual = lval.toString() + operatorToDialect(test.getDialect()) + rval.toString();
		test.printFailedAssertion(context, expected, actual);
		return false;
	}
	
	@Override
	public void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError {
		if(!(left instanceof IPredicate))
			throw new SyntaxError("Not a predicate: " + left.toString());
		((IPredicate)left).interpretQuery(context, query, store);
		if(!(right instanceof IPredicate))
			throw new SyntaxError("Not a predicate: " + left.toString());
		((IPredicate)right).interpretQuery(context, query, store);
		query.and();
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
		ResultInfo info = this.left.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		String leftName = method.nextTransientName("left");
		StackLocal left = method.registerLocal(leftName, VerifierType.ITEM_Integer, new ClassConstant(boolean.class));
		CompilerUtils.compileISTORE(method, left);
		// compile right and store in local
		info = this.right.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		String rightName = method.nextTransientName("right");
		StackLocal right = method.registerLocal(rightName, VerifierType.ITEM_Integer, new ClassConstant(boolean.class));
		CompilerUtils.compileISTORE(method, right);
		// check success of left and right
		CompilerUtils.compileILOAD(method, left);
		CompilerUtils.compileILOAD(method, right);
		method.addInstruction(Opcode.IADD);
		method.addInstruction(Opcode.ICONST_2);
		method.addInstruction(Opcode.ISUB);
		// 0 = success
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.IFEQ, finalListener); 
		// increment failure counter
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.IADD);
		// build failure message
		String message = buildExpectedMessage(context, test);
		message = test.buildFailedAssertionMessagePrefix(message);
		method.addInstruction(Opcode.LDC, new StringConstant(message));
		CompilerUtils.compileILOAD(method, left);
		MethodConstant valueOf = new MethodConstant(String.class, "valueOf", boolean.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, valueOf);
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		method.addInstruction(Opcode.LDC, new StringConstant(operatorToDialect(test.getDialect())));
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		CompilerUtils.compileILOAD(method, right);
		method.addInstruction(Opcode.INVOKESTATIC, valueOf);
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
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.left.transpile(transpiler);
	    transpiler.append(" && ");
	    this.right.transpile(transpiler);
	    return false;
	}
	
	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
	    transpiler.append("(");
	    this.left.transpile(transpiler);
	    transpiler.append(") + '").append(this.operatorToDialect(dialect)).append("' + (");
	    this.right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareQuery(Transpiler transpiler) {
	    if(left instanceof IPredicate)
	    	((IPredicate)left).declareQuery(transpiler);
	    else
	    	transpiler.getContext().getProblemListener().reportIllegalPredicate(this, left);
	    if(right instanceof IPredicate)
	    	((IPredicate)right).declareQuery(transpiler);
	    else
	    	transpiler.getContext().getProblemListener().reportIllegalPredicate(this, right);
	}
	
	@Override
	public void transpileQuery(Transpiler transpiler, String builderName) {
	    if(left instanceof IPredicate)
	    	((IPredicate)left).transpileQuery(transpiler, builderName);
	    else
	    	transpiler.getContext().getProblemListener().reportIllegalPredicate(this, left);
	    if(right instanceof IPredicate)
	    	((IPredicate)right).transpileQuery(transpiler, builderName);
	    else
	    	transpiler.getContext().getProblemListener().reportIllegalPredicate(this, right);
	    transpiler.append(builderName).append(".and();").newLine();
	}

}
