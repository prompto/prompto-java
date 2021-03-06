package prompto.store.memory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoTuple;
import prompto.store.AttributeInfo;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;

/* a utility class for running unit tests only */
public final class MemStore implements IStore {

	private Map<Long, StoredDocument> instances = new HashMap<>();
	private AtomicLong lastDbId = new AtomicLong(0);
	private Map<String, AttributeInfo> attributes = new HashMap<>();
	private Map<String, AtomicLong> sequences = new ConcurrentHashMap<>();
	private Map<String, Map<String, Object>> configs = new ConcurrentHashMap<>();
	private List<StoredDocument> transactions = new ArrayList<>();
	Map<String, Object> transaction;
	private AtomicLong lastTransactionId = new AtomicLong(0);
	private List<StoredDocument> audits = new ArrayList<>();
	private AtomicLong lastAuditId = new AtomicLong(0);
	
	@Override
	public boolean checkConnection() {
		return true;
	}
	
	@Override
	public Class<?> getDbIdClass() {
		return Long.class;
	}
	
	@Override
	public Object newDbId() {
		return Long.valueOf(lastDbId.incrementAndGet());
	}
	
	@Override
	public Long convertToDbId(Object dbId) {
		if(dbId instanceof Long)
			return (Long)dbId;
		else
			return Long.decode(String.valueOf(dbId));
	}
	
	@Override
	public AttributeInfo getAttributeInfo(String name) {
		return attributes.get(name);
	}
	
	@Override
	public void createOrUpdateAttributes(Collection<AttributeInfo> infos) {
		infos.forEach(i->attributes.put(i.getName(), i));
	}
	
	@Override
	public void store(Collection<?> toDelete, Collection<IStorable> toStore) throws PromptoError {
		createTransaction();
		if(toDelete!=null) 
			doDelete(toDelete);
		if(toStore!=null)
			doStore(toStore);
	}

	@Override
	public void store(Collection<IStorable> toStore) throws PromptoError {
		store(null, toStore);
	}
	
	
	private void createTransaction() {
		transaction = new HashMap<>();
		transaction.put("txnId", lastTransactionId.incrementAndGet());
		transaction.put("txnTimeStamp", PromptoDateTime.now());
		// TODO populate metadata
		transactions.add(new StoredDocument(null, transaction));
	}

	private void doStore(Collection<IStorable> toStore) {
		for(IStorable storable : toStore) {
			if(!(storable instanceof StorableDocument))
				throw new IllegalStateException("Expecting a StorableDocument");
			doStore((StorableDocument)storable);
		}
	}

	private void doStore(StorableDocument storable) throws PromptoError {
		String operation = "UPDATE";
		// ensure db id
		Object dbId = storable.getData(dbIdName);
		if(!(dbId instanceof Long)) {
			dbId = Long.valueOf(lastDbId.incrementAndGet());
			storable.setData(dbIdName, dbId);
			operation = "INSERT";
		}
		StoredDocument stored = new StoredDocument(storable.getCategories(), storable.getDocument());
		instances.put((Long)dbId, stored);
		Map<String, Object> audit = new HashMap<>();
		audit.put(dbIdName, lastAuditId.incrementAndGet());
		audit.put("txnId", transaction.get("txnId"));
		audit.put("txnTimeStamp", transaction.get("txnTimeStamp"));
		audit.put("instanceId", dbId);
		audit.put("operation", operation);
		audit.put("instance", stored);
		audits.add(new StoredDocument(null, audit));
		
	}
	
	@Override
	public void delete(Collection<?> toDelete) throws PromptoError {
		store(toDelete, null);
	}
	
	private void doDelete(Collection<?> toDelete) {
		for(Object dbId : toDelete)
			doDelete(dbId);
	}

	private void doDelete(Object dbId) {
		instances.remove(dbId);
		Map<String, Object> audit = new HashMap<>();
		audit.put(dbIdName, lastAuditId.incrementAndGet());
		audit.put("txnId", transaction.get("txnId"));
		audit.put("txnTimeStamp", transaction.get("txnTimeStamp"));
		audit.put("instanceId", dbId);
		audit.put("operation", "DELETE");
		audits.add(new StoredDocument(null, audit));
	}

	@Override
	public void deleteAll() throws PromptoError {
		instances = new HashMap<>();
	}
	
	@Override
	public PromptoBinary fetchBinary(Object dbId, String attr) {
		if(!(dbId instanceof Long))
			dbId = Long.decode(dbId.toString());
		StoredDocument doc = instances.get(dbId);
		if(doc==null)
			return null;
		else
			return (PromptoBinary)doc.getData(attr);
	}
	
	@Override
	public IStored fetchUnique(Object dbId) throws PromptoError {
		return instances.get(dbId);
	}
	
	
	@Override
	public IQueryBuilder newQueryBuilder() {
		return new QueryBuilder();
	}
	
	@Override
	public IStored fetchOne(IQuery query) throws PromptoError {
		Query q = (Query)query;
		for(StoredDocument doc : instances.values()) {
			if(doc.matches(q.getPredicate()))
				return doc;
		}
		return null;
	}
	
	@Override
	public IStoredIterable fetchMany(IQuery query) throws PromptoError {
		Query q = (Query)query;
		final List<StoredDocument> allDocs = fetchManyDocs(q);
		final List<StoredDocument> slicedDocs = slice(q, allDocs);
		return new IStoredIterable() {
			@Override
			public long count() {
				return (long)slicedDocs.size();
			}
			@Override
			public long totalCount() {
				return (long)allDocs.size(); 
			}
			@SuppressWarnings("unchecked")
			@Override
			public Iterator<IStored> iterator() {
				return (Iterator<IStored>)(Object)slicedDocs.iterator();
			};
		};
	}
	
	private List<StoredDocument> fetchManyDocs(Query query) throws PromptoError {
		List<StoredDocument> docs = filterDocs(query==null ? null : query.getPredicate());
		if(query!=null)
			docs = sort(query.getOrdering(), docs);
		return docs;
	}

	private List<StoredDocument> filterDocs(IPredicate predicate) throws PromptoError {
		if(predicate==null)
			return new ArrayList<>(instances.values()); // need a copy to avoid concurrent modification;
		else
			return instances.values().stream()
					.filter(doc->doc.matches(predicate))
					.collect(Collectors.toList());
	}
	
	private List<StoredDocument> slice(Query query, List<StoredDocument> docs) {
		if(docs==null || docs.isEmpty() || query==null)
			return docs;
		Long first = query.getFirst();
		Long last = query.getLast();
		if(first==null && last==null)
			return docs;
		if(first==null || first<1)
			first = 1L;
		if(last==null || last>docs.size())
			last = new Long(docs.size());
		if(first > last)
			return new ArrayList<StoredDocument>();
		return docs.subList(first.intValue() - 1, last.intValue());
	}

	private List<StoredDocument> sort(Collection<IOrderBy> orderBy, List<StoredDocument> docs) {
		if(orderBy==null || orderBy.isEmpty() || docs.size()<2)
			return docs;
		List<java.lang.Boolean> directions = orderBy.stream().map((o)->
				o.isDescending()).collect(Collectors.toList());
		docs.sort(new Comparator<StoredDocument>() {

			@Override
			public int compare(StoredDocument o1, StoredDocument o2) {
				try {
					PromptoTuple<Comparable<?>> v1 = readTuple(o1, orderBy);
					PromptoTuple<Comparable<?>> v2 = readTuple(o2, orderBy);
					return v1.compareTo(v2, directions);
				} catch (PromptoError e) {
					throw new RuntimeException(e);
				}
			}

		});
		return docs;
	}
	
	private PromptoTuple<Comparable<?>> readTuple(StoredDocument doc, Collection<IOrderBy> orderBy) throws PromptoError {
		PromptoTuple<Comparable<?>> tuple = new PromptoTuple<>(false);
		orderBy.forEach((o)->
			tuple.add((Comparable<?>)doc.getData(o.getAttributeInfo().getName())));
		return tuple;
	}

	
	@Override
	public IStorable newStorable(String[] categories, IDbIdFactory dbIdFactory) {
		return new StorableDocument(categories, dbIdFactory);
	}
	
	// for testing
	public IStorable newStorable(List<String> categories, IDbIdListener listener) {
		return newStorable(categories.toArray(new String[0]), listener);
	}
	
	// for testing
	public IStorable newStorable(String[] categories, IDbIdListener listener) {
		IDbIdFactory factory = new IDbIdFactory() {
			@Override public void accept(Object dbId) { listener.accept(dbId); }
			@Override public Object get() { return null; }
			@Override public boolean isUpdate() { return false; }
		};
		return newStorable(categories, factory);
	}


	@Override
	public void flush() throws PromptoError {
		// nothing to do
	}
	
	@Override
	public void close() throws IOException {
		// nothing to do
	}
	
	@Override
	public long nextSequenceValue(String prefix) {
		AtomicLong value = sequences.computeIfAbsent(prefix, k->new AtomicLong(0));
		return value.incrementAndGet();
	}
	
	
	class StorableDocument implements IStorable {

		Map<String, Object> document = null;
		IDbIdFactory dbIdFactory;
		String[] categories;
		
		public StorableDocument(String[] categories, IDbIdFactory dbIdFactory) {
			this.categories = categories;
			this.dbIdFactory = dbIdFactory;
		}


		public Map<String, Object> getDocument() {
			return document;
		}
		
		private void ensureDocument() {
			if(document==null) {
				document = newDocument();
				Object dbId = null;
				if(dbIdFactory!=null)
					dbId = dbIdFactory.get();
				if(dbId==null) {
					dbId = Long.valueOf(lastDbId.incrementAndGet());
					if(dbIdFactory!=null)
						dbIdFactory.accept(dbId);
				}
				setData(dbIdName, dbId);
			}
		}


		@Override
		public String[] getCategories() {
			return categories;
		}

		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof StoredDocument)
				return equals((StoredDocument)obj);
			else if(obj instanceof StorableDocument)
				return equals((StorableDocument)obj);
			else
				return false;
		}
		
		public boolean equals(StoredDocument doc) {
			return Arrays.deepEquals(categories, doc.categories)
					&& Objects.deepEquals(document, doc.document);
		}		

		public boolean equals(StorableDocument doc) {
			return Arrays.deepEquals(categories, doc.categories)
					&& Objects.deepEquals(document, doc.document);
		}		

		public Object getData(String fieldName) {
			if(document==null)
				return null;
			else
				return document.get(fieldName);
		}


		@Override
		public void setCategories(String[] categories) throws PromptoError {
			this.categories = categories;
		}
		
		@Override
		public void setDbId(Object dbId) {
			if(document!=null)
				document.put(dbIdName, dbId);
		}
		
		@Override
		public Object getOrCreateDbId() {
			Object dbId = getData(dbIdName);
			if(dbId==null) {
				if(dbIdFactory!=null)
					dbId = dbIdFactory.get();
				if(dbId==null) {
					dbId = Long.valueOf(lastDbId.incrementAndGet());
					if(dbIdFactory!=null)
						dbIdFactory.accept(dbId);
				}
				setData(dbIdName, dbId);
			}
			return dbId;
		}
		
		@Override
		public void clear() {
			document = null;
		}

		@Override
		public boolean isDirty() {
			return document!=null;
		}
		
		@Override
		public void setData(String fieldName, Object value) {
			ensureDocument();
			document.put(fieldName, value);
		}
		
		private Map<String, Object> newDocument() {
			Map<String, Object> doc = new HashMap<>();
			if(categories!=null) {
				PromptoList<String> value = new PromptoList<>(false);
				for(String name : categories)
					value.add(name);
				doc.put("category", value);
			}
			return doc;
		}

		public boolean matches(IPredicate predicate) {
			if(predicate==null)
				return true;
			else
				return predicate.matches(document);
		}

	}

	class StoredDocument implements IStored {

		final Map<String, Object> document;
		final String[] categories;
		
		public StoredDocument(String[] categories, Map<String, Object> document) {
			this.categories = categories;
			this.document = document;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof StoredDocument)
				return equals((StoredDocument)obj);
			else if(obj instanceof StorableDocument)
				return equals((StorableDocument)obj);
			else
				return false;
		}
		
		public boolean equals(StoredDocument doc) {
			return Arrays.deepEquals(categories, doc.categories)
					&& Objects.deepEquals(document, doc.document);
		}		

		public boolean equals(StorableDocument doc) {
			return Arrays.deepEquals(categories, doc.categories)
					&& Objects.deepEquals(document, doc.document);
		}		

		@Override
		public String[] getCategories() {
			return categories;
		}

		
		@Override
		public Object getDbId() {
			return getData(dbIdName);
		}
		
		public boolean matches(IPredicate predicate) {
			if(predicate==null)
				return true;
			else
				return predicate.matches(document);
		}

		@Override
		public boolean hasData(String name) {
			return document.containsKey(name);
		}

		@Override
		public Object getRawData(String fieldName) {
			return getData(fieldName);
		}
		
		@Override
		public Object getData(String fieldName) {
			return document.get(fieldName);
		}
		
		@Override
		public Set<String> getNames() throws PromptoError {
			Set<String> names = document.keySet();
			names.remove("category");
			names.remove("dbId");
			return names;
		}
		
	}

	@Override
	public Map<String, Object> fetchConfiguration(String name) {
		return configs.get(name);
	}
	
	@Override
	public void storeConfiguration(String name, Map<String, Object> data) {
		configs.put(name, data);
	}

	public List<StoredDocument> getTransactions() {
		return transactions;
	}

	public List<StoredDocument> getAudits() {
		return audits;
	}

	
	
}
