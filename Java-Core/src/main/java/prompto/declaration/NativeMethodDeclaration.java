package prompto.declaration;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.statement.IStatement;
import prompto.statement.StatementList;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class NativeMethodDeclaration extends ConcreteMethodDeclaration {

	public NativeMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType, StatementList instructions) {
		super(name, arguments, returnType, instructions);
	}

	@Override
	protected IType checkStatements(Context context) throws SyntaxError {
		return statements.checkNative(context, returnType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		context.enterMethod(this);
		try {
			return statements.interpretNative(context, returnType);
		} finally {
			context.leaveMethod(this);
		}
	}
	
	@Override
	protected void toPDialect(CodeWriter writer) {
		writer.append("def native ");
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(")");
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("->");
			returnType.toDialect(writer);
		}
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	@Override
	protected void toODialect(CodeWriter writer) {
		if(returnType!=null  && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("native method ");
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		for(IStatement statement : statements) {
			statement.toDialect(writer);
			writer.newLine();
		}
		writer.dedent();
		writer.append("}\n");
	}
	
	@Override
	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" as: native method ");
		arguments.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning: ");
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("\n");
	}
	
}
