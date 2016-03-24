package prompto.expression;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class TernaryExpression implements IExpression {

	IExpression condition;
	IExpression ifTrue;
	IExpression ifFalse;
	
	public TernaryExpression(IExpression condition, IExpression ifTrue, IExpression ifFalse) {
		this.condition = condition;
		this.ifTrue = ifTrue;
		this.ifFalse = ifFalse;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.O) {
			condition.toDialect(writer);
			writer.append(" ? ");
			ifTrue.toDialect(writer);
			writer.append(" : ");
			ifFalse.toDialect(writer);
		} else {
			ifTrue.toDialect(writer);
			writer.append(" if ");
			condition.toDialect(writer);
			writer.append(" else ");
			ifFalse.toDialect(writer);
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = condition.check(context);
		if(!(type instanceof BooleanType))
			throw new SyntaxError("Cannot test condition on " +  type.getTypeName() );
		IType trueType = ifTrue.check(context);
		// IType falseType = ifFalse.check(context);
		// TODO check compatibility
		return trueType;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Object test = condition.interpret(context);
		if(test == Boolean.TRUE)
			return ifTrue.interpret(context);
		else
			return ifFalse.interpret(context);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StackState initialState = method.captureStackState();
		ResultInfo li = condition.compile(context, method, flags.withPrimitive(true));
		if(Boolean.class==li.getType())
			CompilerUtils.BooleanToboolean(method);
		IInstructionListener branchListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(branchListener);
		method.addInstruction(Opcode.IFEQ, branchListener);
		ResultInfo result = ifTrue.compile(context, method, flags.withPrimitive(false));
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.GOTO, finalListener);
		method.restoreStackState(initialState);
		method.placeLabel(initialState);
		method.inhibitOffsetListener(branchListener);
		ifFalse.compile(context, method, flags.withPrimitive(false));
		method.inhibitOffsetListener(finalListener);
		StackState finalState = method.captureStackState();
		method.restoreStackState(finalState);
		method.placeLabel(finalState);
		return result;
	}

}
