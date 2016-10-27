package prompto.store;

import prompto.declaration.AttributeInfo;
import prompto.error.InvalidValueError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IQuery.MatchOp;
import prompto.type.CategoryType;
import prompto.type.IType.Family;
import prompto.value.IValue;

public abstract class QueryInterpreterBase implements IQueryInterpreter {

	protected Context context;
	
	protected QueryInterpreterBase(Context context) {
		this.context = context;
	}

	@Override
	public IQuery buildFetchOneQuery(CategoryType type, IPredicateExpression predicate) throws PromptoError {
		IQuery q = newQuery();
		if(type!=null)
			q.<String>verify(new AttributeInfo("category", Family.TEXT, true, null), MatchOp.CONTAINS, type.getTypeName());
		if(predicate!=null)
			predicate.interpretQuery(context, q);
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
		IQuery q = newQuery();
		if(type!=null)
			q.<String>verify(new AttributeInfo("category", Family.TEXT, true, null), MatchOp.CONTAINS, type.getTypeName());
		q.setFirst(getLimit(context, start));
		q.setLast(getLimit(context, end));
		if(orderBy!=null)
			orderBy.interpretQuery(context, q);
		if(predicate!=null)
			predicate.interpretQuery(context, q);
		if(type!=null && predicate!=null)
			q.and();
		return q;
	}

	private Long getLimit(Context context, IExpression exp) throws PromptoError {
		if(exp==null)
			return null;
		IValue value = exp.interpret(context);
		if(!(value instanceof prompto.value.Integer))
			throw new InvalidValueError("Expecting an Integer, got:" + value.getType().toString());
		return ((prompto.value.Integer)value).longValue();
	}
}
