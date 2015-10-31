package prompto.store.solr;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IDocumentIterator;
import prompto.store.IStore;
import prompto.type.BooleanType;
import prompto.type.DateTimeType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.type.UUIDType;
import prompto.value.Document;

abstract class BaseSOLRStore implements IStore {
	
	static Map<String, IType> typeMap = new HashMap<>();
	
	static {
		typeMap.put("uuid", UUIDType.instance());
		typeMap.put("boolean", BooleanType.instance());
		typeMap.put("text", TextType.instance());
		typeMap.put("integer", IntegerType.instance());
		typeMap.put("decimal", DecimalType.instance());
		typeMap.put("datetime", DateTimeType.instance());
		// create a list type for each atomic type, using a copied set to avoid concurrent modification
		Set<Map.Entry<String, IType>> entries = new HashSet<>(typeMap.entrySet());
		for(Map.Entry<String, IType> entry : entries) {
			typeMap.put(entry.getKey() + "[]", new ListType(entry.getValue()));
		}
	}
	
	@Override
	public IType getDbIdType() {
		return UUIDType.instance();
	}
	
	@Override
	public IType getColumnType(String fieldName) {
		return typeMap.get(getFieldType(fieldName));
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeDeclaration> columns) {
		for(AttributeDeclaration column : columns)
			createOrUpdateColumn(column);
	}
	
	private void createOrUpdateColumn(AttributeDeclaration column) {
		if("dbId".equals(column.getName()))
			return;
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		IType type = column.getType();
		if(type instanceof ListType) {
			options.put("multiValued", true);
			type = ((ListType)type).getItemType();
		}
		String typeName = type.getName().toLowerCase();
		addField(column.getName(), typeName, options);
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
	
	public abstract QueryResponse query(ModifiableSolrParams params) throws SolrServerException, IOException;

	public abstract void addDocument(SolrInputDocument doc) throws SolrServerException, IOException;

	public abstract void commit() throws SolrServerException, IOException;

	public abstract void addField(String fieldName, String fieldType, Map<String, Object> options);

	public abstract String getFieldType(String fieldName);
	
}
