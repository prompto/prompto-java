package prompto.store;

import java.util.Collection;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.value.Document;

/* a mean to store and fetch data */
public interface IStore {
	
	IType getDbIdType();
	void store(Context context, Document document) throws PromptoError;
	Document fetchOne(Context context, IExpression filter) throws PromptoError;
	IDocumentIterator fetchMany(Context context, IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;
	void createOrUpdateColumns(Collection<AttributeDeclaration> columns);
	IType getColumnType(String name);
}
