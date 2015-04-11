package presto.declaration;

import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.ArgumentList;
import presto.grammar.IArgument;
import presto.grammar.Identifier;
import presto.grammar.Operator;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;

public class OperatorMethodDeclaration extends ConcreteMethodDeclaration implements IExpression, ICategoryMethodDeclaration {
	
	Operator operator;
	
	public OperatorMethodDeclaration(Operator op, IArgument arg, IType returnType, StatementList stmts) {
		super(new Identifier("operator_" + op.name()), new ArgumentList(arg), returnType, stmts);
		this.operator = op;
	}


	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}	

	protected void toPDialect(CodeWriter writer) {
		writer.append("def operator ");
		writer.append(operator.getToken());
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

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(operator.getToken());
		writer.append(" as: operator ");
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
	}
	
	protected void toODialect(CodeWriter writer) {
		if(returnType!=null && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("operator ");
		writer.append(operator.getToken());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}
	
}
