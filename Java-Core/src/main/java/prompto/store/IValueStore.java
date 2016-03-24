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
import prompto.type.IType;
import prompto.value.IValue;

/* a mean to store and fetch data */
public interface IValueStore {
	
	public static final String dbIdName = "dbId";
	public static final Identifier dbIdIdentifier = new Identifier(dbIdName);
	
	IType getDbIdIType();
	Type getDbIdType();
	IType getColumnIType(String name) throws PromptoError;
	IStorable newStorable(List<String> categories);
	void store(Collection<Object> deletables, Collection<IStorable> storables) throws PromptoError;
	default void store(IStorable storable) throws PromptoError {
		store(null, Arrays.asList(storable));
	}
	void delete(Collection<Object> dbIds) throws PromptoError;
	default void delete(Object dbId) throws PromptoError {
		delete(Arrays.asList(dbId));
	}
	void deleteAll() throws PromptoError;
	IStored fetchUnique(Context context, IValue dbId) throws PromptoError;
	IStored fetchOne(Context context, CategoryType type, IExpression filter) throws PromptoError;
	IStoredIterator fetchMany(Context context, CategoryType type, 
			IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns) throws PromptoError;
	PromptoBinary fetchBinary(String dbId, String attr) throws PromptoError;
}
