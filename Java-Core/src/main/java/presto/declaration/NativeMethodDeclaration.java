package presto.declaration;

import presto.error.PrestoError;
import presto.grammar.ArgumentList;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.statement.IStatement;
import presto.statement.StatementList;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class NativeMethodDeclaration extends ConcreteMethodDeclaration {

	public NativeMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType, StatementList instructions) {
		super(name,arguments,returnType, instructions);
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		context.enterMethod(this);
		try {
			return statements.interpret(context, true);
		} finally {
			context.leaveMethod(this);
		}
	}
	
	@Override
	protected void toPDialect(CodeWriter writer) {
		writer.append("def native ");
		writer.append(name);
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
		writer.append(name);
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
		writer.append(name);
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
