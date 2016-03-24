package prompto.store.solr;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.error.InternalError;
import prompto.error.ReadWriteError;
import prompto.error.InvalidDataError;
import prompto.expression.IExpression;
import prompto.grammar.EqOp;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterator;
import prompto.type.BlobType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.DateTimeType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.ImageType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.type.UUIDType;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

abstract class BaseSOLRStore implements IStore {
	
	static Map<String, IType> typeMap = new HashMap<>();
	
	static {
		typeMap.put("uuid", UUIDType.instance());
		typeMap.put("blob", BlobType.instance());
		typeMap.put("boolean", BooleanType.instance());
		typeMap.put("text", TextType.instance());
		typeMap.put("text-key", typeMap.get("text"));
		typeMap.put("text-value", typeMap.get("text"));
		typeMap.put("text-words", typeMap.get("text"));
		typeMap.put("version", TextType.instance()); // TODO create Version type?
		typeMap.put("image", ImageType.instance());
		typeMap.put("integer", IntegerType.instance());
		typeMap.put("decimal", DecimalType.instance());
		typeMap.put("datetime", DateTimeType.instance());
		// create a list type for each atomic type (using a copy to avoid concurrent modification)
		Set<Map.Entry<String, IType>> entries = new HashSet<>(typeMap.entrySet());
		for(Map.Entry<String, IType> entry : entries) {
			typeMap.put(entry.getKey() + "[]", new ListType(entry.getValue()));
		}
	}
	
	static interface IValueReader {
		IValue readValue(Object data) throws IOException;
	}
	
	static Map<String, IValueReader> readerMap = new HashMap<>();
	
	static {
		readerMap.put("uuid", (o) -> new prompto.value.UUID(o.toString()));
		readerMap.put("blob", null);
		readerMap.put("boolean", null);
		readerMap.put("text", (o) -> new prompto.value.Text(o.toString()));
		readerMap.put("text-key", readerMap.get("text"));
		readerMap.put("text-value", readerMap.get("text"));
		readerMap.put("text-words", readerMap.get("text"));
		readerMap.put("version", (o) -> new prompto.value.Text(o.toString()));
		readerMap.put("image", (o) -> BinaryConverter.toBinaryValue(o));
		readerMap.put("integer", null);
		readerMap.put("decimal", null);
		readerMap.put("datetime", (o) -> new prompto.value.DateTime(o.toString()));
		// create a list type for each atomic type (using a copy to avoid concurrent modification)
		Set<Map.Entry<String, IValueReader>> entries = new HashSet<>(readerMap.entrySet());
		for(Map.Entry<String, IValueReader> entry : entries) {
			readerMap.put(entry.getKey() + "[]", null);
		}
	}
	
	ConcurrentMap<String, String> columnTypeNames = new ConcurrentHashMap<>();
	ConcurrentMap<String, IType> columnTypes = new ConcurrentHashMap<>();
	
	@Override
	public IType getColumnIType(String fieldName) throws PromptoError {
		IType type = columnTypes.get(fieldName);
		if(type==null) try {
			String typeName = getColumnTypeName(fieldName);
			type = typeMap.get(typeName);
			columnTypes.put(fieldName, type);
		} catch(Exception e) {
			throw new InternalError(e);
		}
		return type;
	}
	
	private String getColumnTypeName(String fieldName) throws PromptoError {
		String typeName = columnTypeNames.get(fieldName);
		if(typeName==null) try {
			typeName = getFieldType(fieldName);
			columnTypeNames.put(fieldName, typeName);
		} catch(Exception e) {
			throw new InternalError(e);
		}
		return typeName;
	}

	public IValue readData(String fieldName, Object data) throws PromptoError {
		String typeName = getColumnTypeName(fieldName);
		IValueReader reader = readerMap.get(typeName);
		if(reader==null)
			throw new UnsupportedOperationException("read " + typeName);
		try {
			return reader.readValue(data);
		} catch(Exception e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@Override
	public IType getDbIdIType() {
		return UUIDType.instance();
	}
	
	@Override
	public Type getDbIdType() {
		return UUID.class;
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeDeclaration> columns) throws PromptoError {
		for(AttributeDeclaration column : columns) try {
			createOrUpdateColumn(column);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private void createOrUpdateColumn(AttributeDeclaration column) throws SolrServerException, IOException {
		if(hasField(column.getName()))
			return;
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		IType type = column.getType();
		if(type instanceof ListType) {
			options.put("multiValued", true);
			type = ((ListType)type).getItemType();
		}
		if(type instanceof CategoryType)
			type = getDbIdIType();
		if("version".equals(column.getName())) 
			addField("version", "version", options);
		else if(type==TextType.instance())
			addTextField(column.getName(), options, column.getIndexTypes());
		else {
			String typeName = type.getName().toLowerCase();
			addField(column.getName(), typeName, options);
		}
	}
	
	
	private void addTextField(String fieldName, Map<String, Object> options, Collection<String> indexTypes) throws SolrServerException, IOException {
		options = new HashMap<>(options); // use a copy
		options.put("indexed", false);
		options.put("stored", true);
		addField(fieldName, "text", options);
		options = new HashMap<>(options); // use a copy
		options.put("indexed", true);
		options.put("stored", false);
		if(indexTypes!=null) for(String indexType : indexTypes)
			addCopyField(fieldName + "-" + indexType, "text-" + indexType, options, fieldName);
		else
			addCopyField(fieldName + "-key", "text-key", options, fieldName);
	}

	@Override
	public void store(Collection<Object> deletables, Collection<IStorable> storables) throws PromptoError {
		List<String> dbIdsToDrop = null;
		if(deletables!=null && deletables.size()>0) {
			dbIdsToDrop = new ArrayList<>();
			for(Object dbId : deletables)
				dbIdsToDrop.add(dbId.toString()); // a simple UUID
		}
		List<SolrInputDocument> docsToAdd = null;
		if(storables!=null && storables.size()>0) {
			docsToAdd = new ArrayList<>();
			for(IStorable storable : storables) {
				if(!(storable instanceof StorableDocument))
					throw new IllegalStateException();
				SolrInputDocument doc = ((StorableDocument)storable).getDocument();
				docsToAdd.add(doc);
			}
			if(docsToAdd.isEmpty())
				docsToAdd = null;
		}
		try {
			if(dbIdsToDrop!=null)
				dropDocuments(dbIdsToDrop);
			if(docsToAdd!=null)
				addDocuments(docsToAdd);
			if(dbIdsToDrop!=null || docsToAdd!=null)
				commit();
		} catch(Exception e) {
			throw new InternalError(e); // TODO much better
		}
	}

	@Override
	public PromptoBinary fetchBinary(String dbId, String attr) throws PromptoError {
		SolrQuery query = new SolrQuery();
		query.setQuery("dbId:" + dbId);
		query.setFields(attr);
		query.setRows(1);
		try {
			commit();
			QueryResponse response = query(query);
			if(response.getResults().isEmpty())
				return null;
			SolrDocument doc = response.getResults().get(0);
			if(doc==null)
				return null;
			Object data = doc.getFieldValue(attr);
			if(data==null)
				return null;
			else
				return BinaryConverter.toPromptoBinary(data);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public IStored fetchUnique(Context context, IValue dbId) throws PromptoError {
		SOLRFilterBuilder builder = new SOLRFilterBuilder();
		builder.push(context, IStore.dbIdName, EqOp.EQUALS, dbId);
		SolrQuery query = new SolrQuery();
		query.setQuery(builder.toSolrQuery());
		try {
			commit();
			QueryResponse result = query(query);
			return getOne(context, result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public IStored fetchOne(Context context, CategoryType type, IExpression filterExpression) throws PromptoError {
		SolrQuery query = buildQuery(context, type, null, null, filterExpression, null);
		query.setRows(1);
		try {
			commit();
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
			return new StoredDocument(this, result.getResults().get(0));
	}

	@Override
	public IStoredIterator fetchMany(Context context, CategoryType type,
			IExpression start, IExpression end, 
			IExpression filterExpression, OrderByClauseList orderBy)
			throws PromptoError {
		SolrQuery query = buildQuery(context, type, start, end, filterExpression, orderBy);
		try {
			commit();
			QueryResponse result = query(query);
			return getMany(context, result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private IStoredIterator getMany(Context context, QueryResponse response) {
		return new IStoredIterator() {
			
			int current = 0;
			
			@Override
			public IStored next() {
				return new StoredDocument(BaseSOLRStore.this, response.getResults().get(current++));
			}
			
			@Override
			public boolean hasNext() {
				return current < response.getResults().getNumFound();
			}
			
			@Override
			public long length() {
				return response.getResults().getNumFound();
			}
		};
	}

	private SolrQuery buildQuery(Context context, CategoryType type,
			IExpression start, IExpression end, 
			IExpression filterExpression, OrderByClauseList orderBy) throws PromptoError {
		SOLRFilterBuilder builder = new SOLRFilterBuilder();
		if(type!=null)
			builder.pushCategory(type);
		if(filterExpression!=null)
			filterExpression.toFilter(context, builder);
		if(type!=null && filterExpression!=null)
			builder.and();
		// TODO: based on the field type and operator, should we use query/filterQuery ?
		SolrQuery query = new SolrQuery();
		query.setQuery(builder.toSolrQuery());
		Long intStart = getLong(context, start);
		Long intEnd = getLong(context, end);
		if(intStart!=null && intEnd!=null) {
			query.setStart(intStart.intValue() - 1);
			query.setRows(1 + (int)(intEnd - intStart));
		}
		if(orderBy!=null) for(OrderByClause clause : orderBy) {
			IdentifierList names = clause.getNames();
			// TODO manage member names: a.b
			String fieldName = names.get(0).getName();
			AttributeDeclaration column = context.findAttribute(fieldName);
			TextFieldFlags flags = TextFieldFlags.computeFieldFlags(column);
			if(flags!=null)
				fieldName += flags.getSuffixForOrderBy();
			query.addSort(fieldName, clause.isDescending() ? ORDER.desc : ORDER.asc);
		}
		return query;
	}

	private Long getLong(Context context, IExpression exp) throws PromptoError {
		if(exp==null)
			return null;
		IValue value = exp.interpret(context);
		if(!(value instanceof prompto.value.Integer))
			throw new InvalidDataError("Expecting an Integer, got:" + value.getType().toString());
		return ((prompto.value.Integer)value).longValue();
	}

	@Override
	public IStorable newStorable(List<String> categories) {
		return new StorableDocument(categories);
	}
	
	public abstract void createCoreIfRequired() throws SolrServerException, IOException;
	
	public abstract void dropCoreIfExists() throws SolrServerException, IOException;

	public abstract QueryResponse query(SolrQuery params) throws SolrServerException, IOException;

	public void addDocuments(SolrInputDocument ... docs) throws SolrServerException, IOException {
		addDocuments(Arrays.asList(docs));
	}

	public abstract void addDocuments(Collection<SolrInputDocument> docs) throws SolrServerException, IOException;

	public abstract void dropDocuments(List<String> dbIds) throws SolrServerException, IOException;

	public abstract void commit() throws SolrServerException, IOException;

	public abstract boolean hasField(String fieldName)throws SolrServerException, IOException;
	
	public abstract void addField(String fieldName, String fieldType, Map<String, Object> options) throws SolrServerException, IOException;

	public abstract void addCopyField(String fieldName, String fieldType, Map<String, Object> options, String sourceName) throws SolrServerException, IOException;

	public abstract String getFieldType(String fieldName) throws SolrServerException, IOException;

	public abstract void dropField(String fieldName) throws SolrServerException, IOException;
}
