package prompto.store.solr;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterator;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.DateTimeType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.type.UUIDType;

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
	public void store(Context context, IStorable storable) throws PromptoError {
		if(!(storable instanceof StorableDocument))
			throw new IllegalStateException();
		SolrInputDocument document = ((StorableDocument)storable).document;
		storeChildren(context, document);
		if(!document.containsKey("dbId"))
			document.setField("dbId", UUID.randomUUID());
		try {
			addDocument(document);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}

	private void storeChildren(Context context, SolrInputDocument document) {
		// TODO
	}

	@Override
	public IStored fetchOne(Context context, CategoryType type, IExpression filterExpression) throws PromptoError {
		SOLRFilterBuilder builder = new SOLRFilterBuilder();
		if(type!=null)
			builder.pushCategory(type);
		if(filterExpression!=null)
			filterExpression.toFilter(context, builder);
		// TODO: based on the field type and operator, we should use query/filterQuery
		SolrQuery query = new SolrQuery();
		query.setQuery(builder.toSolrQuery());
		query.setRows(1);
		try {
			QueryResponse result = query(query);
			return getOne(context, result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private IStored getOne(Context context, QueryResponse result) {
		if(result.getResults().isEmpty())
			return null;
		else
			return new StoredDocument(result.getResults().get(0));
	}

	@Override
	public IStoredIterator fetchMany(Context context, CategoryType type,
			IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy)
			throws PromptoError {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IStorable newStorable(List<String> categories) {
		return new StorableDocument(categories);
	}
	
	public abstract QueryResponse query(SolrQuery params) throws SolrServerException, IOException;

	public abstract void addDocument(SolrInputDocument doc) throws SolrServerException, IOException;

	public abstract void commit() throws SolrServerException, IOException;

	public abstract void addField(String fieldName, String fieldType, Map<String, Object> options);

	public abstract String getFieldType(String fieldName);
	
}
