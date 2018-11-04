package prompto.statement;

import prompto.expression.FetchManyExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClauseList;
import prompto.type.CategoryType;

public class FetchManyStatement extends FetchManyExpression implements IStatement {

	Identifier name;
	StatementList stmts;
	
	public FetchManyStatement(CategoryType category, IExpression start, IExpression stop, IExpression predicate, OrderByClauseList orderBy, Identifier name, StatementList stmts) {
		super(category, start, stop, predicate, orderBy);
		this.name = name;
		this.stmts = stmts;
	}

}
