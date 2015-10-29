package prompto.store.solr;

import java.util.Collection;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IDocumentIterator;
import prompto.store.IStore;
import prompto.type.IType;
import prompto.type.UUIDType;
import prompto.value.Document;

public class SOLRStore implements IStore {

	@Override
	public IType getDbIdType() {
		return UUIDType.instance();
	}
	
	@Override
	public IType getColumnType(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeDeclaration> columns) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void store(Context context, Document document) throws PromptoError {
		
	}

	@Override
	public Document fetchOne(Context context, IExpression filter) throws PromptoError {
		return null;
	}
	
	@Override
	public IDocumentIterator fetchMany(Context context, IExpression start,
			IExpression end, IExpression filter, OrderByClauseList orderBy)
			throws PromptoError {
		// TODO Auto-generated method stub
		return null;
	}
	
}
