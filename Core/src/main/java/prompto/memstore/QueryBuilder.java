package prompto.memstore;

import prompto.store.AttributeInfo;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;

public class QueryBuilder implements IQueryBuilder {

	Query query = new Query();

	@Override
	public <T> void verify(AttributeInfo info, MatchOp match, T fieldValue) {
		query.verify(info, match, fieldValue);
	}

	@Override
	public void and() {
		query.and();
	}

	@Override
	public void or() {
		query.or();
	}

	@Override
	public void not() {
		query.not();
	}

	@Override
	public void setFirst(Long first) {
		query.setFirst(first);
	}

	@Override
	public void setLast(Long last) {
		query.setLast(last);
	}

	@Override
	public void addOrderByClause(AttributeInfo attribute, boolean descending) {
		query.addOrderByClause(attribute, descending);
	}

	@Override
	public IQuery build() {
		return query;
	}
	
	
}
