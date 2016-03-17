package prompto.statement;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackState;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class DoWhileStatement extends BaseStatement {

	IExpression condition;
	StatementList statements;
	
	public DoWhileStatement(IExpression condition, StatementList statements) {
		this.condition = condition;
		this.statements = statements;
	}
	
	public IExpression getCondition() {
		return condition;
	}
	
	public StatementList getInstructions() {
		return statements;
	}	
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}

	private void toSDialect(CodeWriter writer) {
		toEDialect(writer);
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("do:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("while ");
		condition.toDialect(writer);
		writer.newLine();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("do {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("} while (");
		condition.toDialect(writer);
		writer.append(");\n");
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType cond = condition.check(context);
		if(cond!=BooleanType.instance())
			throw new SyntaxError("Expected a Boolean condition!");
		Context child = context.newChildContext();
		return statements.check(child, null);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		do {
			Context child = context.newChildContext();
			IValue value = statements.interpret(child);
			if(value!=null)
				return value;
		} while(interpretCondition(context));
		return null;
	}

	private boolean interpretCondition(Context context) throws PromptoError {
		Object value = condition.interpret(context);
		if(!(value instanceof Boolean))
			throw new InvalidDataError("Expected a Boolean, got:" + value.getClass().getSimpleName());
		return ((Boolean)value).getValue();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StackState neutralState = method.captureStackState();
		method.placeLabel(neutralState);
		IInstructionListener loop = method.addOffsetListener(new OffsetListenerConstant(true));
		method.activateOffsetListener(loop);
		for(IStatement statement : statements)
			statement.compile(context, method, flags);
		ResultInfo info = condition.compile(context, method, flags.withNative(true));
		if(Boolean.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		method.inhibitOffsetListener(loop);
		method.addInstruction(Opcode.IFNE, loop);
		// TODO manage return value in loop
		return new ResultInfo(void.class, false);
	}
	
}
