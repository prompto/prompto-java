package prompto.store;

import java.util.List;

public interface IQueryBuilder {

	public static enum MatchOp {
		EQUALS,	// strict equality
		ROUGHLY, // caseless or rounded equality 
		CONTAINS, // pattern matching
		HAS, // collection contains value
		HAS_ANY, // collection contains value
		HAS_ALL, // collection contains value
		IN, // value in collection 
		GREATER,
		LESSER
	}
	
	// create atomic predicates
	<T> IQueryBuilder verify(AttributeInfo info, MatchOp match, T value);
	// the below make the assumption that the atomic predicates are available from a stack
	IQueryBuilder and();
	IQueryBuilder or();
	IQueryBuilder not();
	// 1 based range limits
	IQueryBuilder first(Long first); 
	IQueryBuilder last(Long last);
	// projecting
	IQueryBuilder project(List<String> attributeNames);
	// ordering
	IQueryBuilder orderBy(AttributeInfo attribute, boolean descending);
	// return the built IQuery object
	IQuery build();


}
