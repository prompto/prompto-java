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
	<T> IQueryBuilder verify(AttributeInfo info, MatchOp match, T fieldValue);
	// the below make the assumption that the atomic predicates are available from a stack
	IQueryBuilder and();
	IQueryBuilder or();
	IQueryBuilder not();
	// 1 based range limits
	IQueryBuilder first(Long first); 
	IQueryBuilder last(Long last);
	// ordering
	IQueryBuilder orderBy(AttributeInfo attribute, boolean descending);
	// return the built IQuery object
	IQuery build();


}
