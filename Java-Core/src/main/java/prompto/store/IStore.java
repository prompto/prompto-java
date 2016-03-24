package prompto.store;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.type.CategoryType;

/* a mean to store and fetch data */
public interface IStore<T extends Object> {
	
	public static final String dbIdName = "dbId";
	public static final Identifier dbIdIdentifier = new Identifier(dbIdName);
	
	Type getDbIdType();
	Type getColumnType(String name) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns) throws PromptoError;

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

	default IStored fetchOne(Context context, CategoryType category, IExpression filter) throws PromptoError {
		return fetchOne(getQueryBuilder(context, false).buildFetchOneQuery(category, filter));
	};

	default IStoredIterator fetchMany(Context context, CategoryType category, 
						IExpression start, IExpression end, 
						IExpression filter, OrderByClauseList orderBy) throws PromptoError {
		return fetchMany(getQueryBuilder(context, false)
				.buildFetchManyQuery(category, start, end, filter, orderBy));
	}

	IQueryBuilder<T> getQueryBuilder(Context context, boolean compiled);
	// for the below, assumption is that IQuery was produced by the above IQueryBuilder
	IStored fetchOne(IQuery query) throws PromptoError;
	IStoredIterator fetchMany(IQuery query) throws PromptoError;

	
}
