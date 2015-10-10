package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IResource;
import prompto.value.IValue;

public class WithResourceStatement extends BaseStatement {

	AssignVariableStatement resource;
	StatementList instructions;
	
	public WithResourceStatement(AssignVariableStatement resource, StatementList instructions) {
		this.resource = resource;
		this.instructions = instructions;
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
		resource.toDialect(writer);
		writer.append(", do:\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	private void toODialect(CodeWriter writer) {
		writer.append("with (");
		resource.toDialect(writer);
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
		resource.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}


	@Override
	public IType check(Context context) throws SyntaxError {
		context = context.newResourceContext();
		resource.checkResource(context);
		return instructions.check(context, null);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		context = context.newResourceContext();
		try {
			resource.interpret(context);
			return instructions.interpret(context);
		} finally {
			Object res = context.getValue(resource.getName());
			if(res instanceof IResource)
				((IResource)res).close();
		}
	}

}
