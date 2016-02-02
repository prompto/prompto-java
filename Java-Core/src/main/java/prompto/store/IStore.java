package prompto.store;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.value.Binary;
import prompto.value.IValue;

/* a mean to store and fetch data */
public interface IStore {
	
	public static final Identifier dbIdName = new Identifier("dbId");
	
	IType getDbIdType();
	IStorable newStorable(List<String> categories);
	void store(Context context, Collection<IStorable> storables) throws PromptoError;
	default void store(Context context, IStorable storable) throws PromptoError {
		store(context, Arrays.asList(storable));
	}
	IStored fetchUnique(Context context, IValue dbId) throws PromptoError;
	IStored fetchOne(Context context, CategoryType type, IExpression filter) throws PromptoError;
	IStoredIterator fetchMany(Context context, CategoryType type, 
			IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;
	void delete(Collection<Object> dbIds) throws PromptoError;
	default void delete(Object dbId) throws PromptoError {
		delete(Arrays.asList(dbId));
	}
	void deleteAll() throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns) throws PromptoError;
	IType getColumnType(String name) throws PromptoError;
	Binary fetchBinary(String dbId, String attr) throws PromptoError;
}
