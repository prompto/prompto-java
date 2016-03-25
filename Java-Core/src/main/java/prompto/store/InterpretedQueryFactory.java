package prompto.store;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IQuery.MatchOp;
import prompto.type.CategoryType;
import prompto.value.IValue;

public class InterpretedQueryFactory<T> implements IQueryFactory<T> {

	Context context;
	
	public InterpretedQueryFactory(Context context) {
		this.context = context;
	}

	@Override
	public IQuery buildFetchOneQuery(CategoryType type, IPredicateExpression predicate) throws PromptoError {
		IQuery q = new Query(context);
		if(type!=null)
			q.<String>verify("category", MatchOp.CONTAINS, type.getTypeName());
		if(predicate!=null)
			predicate.interpretPredicate(context, q);
		if(type!=null && predicate!=null)
			q.and();
		return q;
	}

	@Override
	public IQuery buildFetchManyQuery(CategoryType type, 
			IExpression start, IExpression end, 
			IPredicateExpression predicate, 
			OrderByClauseList orderBy)
			throws PromptoError {
		IQuery q = new Query(context);
		if(type!=null)
			q.<String>verify("category", MatchOp.CONTAINS, type.getTypeName());
		q.setFirst(getLong(context, start));
		q.setLast(getLong(context, end));
		if(orderBy!=null)
			orderBy.interpretQuery(context, q);
		if(predicate!=null)
			predicate.interpretPredicate(context, q);
		if(type!=null && predicate!=null)
			q.and();
		return q;
	}

	private Long getLong(Context context, IExpression exp) throws PromptoError {
		if(exp==null)
			return null;
		IValue value = exp.interpret(context);
		if(!(value instanceof prompto.value.Integer))
			throw new InvalidDataError("Expecting an Integer, got:" + value.getType().toString());
		return ((prompto.value.Integer)value).longValue();
	}
}
