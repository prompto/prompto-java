package presto.declaration;

import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;
import presto.utils.CodeWriter;

public class GetterMethodDeclaration extends ConcreteMethodDeclaration implements IExpression {

	public GetterMethodDeclaration(Identifier name, StatementList statements) {
		super(name, null, null, statements);
	}
	
	@Override
	protected void toODialect(CodeWriter writer) {
		writer.append("getter ");
		writer.append(getName());
		writer.append(" {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}

	@Override
	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" getter doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	@Override
	protected void toPDialect(CodeWriter writer) {
		writer.append("def ");
		writer.append(getName());
		writer.append(" getter():\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		return null;
	}

}
