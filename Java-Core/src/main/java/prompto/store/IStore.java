package prompto.store;

import java.util.Collection;
import java.util.List;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.value.Binary;

/* a mean to store and fetch data */
public interface IStore {
	
	IType getDbIdType();
	IStorable newStorable(List<String> categories);
	void store(Context context, IStorable storable) throws PromptoError;
	IStored fetchOne(Context context, CategoryType type, IExpression filter) throws PromptoError;
	IStoredIterator fetchMany(Context context, CategoryType type, 
			IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns);
	IType getColumnType(String name);
	Binary fetchBinary(String dbId, String attr) throws PromptoError;
}
