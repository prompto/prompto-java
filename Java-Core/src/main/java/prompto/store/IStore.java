package prompto.store;

import java.util.Collection;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.type.IType;

/* a mean to store and fetch data */
public interface IStore {
	
	IType getDbIdType();
	IStorable newStorable();
	void store(Context context, IStorable storable) throws PromptoError;
	IStored fetchOne(Context context, IExpression filter) throws PromptoError;
	IStoredIterator fetchMany(Context context, IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns);
	IType getColumnType(String name);
}
