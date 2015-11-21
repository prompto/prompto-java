package prompto.statement;

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
	StatementList instructions;
	
	public DoWhileStatement(IExpression condition, StatementList instructions) {
		this.condition = condition;
		this.instructions = instructions;
	}
	
	public IExpression getCondition() {
		return condition;
	}
	
	public StatementList getInstructions() {
		return instructions;
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
		instructions.toDialect(writer);
		writer.dedent();
		writer.append("while ");
		condition.toDialect(writer);
		writer.newLine();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("do {\n");
		writer.indent();
		instructions.toDialect(writer);
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
		return instructions.check(child, null);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		do {
			Context child = context.newChildContext();
			IValue value = instructions.interpret(child);
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


}
