package presto.statement;

import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.BooleanType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.IValue;

public class WhileStatement extends BaseStatement {

	IExpression condition;
	StatementList instructions;
	
	public WhileStatement(IExpression condition, StatementList instructions) {
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
		case P:
			toPDialect(writer);
			break;
		}
	}

	private void toPDialect(CodeWriter writer) {
		toEDialect(writer);
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("while ");
		condition.toDialect(writer);
		writer.append(" :\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("while (");
		condition.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}	
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType cond = condition.check(context);
		if(cond!=BooleanType.instance())
			throw new SyntaxError("Expected a Boolean condition!");
		Context child = context.newChildContext();
		return instructions.check(child);
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		while(interpretCondition(context)) {
			Context child = context.newChildContext();
			IValue value = instructions.interpret(child);
			if(value!=null)
				return value;
		}
		return null;
	}

	private boolean interpretCondition(Context context) throws PrestoError {
		Object value = condition.interpret(context);
		if(!(value instanceof Boolean))
			throw new InvalidDataError("Expected a Boolean, got:" + value.getClass().getSimpleName());
		return ((Boolean)value).getValue();
	}
}
