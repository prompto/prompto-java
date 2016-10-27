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
import prompto.store.IStorable.IDbIdListener;
import prompto.type.CategoryType;

/* a mean to store and fetch data */
public interface IStore {
	
	public static final String dbIdName = "dbId";
	
	Class<?> getDbIdClass();
	Object convertToDbId(Object dbId);
	Type getColumnType(String name) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns) throws PromptoError;

	default IStorable newStorable(String[] categories, IDbIdListener listener) {
		return newStorable(Arrays.asList(categories), listener);
	}
	IStorable newStorable(List<String> categories, IDbIdListener listener);
	
	void store(Collection<?> deletables, Collection<IStorable> storables) throws PromptoError;
	default void store(IStorable storable) throws PromptoError {
		store(null, Arrays.asList(storable));
	}
	
	void delete(Collection<?> dbIds) throws PromptoError;
	default void delete(Object dbId) throws PromptoError {
		delete(Arrays.asList(dbId));
	}
	void deleteAll() throws PromptoError;

	PromptoBinary fetchBinary(Object dbId, String attr) throws PromptoError;
	IStored fetchUnique(Object dbId) throws PromptoError;

	IQueryInterpreter getQueryInterpreter(Context context);
	IQueryFactory getQueryFactory();
	// for the below, it is guaranteed that IQuery was produced by the above
	IStored fetchOne(IQuery query) throws PromptoError;
	IStoredIterable fetchMany(IQuery query) throws PromptoError;
	
	default IStored interpretFetchOne(Context context, CategoryType category, IPredicateExpression filter) throws PromptoError {
		return fetchOne(getQueryInterpreter(context).buildFetchOneQuery(category, filter));
	};

	default IStoredIterable interpretFetchMany(Context context, CategoryType category, 
						IExpression start, IExpression end, 
						IPredicateExpression filter, 
						OrderByClauseList orderBy) throws PromptoError {
		return fetchMany(getQueryInterpreter(context)
				.buildFetchManyQuery(category, start, end, filter, orderBy));
	}

	void flush()  throws PromptoError;
	
}
