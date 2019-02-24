package prompto.expression;

import prompto.error.PromptoError;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.statement.IStatement;
import prompto.statement.ReturnStatement;
import prompto.statement.StatementList;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class ArrowExpression extends Section implements IExpression {

	IdentifierList args;
	String argsSuite;
	String arrowSuite;
	StatementList statements;
	
	public ArrowExpression(IdentifierList args, String argsSuite, String arrowSuite) {
		this.args = args;
		this.argsSuite = argsSuite;
		this.arrowSuite = arrowSuite;
	}
	
	public IdentifierList getArgs() {
		return args;
	}

	@Override
	public IType check(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return this.statements.interpret(context);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		throw new UnsupportedOperationException();
	}

	public void setExpression(IExpression expression) {
		IStatement stmt = new ReturnStatement(expression);
		this.statements = new StatementList(stmt);
	}
	
	public void setStatements(StatementList statements) {
		this.statements = statements;
	}

	
}
