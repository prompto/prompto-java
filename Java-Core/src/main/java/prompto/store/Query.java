package prompto.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import prompto.runtime.Context;

public class Query implements IQuery {

	Context context;
	Stack<IPredicate> predicates = new Stack<>();
	List<IOrderBy> orderBys = new ArrayList<>();
	Long first; // 1 based
	Long last; // 1 based
	
	public Query(Context context) {
		this.context = context;
	}

	public IPredicate getPredicate() {
		if(predicates.isEmpty())
			return null;
		else
			return predicates.peek();
	}
	
	@Override
	public void setFirst(Long first) {
		this.first = first;
	}
	
	@Override
	public Long getFirst() {
		return first;
	}
	
	@Override
	public void setLast(Long last) {
		this.last = last;
	}
	
	@Override
	public Long getLast() {
		return last;
	}
	
	public Collection<IOrderBy> getOrdering() {
		if(orderBys.isEmpty())
			return null;
		else
			return orderBys;
	}
	
	@Override
	public void addOrderByClause(String fieldName, boolean descending) {
		orderBys.add(new OrderBy(fieldName, descending));
	}
	
	@Override
	public <T> void verify(String fieldName, MatchOp match, T fieldValue) {
		predicates.push(new MatchesPredicate<T>(fieldName, match, fieldValue));
	}

	@Override
	public void and() {
		IPredicate right = predicates.pop();
		IPredicate left = predicates.pop();
		predicates.push(new AndPredicate(left, right));
	}

	@Override
	public void or() {
		IPredicate right = predicates.pop();
		IPredicate left = predicates.pop();
		predicates.push(new OrPredicate(left, right));
	}

	@Override
	public void not() {
		predicates.push(new NotPredicate(predicates.pop()));
	}



}
