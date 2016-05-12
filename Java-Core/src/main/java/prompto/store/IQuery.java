package prompto.store;

import prompto.declaration.AttributeInfo;


public interface IQuery {

	public static enum MatchOp {
		EQUALS,
		ROUGHLY,
		CONTAINS,
		CONTAINED,
		GREATER,
		LESSER
	}
	
	// create atomic predicates
	<T> void verify(AttributeInfo attribute, MatchOp match, T fieldValue);
	// the below make the assumption that the atomic predicates are available from a stack
	void and();
	void or();
	void not();
	// 1 based range limits
	void setFirst(Long start); 
	void setLast(Long end);
	Long getFirst();
	Long getLast();
	// ordering
	void addOrderByClause(AttributeInfo attribute, boolean descending);

}
