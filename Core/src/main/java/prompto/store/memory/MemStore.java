package prompto.store.memory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoTuple;
import prompto.store.AttributeInfo;
import prompto.store.IAuditMetadata;
import prompto.store.IAuditRecord;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.utils.Logger;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.store.IAuditRecord.Operation;

/* a utility class for running unit tests only */
public final class MemStore implements IStore {

	static final Logger logger = new Logger();

	private Map<Long, StoredDocument> instances = new HashMap<>();
	private AtomicLong lastDbId = new AtomicLong(0);
	private Map<String, AttributeInfo> attributes = new HashMap<>();
	private Map<String, AtomicLong> sequences = new ConcurrentHashMap<>();
	private Map<String, Map<String, Object>> configs = new ConcurrentHashMap<>();
	boolean audit = false;
	Map<Long, AuditMetadata> auditMetadatas = new HashMap<>();
	private AtomicLong lastAuditMetadataId = new AtomicLong(0);
	Map<Long, AuditRecord> auditRecords = new HashMap<>();
	private AtomicLong lastAuditRecordId = new AtomicLong(0);
	
	public MemStore() {
		this(null);
	}
	
	public MemStore(Supplier<Boolean> supplier) {
		Boolean audit = supplier==null ? null : supplier.get();
		if(audit!=null && audit) {
			this.audit = true;
			logger.debug(()->"Auditor enabled");
		} else
			logger.debug(()->"Auditor disabled");
	}
	
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
	public void deleteAndStore(Collection<?> toDelete, Collection<IStorable> toStore, IAuditMetadata auditMeta) throws PromptoError {
		auditMeta = audit ? storeAuditMetadata(auditMeta) : null;
		if(toDelete!=null) 
			doDelete(toDelete, auditMeta);
		if(toStore!=null)
			doStore(toStore, auditMeta);
	}

	private IAuditMetadata storeAuditMetadata(IAuditMetadata auditMeta) {
		if(auditMeta==null)
			auditMeta = newAuditMetadata();
		auditMetadatas.put((Long)auditMeta.getAuditMetadataId(), (AuditMetadata)auditMeta);
		return auditMeta;
	}

	private void doStore(Collection<IStorable> toStore, IAuditMetadata auditMeta) {
		for(IStorable storable : toStore) {
			if(!(storable instanceof StorableDocument))
				throw new IllegalStateException("Expecting a StorableDocument");
			doStore((StorableDocument)storable, auditMeta);
		}
	}

	private void doStore(StorableDocument storable, IAuditMetadata auditMeta) throws PromptoError {
		// ensure db id
		Object dbId = storable.getData(dbIdName);
		if(!(dbId instanceof Long)) {
			dbId = Long.valueOf(lastDbId.incrementAndGet());
			storable.setData(dbIdName, dbId);
		}
		StoredDocument stored = new StoredDocument(storable.getCategories(), storable.getDocument());
		StoredDocument previous = instances.put((Long)dbId, stored);
		if(audit) {
			AuditRecord audit = newAuditRecord(auditMeta);
			audit.setInstanceDbId(dbId);
			IAuditRecord.Operation operation = previous==null ? Operation.INSERT : Operation.UPDATE;
			audit.setOperation(operation);
			audit.setInstance(stored);
			auditRecords.put((Long)audit.getAuditRecordId(), audit);
		}
	}
	
	private void doDelete(Collection<?> toDelete, IAuditMetadata auditMeta) {
		for(Object dbId : toDelete)
			doDelete(dbId, auditMeta);
	}

	private void doDelete(Object dbId, IAuditMetadata auditMeta) {
		instances.remove(dbId);
		if(audit) {
			AuditRecord audit = newAuditRecord(auditMeta);
			audit.setInstanceDbId(dbId);
			audit.setOperation(IAuditRecord.Operation.DELETE);
			auditRecords.put((Long)audit.getAuditRecordId(), audit);
		}
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
		
		
		@Override
		public void removeData(String fieldName) {
			ensureDocument();
			document.remove(fieldName);
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
		
		
		@Override
		public String toString() {
			return document.toString() + " (" + categories.toString() + ")";
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

	@Override 
	public boolean isAuditEnabled() {
		return audit;
	}
	
	
	@SuppressWarnings("serial")
	static class AuditMetadata extends HashMap<String, Object> implements IAuditMetadata {

		@Override
		public PromptoDocument<String, Object> toDocument() {
			return new PromptoDocument<String, Object>(this);
		}
		
	}

	@Override
	public AuditMetadata newAuditMetadata() {
		AuditMetadata meta = new AuditMetadata();
		meta.setAuditMetadataId(lastAuditMetadataId.incrementAndGet());
		meta.setUTCTimestamp(LocalDateTime.now(ZoneId.of("UTC")));
		return meta;
	}
	
	
	@Override
	public Object fetchLatestAuditMetadataId(Object dbId) {
		return fetchAllAuditMetadataIdsStream(dbId)
				.findFirst()
				.orElse(null);
	}
	
	@Override
	public PromptoList<Object> fetchAllAuditMetadataIds(Object dbId) {
		return fetchAllAuditMetadataIdsStream(dbId)
				.collect(PromptoList.collector());
	}
	
	private Stream<Object> fetchAllAuditMetadataIdsStream(Object dbId) {
		return auditRecords.values().stream()
				.filter(a -> dbId.equals(a.getInstanceDbId()))
				.sorted((a,b) -> a.getUTCTimestamp().isBefore(b.getUTCTimestamp()) ? 1 : -1)
				.map(IAuditRecord::getAuditMetadataId);
	}

	@Override
	public IAuditMetadata fetchAuditMetadata(Object metaId) {
		return auditMetadatas.get(metaId);
	}


	static final Map<String, BiFunction<AuditRecord, Object, Boolean>> MATCHERS = new HashMap<>();
	
	static class AuditRecord implements IAuditRecord {

		Object auditId;
		Object metadataId;
		LocalDateTime utcTimeStamp;
		Object instanceDbId;
		Operation operation;
		IStored instance;
		
		
		@Override
		public String toString() {
			return "{auditId=" + auditId + ", metadataId=" + metadataId + ", utcTimeStamp=" + utcTimeStamp + ", instanceDbId=" + instanceDbId + ", operation=" + operation + ", instance=" + instance + "}";
		}

		@Override
		public void setAuditRecordId(Object id) {
			this.auditId = id;
		}

		@Override
		public Object getAuditRecordId() {
			return auditId;
		}
		
		@Override
		public void setAuditMetadataId(Object id) {
			metadataId = id;
		}

		@Override
		public Object getAuditMetadataId() {
			return metadataId;
		}

		@Override
		public void setUTCTimestamp(LocalDateTime timeStamp) {
			this.utcTimeStamp = timeStamp;
		}

		@Override
		public LocalDateTime getUTCTimestamp() {
			return utcTimeStamp;
		}

		@Override
		public void setInstanceDbId(Object dbId) {
			this.instanceDbId = dbId;
		}

		@Override
		public Object getInstanceDbId() {
			return instanceDbId;
		}

		@Override
		public void setOperation(Operation operation) {
			this.operation = operation;
		}

		@Override
		public Operation getOperation() {
			return operation;
		}

		@Override
		public void setInstance(IStored instance) {
			this.instance = instance;
		}

		@Override
		public IStored getInstance() {
			return instance;
		}

		public boolean matches(Map<String, Object> auditPredicates, Map<String, Object> instancePredicates) {
			// at least 1 predicate is mandatory
			if((auditPredicates==null ? 0 : auditPredicates.size()) + (instancePredicates==null ? 0 : instancePredicates.size())==0)
				return false;
			else
				return (auditPredicates==null || auditPredicates.entrySet().stream()
						.allMatch(this::auditMatches))
						&& (instancePredicates==null || instancePredicates.entrySet().stream()
						.allMatch(this::instanceMatches));
		}
		
		boolean auditMatches(Map.Entry<String, Object> predicate) {
			BiFunction<AuditRecord, Object, Boolean> matcher = findOrCreateMatcher(predicate.getKey());
			return matcher!=null && matcher.apply(this, predicate.getValue());
		}

		private BiFunction<AuditRecord, Object, Boolean> findOrCreateMatcher(String key) {
			BiFunction<AuditRecord, Object, Boolean> matcher = MATCHERS.get(key);
			if(matcher==null) try {
				Field field = AuditRecord.class.getDeclaredField(key);
				if(Enum.class.isAssignableFrom(field.getType()))
					matcher = (record, value) -> { 
						try {
							return Objects.equals(String.valueOf(field.get(record)), String.valueOf(value));
						} catch(IllegalAccessException e) {
							throw new RuntimeException(e);
						}
					};
				else
					matcher = (record, value) -> { 
					try {
						return Objects.equals(field.get(record), value);
					} catch(IllegalAccessException e) {
						throw new RuntimeException(e);
					}
				};
				MATCHERS.put(key, matcher);
			} catch (NoSuchFieldException ignored) {
				
			}
			return matcher;
		}

		boolean instanceMatches(Map.Entry<String, Object> predicate) {
			return instance!=null && Objects.equals(instance.getData(predicate.getKey()), predicate.getValue());
		}

		@Override
		public PromptoDocument<String, Object> toDocument() {
			PromptoDocument<String, Object> doc = new PromptoDocument<>();
			doc.put("dbId", auditId);
			doc.put("metadataId", metadataId);
			doc.put("utcTimeStamp", utcTimeStamp);
			doc.put("instanceDbId", instanceDbId);
			doc.put("operation", operation.name());
			if(instance!=null)
				doc.put("instance", convertInstance(instance));
			return doc;
		}

		private PromptoDocument<String, Object> convertInstance(IStored stored) {
			PromptoDocument<String, Object> doc = new PromptoDocument<>();
			doc.put("dbId", stored.getDbId());
			stored.getNames().forEach(name -> doc.put(name, convertValue(stored.getRawData(name))));
			return doc;
		}

		private Object convertValue(Object value) {
			if(value==null)
				return null;
			else
				return value; // TODO convert to Prompto native types if required
		}
		
		
		
	}

	private AuditRecord newAuditRecord(IAuditMetadata auditMeta) {
		AuditRecord audit = new AuditRecord();
		audit.setAuditRecordId(lastAuditRecordId.incrementAndGet());
		audit.setAuditMetadataId(auditMeta.getAuditMetadataId());
		audit.setUTCTimestamp(auditMeta.getUTCTimestamp());
		return audit;
	}

	@Override
	public AuditRecord fetchLatestAuditRecord(Object dbId) {
		return fetchAuditRecordsStream(a -> dbId.equals(a.getInstanceDbId()))
				.findFirst()
				.orElse(null);
	}

	private Stream<AuditRecord> fetchAuditRecordsStream(Predicate<AuditRecord> filter) {
		return auditRecords.values().stream()
				.filter(filter)
				.sorted((a,b) -> a.getUTCTimestamp().isBefore(b.getUTCTimestamp()) ? 1 : -1);
	}

	@Override
	public PromptoList<AuditRecord> fetchAllAuditRecords(Object dbId) {
		return fetchAuditRecordsCollection(a -> dbId.equals(a.getInstanceDbId()));
	}
	
	
	@Override
	public PromptoList<Object> fetchDbIdsAffectedByAuditMetadataId(Object auditId) {
		return fetchAuditRecordsStream(rec -> Objects.equals(auditId, rec.getAuditMetadataId()))
				.map(AuditRecord::getInstanceDbId)
				.collect(PromptoList.collector());
	}

	private PromptoList<AuditRecord> fetchAuditRecordsCollection(Predicate<AuditRecord> filter) {
		return fetchAuditRecordsStream(filter).collect(PromptoList.collector());
	}

	@Override
	public PromptoList<AuditRecord> fetchAuditRecordsMatching(Map<String, Object> auditPredicates, Map<String, Object> instancePredicates) {
		return auditRecords.values().stream()
				.filter(a -> a.matches(auditPredicates, instancePredicates))
				.sorted((a,b) -> a.getUTCTimestamp().isBefore(b.getUTCTimestamp()) ? 1 : -1)
				.collect(PromptoList.collector());
	}

}
