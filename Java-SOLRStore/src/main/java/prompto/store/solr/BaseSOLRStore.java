package prompto.store.solr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;

import prompto.error.InternalError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;

abstract class BaseSOLRStore implements IStore {
	
	static Map<String, Family> typeMap = new HashMap<>();
	
	static {
		typeMap.put("uuid", Family.UUID);
		typeMap.put("db-id", Family.UUID);
		typeMap.put("db-ref", Family.ANY);
		typeMap.put("blob", Family.BLOB);
		typeMap.put("boolean", Family.BOOLEAN);
		typeMap.put("text", Family.TEXT);
		typeMap.put("text-key", typeMap.get("text"));
		typeMap.put("text-value", typeMap.get("text"));
		typeMap.put("text-words", typeMap.get("text"));
		typeMap.put("version", Family.TEXT); // TODO create Version type?
		typeMap.put("image", Family.IMAGE);
		typeMap.put("integer", Family.INTEGER);
		typeMap.put("decimal", Family.DECIMAL);
		typeMap.put("date", Family.DATE);
		typeMap.put("time", Family.TIME);
		typeMap.put("period", Family.PERIOD);
		typeMap.put("datetime", Family.DATETIME);
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
		readerMap.put("text", (o) -> String.valueOf(o));
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
	}
	
	public Object readFieldData(String fieldName, Object data) throws PromptoError {
		if(data==null)
			return null;
		String typeName = getColumnTypeName(fieldName);
		if(typeName.endsWith("[]"))
			return readArrayData(typeName, data);
		else
			return readAtomicData(typeName, data);
	}

	private Object readAtomicData(String typeName, Object data) {
		IDataReader reader = readerMap.get(typeName);
		if(reader==null)
			throw new UnsupportedOperationException("read " + typeName);
		try {
			return reader.readValue(data);
		} catch(Exception e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	private Object readArrayData(String typeName, Object data) {
		if(!(data instanceof Collection))
			throw new UnsupportedOperationException("data " + data.getClass().getName());
		String itemTypeName = typeName.substring(0, typeName.indexOf('[')); 
		IDataReader reader = readerMap.get(itemTypeName);
		if(reader==null)
			throw new UnsupportedOperationException("read " + typeName);
		try {
			PromptoList<Object> result = new PromptoList<>(false);
			for(Object item : ((Collection<Object>)data))
				result.add(reader.readValue(item));
			return result;
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
	public Family getColumnTypeFamily(String fieldName) throws PromptoError {
		String typeName = getColumnTypeName(fieldName);
		if(typeName.endsWith("[]"))
			typeName = typeName.substring(0, typeName.length()-"[]".length());
		return typeMap.get(typeName);
	}
	
	@Override
	public Class<?> getDbIdClass() {
		return UUID.class;
	}
	
	@Override
	public UUID convertToDbId(Object dbId) {
		if(dbId instanceof UUID)
			return (UUID)dbId;
		else
			return UUID.fromString(String.valueOf(dbId));
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeInfo> columns) throws PromptoError {
		for(AttributeInfo column : columns) try {
			createOrUpdateColumn(column);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private void createOrUpdateColumn(AttributeInfo column) throws SolrServerException, IOException {
		Map<String, Object> options = new HashMap<>();
		options.put("indexed", true);
		options.put("stored", true);
		if(column.isCollection()) 
			options.put("multiValued", true);
		if("version".equals(column.getName()))  {
			if(!hasField("version"))
				addField("version", "version", options);
		} else if(column.getFamily()==Family.TEXT)
			createOrUpdateTextColumn(column, options);
		else if(!hasField(column.getName())) {
			if(column.getFamily()==Family.CATEGORY) {
				addField(column.getName(), "db-ref", options);
			} else {
			String typeName = column.getFamily().name().toLowerCase();
			addField(column.getName(), typeName, options);
			}
		}
	}
	
	
	private void createOrUpdateTextColumn(AttributeInfo column, Map<String, Object> options) throws SolrServerException, IOException {
		String fieldName = column.getName();
		options = new HashMap<>(options); // use a copy
		options.put("indexed", false);
		options.put("stored", true);
		if(!hasField(fieldName))
			addField(fieldName, "text", options);
		options = new HashMap<>(options); // use a copy
		options.put("indexed", true);
		options.put("stored", false);
		SOLRAttributeInfo indexTypes = SOLRAttributeInfo.computeFieldFlags(column);
		if(indexTypes!=null) {
			if(indexTypes.isKey()) {
				String indexFieldName = fieldName + "-" + AttributeInfo.KEY;
				if(!hasField(indexFieldName))
					addCopyField(indexFieldName, "text-" + AttributeInfo.KEY, options, fieldName);
			}
			if(indexTypes.isValue()) {
				String indexFieldName = fieldName + "-" + AttributeInfo.VALUE;
				if(!hasField(indexFieldName))
					addCopyField(indexFieldName, "text-" + AttributeInfo.VALUE, options, fieldName);
			}
			if(indexTypes.isWords()) {
				String indexFieldName = fieldName + "-" + AttributeInfo.WORDS;
				if(!hasField(indexFieldName))
					addCopyField(indexFieldName, "text-" + AttributeInfo.WORDS, options, fieldName);
			}
		} else
			addCopyField(fieldName + "-key", "text-key", options, fieldName);
	}

	@Override
	public void store(Collection<?> deletables, Collection<IStorable> storables) throws PromptoError {
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
		} catch(Exception e) {
			throw new InternalError(e); // TODO much better
		}
	}

	@Override
	public PromptoBinary fetchBinary(Object dbId, String attr) throws PromptoError {
		SolrQuery query = new SolrQuery();
		query.setQuery("dbId:" + dbId);
		query.setFields(attr);
		query.setRows(1);
		try {
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
	public IStored fetchUnique(Object dbId) throws PromptoError {
		SOLRQueryBuilder builder = new SOLRQueryBuilder();
		builder.verify(new SOLRAttributeInfo(IStore.dbIdName, Family.UUID, false, null), MatchOp.EQUALS, dbId);
		try {
			SOLRQuery query = builder.build();
			QueryResponse result = query(query.getQuery());
			return getOne(result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public SOLRQueryBuilder newQueryBuilder() {
		return new SOLRQueryBuilder();
	}
	
	@Override
	public IStored fetchOne(IQuery query) throws PromptoError {
		SolrQuery q = ((SOLRQuery)query).getQuery();
		try {
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
	public IStoredIterable fetchMany(IQuery query) throws PromptoError {
		SolrQuery q = ((SOLRQuery)query).getQuery();
		try {
			QueryResponse result = query(q);
			return getMany(result);
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}
	
	private IStoredIterable getMany(QueryResponse response) {
		return new IStoredIterable() {
			
			@Override
			public Iterator<IStored> iterator() {
				return new Iterator<IStored>() {
					int current = 0;
					
					@Override
					public IStored next() {
						return new StoredDocument(BaseSOLRStore.this, response.getResults().get(current++));
					}
					
					@Override
					public boolean hasNext() {
						return current < length();
					}
				};
			}
			
			@Override
			public long length() {
				return response.getResults().size();
			}
			
			@Override
			public long totalLength() {
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

	public abstract boolean hasField(String fieldName)throws SolrServerException, IOException;
	
	public abstract void addField(String fieldName, String fieldType, Map<String, Object> options) throws SolrServerException, IOException;

	public abstract void addCopyField(String fieldName, String fieldType, Map<String, Object> options, String sourceName) throws SolrServerException, IOException;

	public abstract String getFieldType(String fieldName) throws SolrServerException, IOException;

	public abstract void dropField(String fieldName) throws SolrServerException, IOException;

	public abstract void setCommitDelay(int commitDelay) throws SolrServerException;
}
