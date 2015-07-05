package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.ConcreteInstance;
import prompto.value.IValue;

public class WithSingletonStatement extends BaseStatement {

	CategoryType type;
	StatementList instructions;

	public WithSingletonStatement(CategoryType type, StatementList instructions) {
		this.type = type;
		this.instructions = instructions;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		Context instanceContext = context.newInstanceContext(type);
		Context childContext = instanceContext.newChildContext();
		return instructions.check(childContext);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		// TODO synchronize
		ConcreteInstance instance = context.loadSingleton(type);
		Context instanceContext = context.newInstanceContext(instance);
		Context childContext = instanceContext.newChildContext();
		return instructions.interpret(childContext);
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
			toPDialect(writer);
			break;
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		writer.append("with ");
		type.toDialect(writer);
		writer.append(", do:\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("with (");
		type.toDialect(writer);
		writer.append(")");
		boolean oneLine = instructions.size()==1 && (instructions.get(0) instanceof SimpleStatement);
		if(!oneLine)
			writer.append(" {");
		writer.newLine();
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		if(!oneLine) {
			writer.append("}");
			writer.newLine();
		}		
	}

	private void toPDialect(CodeWriter writer) {
		writer.append("with ");
		type.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}
	
}
