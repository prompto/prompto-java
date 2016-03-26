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
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.AttributeInfo;
import prompto.error.InternalError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.store.IQuery;
import prompto.store.IQuery.MatchOp;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IQueryFactory;
import prompto.store.IQueryInterpreter;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterator;
import prompto.type.BlobType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.ContainerType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IType.Family;
import prompto.type.ImageType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.PeriodType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.UUIDType;

abstract class BaseSOLRStore implements IStore<UUID> {
	
	static Map<String, IType> typeMap = new HashMap<>();
	
	static {
		typeMap.put("uuid", UUIDType.instance());
		typeMap.put("db-id", UUIDType.instance());
		typeMap.put("db-ref", new CategoryType(new Identifier("any")));
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
		typeMap.put("date", DateType.instance());
		typeMap.put("time", TimeType.instance());
		typeMap.put("period", PeriodType.instance());
		typeMap.put("datetime", DateTimeType.instance());
		// create a list type for each atomic type (using a copy to avoid concurrent modification)
		Set<Map.Entry<String, IType>> entries = new HashSet<>(typeMap.entrySet());
		for(Map.Entry<String, IType> entry : entries) {
			typeMap.put(entry.getKey() + "[]", new ListType(entry.getValue()));
		}
	}
	
	
	static interface IDataReader {
		Object readValue(Object data) throws IOException;
	}
	
	static Map<String, IDataReader> readerMap = new HashMap<>();
	
	static {
		readerMap.put("uuid", (o) -> UUID.fromString(o.toString()));
		readerMap.put("db-id", readerMap.get("uuid"));
		readerMap.put("db-ref", readerMap.get("uuid"));
		readerMap.put("blob", (o) -> BinaryConverter.toPromptoBinary(o));
		readerMap.put("boolean", (o) -> o);
		readerMap.put("text", (o) -> o.toString());
		readerMap.put("text-key", readerMap.get("text"));
		readerMap.put("text-value", readerMap.get("text"));
		readerMap.put("text-words", readerMap.get("text"));
		readerMap.put("version", (o) -> o.toString());
		readerMap.put("image", (o) -> BinaryConverter.toPromptoBinary(o));
		readerMap.put("integer", (o) -> o);
		readerMap.put("decimal", (o) -> o);
		readerMap.put("period", (o) -> PromptoPeriod.parse(o.toString()));
		readerMap.put("date", (o) -> PromptoDate.parse(o.toString()));
		readerMap.put("time", (o) -> PromptoTime.parse(o.toString()));
		readerMap.put("datetime", (o) -> PromptoDateTime.parse(o.toString()));
		// create a list type for each atomic type (using a copy to avoid concurrent modification)
		Set<Map.Entry<String, IDataReader>> entries = new HashSet<>(readerMap.entrySet());
		for(Map.Entry<String, IDataReader> entry : entries) {
			readerMap.put(entry.getKey() + "[]", null);
		}
	}
	
	public Object readData(String fieldName, Object data) throws PromptoError {
		if(data==null)
			return null;
		String typeName = getColumnTypeName(fieldName);
		IDataReader reader = readerMap.get(typeName);
		if(reader==null)
			throw new UnsupportedOperationException("read " + typeName);
		try {
			return reader.readValue(data);
		} catch(Exception e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	ConcurrentMap<String, String> columnTypeNames = new ConcurrentHashMap<>();
		
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

	@Override
	public Type getColumnType(String fieldName) throws PromptoError {
		String typeName = getColumnTypeName(fieldName);
		IType type = typeMap.get(typeName);
		return type.getJavaType();
	}
	
	@Override
	public Class<?> getDbIdClass() {
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
		if(type instanceof ContainerType) {
			options.put("multiValued", true);
			type = ((ContainerType)type).getItemType();
		}
		if("version".equals(column.getName())) 
			addField("version", "version", options);
		else if(type==TextType.instance())
			addTextField(column.getName(), options, column.getAttributeInfo());
		else if(type instanceof CategoryType)
			addField(column.getName(), "db-ref", options);
		else {
			String typeName = type.getTypeName().toLowerCase();
			addField(column.getName(), typeName, options);
		}
	}
	
	
	private void addTextField(String fieldName, Map<String, Object> options, AttributeInfo indexTypes) throws SolrServerException, IOException {
		options = new HashMap<>(options); // use a copy
		options.put("indexed", false);
		options.put("stored", true);
		addField(fieldName, "text", options);
		options = new HashMap<>(options); // use a copy
		options.put("indexed", true);
		options.put("stored", false);
		if(indexTypes!=null) {
			if(indexTypes.isKey())
				addCopyField(fieldName + "-" + AttributeInfo.KEY, "text-" + AttributeInfo.KEY, options, fieldName);
			if(indexTypes.isValue())
				addCopyField(fieldName + "-" + AttributeInfo.VALUE, "text-" + AttributeInfo.VALUE, options, fieldName);
			if(indexTypes.isWords())
				addCopyField(fieldName + "-" + AttributeInfo.WORDS, "text-" + AttributeInfo.WORDS, options, fieldName);
		} else
			addCopyField(fieldName + "-key", "text-key", options, fieldName);
	}

	@Override
	public void store(Collection<UUID> deletables, Collection<IStorable> storables) throws PromptoError {
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
	public PromptoBinary fetchBinary(UUID dbId, String attr) throws PromptoError {
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
	public IStored fetchUnique(UUID dbId) throws PromptoError {
		SOLRQuery query = new SOLRQuery();
		query.verify(new SOLRAttributeInfo(IStore.dbIdName, Family.UUID, false, null), MatchOp.EQUALS, dbId);
		try {
			commit();
			QueryResponse result = query(query.getQuery());
			return getOne(result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public IQueryInterpreter<UUID> getQueryInterpreter(Context context) {
		return new SOLRQueryInterpreter(context);
	}
	
	@Override
	public IQueryFactory getQueryFactory() {
		return new SOLRQueryFactory();
	}
	
	@Override
	public IStored fetchOne(IQuery query) throws PromptoError {
		SolrQuery q = ((SOLRQuery)query).getQuery();
		try {
			commit();
			QueryResponse result = query(q);
			return getOne(result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private IStored getOne(QueryResponse result) {
		if(result.getResults().isEmpty())
			return null;
		else
			return new StoredDocument(this, result.getResults().get(0));
	}

	@Override
	public IStoredIterator fetchMany(IQuery query) throws PromptoError {
		SolrQuery q = ((SOLRQuery)query).getQuery();
		try {
			commit();
			QueryResponse result = query(q);
			return getMany(result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private IStoredIterator getMany(QueryResponse response) {
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

	@Override
	public IStorable newStorable(List<String> categories, IDbIdListener listener) {
		return new StorableDocument(categories, listener);
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
