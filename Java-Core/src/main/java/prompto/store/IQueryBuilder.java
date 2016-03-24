package prompto.store;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.type.CategoryType;

public interface IQueryBuilder<T> {
	
	IQuery buildFetchOneQuery(CategoryType type, IExpression filter) throws PromptoError;
	IQuery buildFetchManyQuery(CategoryType type, 
			IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;

}
