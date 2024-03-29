package prompto.statement;

import java.util.ArrayList;
import java.util.List;

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
import prompto.expression.IExpression;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.runtime.BreakResult;
import prompto.runtime.Context;
import prompto.store.InvalidValueError;
import prompto.transpiler.Transpiler;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.BooleanValue;
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
	
	public StatementList getStatements() {
		return statements;
	}	
	
	@Override
	public ICodeSection locateCodeSection(ISection section) {
		ICodeSection result = statements.locateCodeSection(section);
		return result!=null ? result : super.locateCodeSection(section);
	}
	
	@Override
	public boolean canReturn() {
		return true;
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
		case M:
			toMDialect(writer);
			break;
		}
	}

	private void toMDialect(CodeWriter writer) {
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
	public IType check(Context context) {
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
			if(value==BreakResult.instance())
				break;
			if(value!=null)
				return value;
		} while(interpretCondition(context));
		return null;
	}

	private boolean interpretCondition(Context context) throws PromptoError {
		Object value = condition.interpret(context);
		if(!(value instanceof BooleanValue))
			throw new InvalidValueError("Expected a Boolean, got:" + value.getClass().getSimpleName());
		return ((BooleanValue)value).getValue();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		List<IInstructionListener> breakLoopListeners = new ArrayList<>();
		flags = flags.withBreakLoopListeners(breakLoopListeners);
		StackState neutralState = method.captureStackState();
		method.placeLabel(neutralState);
		IInstructionListener loop = method.addOffsetListener(new OffsetListenerConstant(true));
		method.activateOffsetListener(loop);
		statements.compile(context, method, flags);
		// check condition
		ResultInfo info = condition.compile(context, method, flags.withPrimitive(true));
		if(BooleanValue.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		// loop if not done
		method.inhibitOffsetListener(loop);
		method.addInstruction(Opcode.IFNE, loop);
		// add labels for break statements
		if(!breakLoopListeners.isEmpty()) {
			for(IInstructionListener listener : breakLoopListeners)
				method.inhibitOffsetListener(listener);
			method.restoreFullStackState(neutralState);
			method.placeLabel(neutralState);
		}
		// TODO manage return value in loop
		return new ResultInfo(void.class);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    this.condition.declare(transpiler);
	    transpiler = transpiler.newChildTranspiler();
	    this.statements.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("do {").indent();
		Transpiler child = transpiler.newChildTranspiler();
		this.statements.transpile(child);
		child.dedent().flush();
		transpiler.append("} while(");
		this.condition.transpile(transpiler);
		transpiler.append(")");
		return true;
	}
	
}
