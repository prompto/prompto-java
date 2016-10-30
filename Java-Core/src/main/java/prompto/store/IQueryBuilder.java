package prompto.store;



public interface IQueryBuilder {

	public static enum MatchOp {
		EQUALS,
		ROUGHLY,
		CONTAINS,
		CONTAINED,
		GREATER,
		LESSER
	}
	
	// create atomic predicates
	<T> void verify(AttributeInfo info, MatchOp match, T fieldValue);
	// the below make the assumption that the atomic predicates are available from a stack
	void and();
	void or();
	void not();
	// 1 based range limits
	void setFirst(Long first); 
	void setLast(Long last);
	// ordering
	void addOrderByClause(AttributeInfo attribute, boolean descending);
	// return the built IQuery object
	IQuery build();


}
