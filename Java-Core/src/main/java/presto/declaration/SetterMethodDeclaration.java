package presto.declaration;

import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;
import presto.utils.CodeWriter;

public class SetterMethodDeclaration extends ConcreteMethodDeclaration implements IExpression {

	public SetterMethodDeclaration(Identifier name, StatementList statements) {
		super(name, null, null, statements);
	}

	@Override
	protected void toODialect(CodeWriter writer) {
		writer.append("setter ");
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
		writer.append(" setter doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}	

	@Override
	protected void toPDialect(CodeWriter writer) {
		writer.append("def ");
		writer.append(getName());
		writer.append(" setter():\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}	

	@Override
	public void check(ConcreteCategoryDeclaration category, Context context) {
		// TODO Auto-generated method stub
	}
	

	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		return null;
	}

}
