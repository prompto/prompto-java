package prompto.store.memory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import prompto.intrinsic.PromptoDbId;
import prompto.store.AttributeInfo;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder.MatchOp;

public class Query implements IQuery {

	Stack<IPredicate> predicates = new Stack<>();
	List<String> projection = null;
	List<IOrderBy> orderBys = new ArrayList<>();
	Long first; // 1 based
	Long last; // 1 based
	
	public IPredicate getPredicate() {
		if(predicates.isEmpty())
			return null;
		else
			return predicates.peek();
	}
	
	public void setFirst(Long first) {
		this.first = first;
	}
	
	public Long getFirst() {
		return first;
	}
	
	public void setLast(Long last) {
		this.last = last;
	}
	
	public Long getLast() {
		return last;
	}
	
	public Collection<IOrderBy> getOrdering() {
		if(orderBys.isEmpty())
			return null;
		else
			return orderBys;
	}
	
	public void addOrderByClause(AttributeInfo attribute, boolean descending) {
		orderBys.add(new OrderBy(attribute, descending));
	}
	
	public void verify(AttributeInfo info, MatchOp match, Object fieldValue) {
		if(fieldValue instanceof PromptoDbId)
			fieldValue = ((PromptoDbId)fieldValue).getValue();
		predicates.push(new MatchesPredicate(info, match, fieldValue));
	}

	public void and() {
		IPredicate right = predicates.pop();
		IPredicate left = predicates.pop();
		predicates.push(new AndPredicate(left, right));
	}

	public void or() {
		IPredicate right = predicates.pop();
		IPredicate left = predicates.pop();
		predicates.push(new OrPredicate(left, right));
	}

	public void not() {
		predicates.push(new NotPredicate(predicates.pop()));
	}

	public void setProjection(List<String> attributeNames) {
		projection = attributeNames;
	}



}
