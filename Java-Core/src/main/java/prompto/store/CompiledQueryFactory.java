package prompto.store;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.type.CategoryType;

public class CompiledQueryFactory<T> implements IQueryFactory<T> {

	Context context;
	
	public CompiledQueryFactory(Context context) {
		this.context = context;
	}

	@Override
	public IQuery buildFetchOneQuery(CategoryType type, IPredicateExpression filter)
			throws PromptoError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IQuery buildFetchManyQuery(CategoryType type, 
			IExpression start, IExpression end, 
			IPredicateExpression filter, 
			OrderByClauseList orderBy)
			throws PromptoError {
		// TODO Auto-generated method stub
		return null;
	}

}
