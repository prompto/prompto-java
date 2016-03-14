package prompto.expression;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.store.IFilterBuilder;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class AndExpression implements IExpression, IAssertion {

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
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(operatorToDialect(writer.getDialect()));
		right.toDialect(writer);
	}
	
	private String operatorToDialect(Dialect dialect) {
		switch(dialect) {
		case E:
		case S:
			return " and ";
		case O:
			return " && ";
		default:
			throw new RuntimeException("Unsupported: " + dialect.name());	
		}
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		if(!(lt instanceof BooleanType) || !(rt instanceof BooleanType))
			throw new SyntaxError("Cannot combine " + lt.getId() + " and " + rt.getId());
		return BooleanType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		return interpret(lval, rval);
	}
	
	private IValue interpret(IValue lval, IValue rval) throws PromptoError {
		if(lval instanceof Boolean) {
			if(rval instanceof Boolean)
				return Boolean.valueOf(((Boolean)lval).getValue() && ((Boolean)rval).getValue());
			else
				throw new SyntaxError("Illegal: Boolean and " + rval.getClass().getSimpleName());
		} else
			throw new SyntaxError("Illegal: " + lval.getClass().getSimpleName() + " + " + rval.getClass().getSimpleName());
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo li = left.compile(context, method, flags.withNative(true));
		if(Boolean.class==li.getType())
			CompilerUtils.BooleanToboolean(method);
		IInstructionListener olc = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(olc);
		method.addInstruction(Opcode.IFEQ, olc);
		ResultInfo ri = right.compile(context, method, flags.withNative(true));
		if(Boolean.class==ri.getType())
			CompilerUtils.BooleanToboolean(method);
		method.addInstruction(Opcode.IFEQ, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreStackState(branchState);
		method.placeLabel(branchState);
		method.inhibitOffsetListener(olc);
		method.addInstruction(Opcode.ICONST_0);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toNative())
			return new ResultInfo(boolean.class, false);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = interpret(lval, rval);
		if(result==Boolean.TRUE) 
			return true;
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		String expected = writer.toString();
		String actual = lval.toString() + operatorToDialect(test.getDialect()) + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}

	@Override
	public void toFilter(Context context, IFilterBuilder builder) throws PromptoError {
		left.toFilter(context, builder);
		right.toFilter(context, builder);
		builder.and();
	}


}
