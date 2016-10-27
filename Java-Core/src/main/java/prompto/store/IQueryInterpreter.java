package prompto.store;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.type.CategoryType;

public interface IQueryInterpreter extends IQueryFactory {
	
	IQuery buildFetchOneQuery(CategoryType type, IPredicateExpression predicate) throws PromptoError;
	IQuery buildFetchManyQuery(CategoryType type, 
			IExpression start, IExpression end, 
			IPredicateExpression predicate, 
			OrderByClauseList orderBy) throws PromptoError;

}
