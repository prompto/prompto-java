package prompto.store;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.type.CategoryType;

/* a mean to store and fetch data */
public interface IStore<T extends Object> {
	
	public static final String dbIdName = "dbId";
	
	Class<?> getDbIdClass();
	Type getColumnType(String name) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns) throws PromptoError;

	default IStorable newStorable(String[] categories) {
		return newStorable(Arrays.asList(categories));
	}
	IStorable newStorable(List<String> categories);
	
	void store(Collection<T> deletables, Collection<IStorable> storables) throws PromptoError;
	default void store(IStorable storable) throws PromptoError {
		store(null, Arrays.asList(storable));
	}
	
	void delete(Collection<T> dbIds) throws PromptoError;
	default void delete(T dbId) throws PromptoError {
		delete(Arrays.asList(dbId));
	}
	void deleteAll() throws PromptoError;

	PromptoBinary fetchBinary(T dbId, String attr) throws PromptoError;
	IStored fetchUnique(T dbId) throws PromptoError;

	default IStored fetchOne(Context context, CategoryType category, IPredicateExpression filter) throws PromptoError {
		return fetchOne(getInterpretedQueryFactory(context).buildFetchOneQuery(category, filter));
	};

	default IStoredIterator fetchMany(Context context, CategoryType category, 
						IExpression start, IExpression end, 
						IPredicateExpression filter, 
						OrderByClauseList orderBy) throws PromptoError {
		return fetchMany(getInterpretedQueryFactory(context)
				.buildFetchManyQuery(category, start, end, filter, orderBy));
	}

	default IQueryFactory<T> getInterpretedQueryFactory(Context context) {
		return new InterpretedQueryFactory<T>(context);
	}
	
	default IQueryFactory<T> getCompiledQueryFactory(Context context) {
		return new CompiledQueryFactory<T>(context);
	}
	// for the below, assumption is that IQuery was produced by the above IQueryBuilder
	IStored fetchOne(IQuery query) throws PromptoError;
	IStoredIterator fetchMany(IQuery query) throws PromptoError;

	
}
