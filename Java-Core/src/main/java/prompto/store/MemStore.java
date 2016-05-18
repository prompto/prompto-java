package prompto.store;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoTuple;
import prompto.runtime.Context;
import prompto.store.IStorable.IDbIdListener;

/* a utility class for running unit tests only */
public final class MemStore implements IStore<Long> {

	private Map<Long, StorableDocument> documents = new HashMap<>();
	private AtomicLong lastDbId = new AtomicLong(0);
	
	@Override
	public Class<?> getDbIdClass() {
		return Long.class;
	}
	
	@Override
	public Long convertToDbId(Object dbId) {
		if(dbId instanceof Long)
			return (Long)dbId;
		else
			return Long.decode(String.valueOf(dbId));
	}
	
	@Override
	public Type getColumnType(String name) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeDeclaration> columns) {
		// nothing to do
	}
	
	@Override
	public void store(Collection<Long> deletables, Collection<IStorable> storables) throws PromptoError {
		for(IStorable storable : storables) {
			if(!(storable instanceof StorableDocument))
				throw new IllegalStateException("Expecting a StorableDocument");
			store((StorableDocument)storable);
		}
	}
	
	public void store(StorableDocument storable) throws PromptoError {
		// ensure db id
		Object dbId = storable.getData(dbIdName);
		if(!(dbId instanceof Long)) {
			dbId = Long.valueOf(lastDbId.incrementAndGet());
			storable.setData(dbIdName, dbId);
		}
		documents.put((Long)dbId, storable);
	}
	
	@Override
	public void delete(Collection<Long> dbIds) throws PromptoError {
		for(Long dbId : dbIds)
			documents.remove(dbId);
	}
	
	@Override
	public void deleteAll() throws PromptoError {
		documents = new HashMap<>();
	}
	
	@Override
	public PromptoBinary fetchBinary(Long dbId, String attr) {
		for(StorableDocument doc : documents.values()) {
			Object data = doc.getData(IStore.dbIdName);
			if(data==null || !dbId.equals(data.toString()))
				continue;
			data = doc.getData("attr");
		}
		return null;
	}
	
	@Override
	public IStored fetchUnique(Long dbId) throws PromptoError {
		return documents.get(dbId);
	}
	
	@Override
	public IQueryInterpreter<Long> getQueryInterpreter(Context context) {
		return new QueryInterpreter<Long>(context);
	}
	
	@Override
	public IQueryFactory getQueryFactory() {
		return new QueryFactory();
	}
	
	@Override
	public IStored fetchOne(IQuery query) throws PromptoError {
		for(StorableDocument doc : documents.values()) {
			if(doc.matches(((Query)query).getPredicate()))
				return doc;
		}
		return null;
	}
	
	@Override
	public IStoredIterable fetchMany(IQuery query) throws PromptoError {
		final List<StorableDocument> allDocs = fetchManyDocs(query);
		final List<StorableDocument> slicedDocs = slice(query, allDocs);
		return new IStoredIterable() {
			@Override
			public long length() {
				return (long)slicedDocs.size();
			}
			@Override
			public long totalLength() {
				return (long)allDocs.size(); 
			}
			@SuppressWarnings("unchecked")
			@Override
			public Iterator<IStored> iterator() {
				return (Iterator<IStored>)(Object)slicedDocs.iterator();
			};
		};
	}
	
	private List<StorableDocument> fetchManyDocs(IQuery query) throws PromptoError {
		List<StorableDocument> docs = filterDocs(((Query)query).getPredicate());
		docs = sort(((Query)query).getOrdering(), docs);
		return docs;
	}

	private List<StorableDocument> filterDocs(IPredicate predicate) throws PromptoError {
		// create list of filtered docs
		List<StorableDocument> docs = new ArrayList<StorableDocument>();
		List<StorableDocument> all = new ArrayList<>(documents.values()); // need a copy to avoid concurrent modification
		for(StorableDocument doc : all) {
			if(doc.matches(predicate))
				docs.add(doc);
		}
		return docs;
	}
	
	private List<StorableDocument> slice(IQuery query, List<StorableDocument> docs) {
		if(docs==null || docs.isEmpty())
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
			return new ArrayList<StorableDocument>();
		return docs.subList(first.intValue() - 1, last.intValue());
	}

	private List<StorableDocument> sort(Collection<IOrderBy> orderBy, List<StorableDocument> docs) {
		if(orderBy==null || orderBy.isEmpty() || docs.size()<2)
			return docs;
		List<java.lang.Boolean> directions = orderBy.stream().map((o)->
				o.isDescending()).collect(Collectors.toList());
		docs.sort(new Comparator<StorableDocument>() {

			@Override
			public int compare(StorableDocument o1, StorableDocument o2) {
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
	
	private PromptoTuple<Comparable<?>> readTuple(StorableDocument doc, Collection<IOrderBy> orderBy) throws PromptoError {
		PromptoTuple<Comparable<?>> tuple = new PromptoTuple<>(false);
		orderBy.forEach((o)->
			tuple.add((Comparable<?>)doc.getData(o.getAttributeInfo().getName())));
		return tuple;
	}

	
	@Override
	public IStorable newStorable(List<String> categories, IDbIdListener listener) {
		return new StorableDocument(categories, listener);
	}
	
	
	@Override
	public void flush() throws PromptoError {
		// nothing to do
	}
	
	class StorableDocument implements IStored, IStorable {

		Map<String, Object> document = null;
		IDbIdListener listener;
		List<String> categories;
		
		public StorableDocument(List<String> categories, IDbIdListener listener) {
			this.categories = categories;
			this.listener = listener;
		}

		public boolean matches(IPredicate predicate) {
			if(predicate==null)
				return true;
			else
				return predicate.matches(document);
		}
		
		@Override
		public void setCategories(String[] categories) throws PromptoError {
			this.categories = Arrays.asList(categories);
		}

		@Override
		public Object getDbId() {
			return getData(dbIdName);
		}
		
		@Override
		public Object getOrCreateDbId() {
			Object dbId = getData(dbIdName);
			if(dbId==null) {
				setDirty(true);
				dbId = Long.valueOf(lastDbId.incrementAndGet());
				document.put(dbIdName, dbId);
			}
			return dbId;
		}
		
		@Override
		public void setDirty(boolean set) {
			if(!set)
				document = null;
			else if(document==null)
				document = newDocument(null);
		}

		private Map<String, Object> newDocument(Object dbId) {
			Map<String, Object> doc = new HashMap<>();
			if(categories!=null) {
				PromptoList<String> value = new PromptoList<>(false);
				for(String name : categories)
					value.add(name);
				doc.put("category", value);
			}
			if(dbId==null)
				dbId = Long.valueOf(lastDbId.incrementAndGet());
			doc.put(dbIdName, dbId);
			return doc;
		}

		@Override
		public boolean isDirty() {
			return document!=null;
		}

		@Override
		public Object getData(String name) {
			if(document==null)
				return null;
			else
				return document.get(name);
		}
		
		@Override
		public void setData(String name, Object value, IDbIdProvider provider) {
			if(document==null) {
				Object dbId = provider==null ? null : provider.getDbId();
				document = newDocument(dbId);
			}
			document.put(name, value);
		}
		
	}

	
}
