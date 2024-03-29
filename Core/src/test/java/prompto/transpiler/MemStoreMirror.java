package prompto.transpiler;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.openjdk.nashorn.api.scripting.ScriptObjectMirror;
import prompto.intrinsic.PromptoDbId;
import prompto.intrinsic.PromptoDocument;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IAuditMetadata;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStorable.IDbIdProvider;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.store.memory.MemStore;
import prompto.store.memory.Query;

public class MemStoreMirror {
	
	private static boolean isFunction(Object v) {
		return v instanceof ScriptObjectMirror && ((ScriptObjectMirror)v).isFunction();
	}

	public static void dump(Object o) {
		System.err.println(o);
	}

	MemStore store = new MemStore(()->true);
	ScriptEngine nashorn;
	ValueConverter converter;
	
	public MemStoreMirror(ScriptEngine nashorn) throws ScriptException {
		this.nashorn = nashorn;
		this.converter = new ValueConverter();
		Object code = nashorn.eval("Java.type('prompto.transpiler.MemStoreMirror').dump");
		nashorn.getBindings(ScriptContext.ENGINE_SCOPE).put("dump", code);
		code = nashorn.eval("function(o) { dump(typeof(o)); }");
		nashorn.getBindings(ScriptContext.ENGINE_SCOPE).put("dumpType", code);
	
	}

	public StorableMirror newStorableDocument(String[] categories, ScriptObjectMirror dbIdFactory) {
		IDbIdProvider provider = () -> store.convertToDbId(dbIdFactory.callMember("provider"));
		IDbIdListener listener = dbId -> dbIdFactory.callMember("listener", ((Long)dbId.getValue()).intValue()); // workaround horrible Nashorn JS logic where Long(1) !== Integer(1)
		IDbIdFactory factory = IDbIdFactory.of(provider, listener, ()->true);
		IStorable storable = store.newStorable(categories, factory);
		return new StorableMirror(storable);
	}
	
	public void deleteAndStore(Object[] toDelete, Object[] toStore, Object metaData) throws ScriptException {
		Set<PromptoDbId> del = toDelete==null ? null : Stream.of(toDelete).map(dbId->store.convertToNativeDbId(dbId)).map(store::convertToDbId).collect(Collectors.toSet());
		Set<IStorable> add = toStore==null ? null : Stream.of(toStore).map(item->((StorableMirror)item).getStorable()).collect(Collectors.toSet());
		IAuditMetadata meta = toAuditMetadata(metaData);
		store.deleteAndStore(del, add, meta);
	}
	
	public void deleteAndStoreAsync(Object[] toDelete, Object[] toStore, Object metaData, ScriptObjectMirror andThen) {
		Set<PromptoDbId> del = toDelete==null ? null : Stream.of(toDelete).map(store::convertToDbId).collect(Collectors.toSet());
		Set<IStorable> add = toStore==null ? null : Stream.of(toStore).map(item->((StorableMirror)item).getStorable()).collect(Collectors.toSet());
		IAuditMetadata meta = toAuditMetadata(metaData);
		store.deleteAndStore(del, add, meta);
		andThen.call(null);
	}

	@SuppressWarnings("unchecked")
	private IAuditMetadata toAuditMetadata(Object metaData) {
		IAuditMetadata meta = store.newAuditMetadata();
		meta.setUTCTimestamp(LocalDateTime.now(ZoneId.of("UTC")));
		if(metaData instanceof Map) {
			Map<String, Object> entries = (Map<String, Object>)converter.fromJS(metaData);
			meta.putAll(entries);
		} 
		return meta;
	}

	public void flush() {
		store.flush();
	}
	
	public Object fetchOne(Query query) {
		IStored stored = store.fetchOne(query);
		return stored==null ? null : new StoredMirror(stored);
	}
	
	public void fetchOneAsync(Query query, ScriptObjectMirror andThen) {
		IStored stored = store.fetchOne(query);
		StoredMirror mirror = stored==null ? null : new StoredMirror(stored);
		andThen.call(null, mirror);
	}

	public Object fetchMany(Query query, boolean mutable) {
		IStoredIterable iterable = store.fetchMany(query);
		StoredIterableMirror mirror = new StoredIterableMirror(iterable);
		ScriptObjectMirror cursorFn = (ScriptObjectMirror)nashorn.get("Cursor");
		return cursorFn.newObject(mutable, mirror);
	}

	public void fetchManyAsync(Query query, boolean mutable, ScriptObjectMirror andThen) throws Exception {
		IStoredIterable iterable = store.fetchMany(query);
		StoredIterableMirror mirror = new StoredIterableMirror(iterable);
		ScriptObjectMirror cursorFn = (ScriptObjectMirror)nashorn.get("Cursor");
		Object cursor = cursorFn.newObject(mutable, mirror);
		andThen.call(null, cursor);
	}

	public MemQueryBuilderMirror newQueryBuilder() {
		return new MemQueryBuilderMirror();
	}
	
	public class MemQueryBuilderMirror {
		
		IQueryBuilder builder = store.newQueryBuilder();
		
		public void verify(ScriptObjectMirror fieldInfo, ScriptObjectMirror matchOp, Object value) {
			AttributeInfo info = AttributeInfoReader.read(fieldInfo);
			MatchOp match = MatchOpReader.read(matchOp);
			value = converter.fromJS(value);
			builder.verify(info, match, value);
		}
		
		public void and() {
			builder.and();
		}
		
		public void or() {
			builder.or();
		}

		public void not() {
			builder.not();
		}

		public IQuery build() {
			return builder.build();
		}
		
		public void addOrderByClause(ScriptObjectMirror fieldInfo, boolean descending) {
			AttributeInfo info = AttributeInfoReader.read(fieldInfo);
			builder.orderBy(info, descending);
		}
		
		public void setFirst(long first) {
			builder.first(first);
		}
		
		public void setLast(long last) {
			builder.last(last);
		}
		
		public void project(List<String> names) {
			builder.project(names);
		}

	}
	
	class ValueConverter {

		@SuppressWarnings("unchecked")
		public Object fromJS(Object value) {
			if(value instanceof ScriptObjectMirror)
				value = fromScriptObjectMirror((ScriptObjectMirror)value);
			if(value==null || value instanceof Boolean || value instanceof Long || value instanceof Double || value instanceof String)
				return value;
			else if(value instanceof Integer)
				return ((Integer)value).longValue();
			else if(value instanceof Float)
				return ((Float)value).doubleValue();
			else if(value instanceof StorableMirror)
				return ((StorableMirror)value).getStorable();
			else if(value instanceof StoredMirror)
				return ((StoredMirror)value).getStored();
			else if(value instanceof List)
				return ((List<Object>)value).stream().map(this::fromJS).collect(Collectors.toList());
			else if(value instanceof Map) {
				Map<String, Object> mapResult = new HashMap<>();
				((Map<String, Object>)value).forEach((k,v)->{
					if(!isFunction(v))
						mapResult.put(k, fromJS(v));
				});
				return mapResult;
			} else
				throw new UnsupportedOperationException(value.getClass().getName());
		}
		
		public Object fromScriptObjectMirror(ScriptObjectMirror value) {
			if(value.isArray()) {
				return fromJSArray(value);
			} else if(value.getClassName().equals("Object")) {
				String className = getClassName(value);
				if("List".equals(className)) 
					return fromJSList(value);
				else if("Set".equals(className))
					return fromJSSet(value);
				else
					return fromJSObject(value);
			} else
				throw new UnsupportedOperationException(value.getClassName());
			
		}

	
		private Object fromJSArray(ScriptObjectMirror value) {
			List<Object> listResult = new ArrayList<Object>();
			value.forEach((k,v)->{
				if(!isFunction(v))
					listResult.add(fromJS(v));
			});
			return listResult;
		}


		private Object fromJSList(ScriptObjectMirror value) {
			List<Object> listResult = new ArrayList<Object>();
			value.forEach((k,v)->{
				if(!isFunction(v) && !"length".equals(k) && !"mutable".equals(k))
					listResult.add(fromJS(v));
			});
			return listResult;
		}


		private Object fromJSSet(ScriptObjectMirror value) {
			throw new UnsupportedOperationException();
		}


		private Object fromJSObject(ScriptObjectMirror value) {
			Map<String, Object> mapResult = new HashMap<>();
			value.forEach((k,v)->{
				if(!isFunction(v) && !"$storable".equals(k) && !"$mutable".equals(k))
					mapResult.put(k, fromJS(v));
			});
			return mapResult;
		}


		private String getClassName(ScriptObjectMirror value) {
			value = (ScriptObjectMirror)value.getMember("constructor");
			return (String)value.getMember("name");
		}


		@SuppressWarnings("unchecked")
		public Object toJS(Object value, boolean isStorable) {
			if(value==null || value instanceof Boolean || value instanceof Integer || value instanceof Long || value instanceof Double || value instanceof String || value instanceof StoredMirror || value instanceof StorableMirror)
				return value;
			else if(value instanceof IStored)
				return new StoredMirror((IStored)value);
			else if(value instanceof IStorable)
				return new StorableMirror((IStorable)value);
			else if(value instanceof List) 
				return isStorable ? toJSList((List<Object>)value, isStorable) : toJSArray((List<Object>)value, isStorable);
			else if(value instanceof PromptoDocument) 
				return toJSDocument((PromptoDocument<String,Object>)value);
			else if(value instanceof Map) 
				return toJSObject((Map<String,Object>)value, isStorable); 
			else if(value instanceof LocalDateTime)
				return toJSLocalDateTime((LocalDateTime)value);
			else if(value instanceof PromptoDbId)
				return toJS(((PromptoDbId)value).getValue(), isStorable);
			else
				throw new UnsupportedOperationException(value.getClass().getName());
		}
		
		private Object toJSLocalDateTime(LocalDateTime value) {
			String expression = "typeof(DateTime) == typeof({}) ? DateTime.parse('" + value.toString() + "') : new Date('" + value.toString().substring(0,19) + "')";
			return safeEval("(" + expression + ")");
		}

		private Object toJSDocument(PromptoDocument<String, Object> value) {
			ScriptObjectMirror docFn = (ScriptObjectMirror)nashorn.get("Document");
			ScriptObjectMirror object = (ScriptObjectMirror)docFn.newObject();
			value.forEach((k,v)->object.setMember(k, toJS(v, false)));
			return object;
		}

		private ScriptObjectMirror toJSObject(Map<String, Object> value, boolean isStorable) {
			ScriptObjectMirror object = safeEval("({})");
			value.forEach((k,v)->object.setMember(k, toJS(v, isStorable)));
			return object;
		}

		private ScriptObjectMirror toJSArray(List<Object> value, boolean isStorable) {
			ScriptObjectMirror array = safeEval("[]");
			AtomicInteger index = new AtomicInteger();
			value.forEach(item->array.setSlot(index.getAndIncrement(), toJS(item, isStorable)));
			return array;
		}

		private ScriptObjectMirror toJSList(List<Object> value, boolean isStorable) {
			ScriptObjectMirror array = toJSArray(value, isStorable);
			ScriptObjectMirror listFn = (ScriptObjectMirror)nashorn.get("List");
			// List is injected on demand, if missing probably safe to use array
			return listFn==null ? array : (ScriptObjectMirror)listFn.newObject(false, array);
		}
	
		
		private ScriptObjectMirror safeEval(String script) {
			try {
				return (ScriptObjectMirror)nashorn.eval(script);
			} catch(ScriptException e) {
				throw new RuntimeException(e);
			}
		}
			
	}

	static abstract class MatchOpReader {

		public static MatchOp read(ScriptObjectMirror matchOp) {
			String name = (String)matchOp.getMember("name");
			return MatchOp.valueOf(name);
		}
	}
	
	static abstract class AttributeInfoReader {

		public static AttributeInfo read(ScriptObjectMirror fieldInfo) {
			String name = readName(fieldInfo);
			Family family = readFamily(fieldInfo);
			Boolean collection = readCollection(fieldInfo);
			return new AttributeInfo(name, family, collection, false, false, false, false);
		}

		private static String readName(ScriptObjectMirror fieldInfo) {
			return (String)fieldInfo.getMember("name");
		}

		private static Family readFamily(ScriptObjectMirror fieldInfo) {
			Object family = fieldInfo.getMember("family");
			if(family instanceof ScriptObjectMirror)
				family = ((ScriptObjectMirror)family).get("name");
			return Family.valueOf(family.toString());
		}
		
		private static Boolean readCollection(ScriptObjectMirror fieldInfo) {
			return (Boolean)fieldInfo.getMember("collection");
		}

	}
	
	public class StoredMirror {

		IStored stored;
		
		public StoredMirror(IStored stored) {
			this.stored = stored;
		}
		
		public IStored getStored() {
			return stored;
		}
		
		public Object getData(String name) {
			Object data = stored.getData(name);
			return converter.toJS(data, !"category".equals(name));
		}
		
	}
	
	public class StorableMirror {
		
		IStorable storable;
		
		public StorableMirror(IStorable storable) {
			this.storable = storable;
		}

		public IStorable getStorable() {
			return storable;
		}
		
		public Object getOrCreateDbId() {
			return converter.toJS(storable.getOrCreateDbId(), true);
		}
		
		public void setData(String name, Object value, Object dbId) {
			storable.setData(name, converter.fromJS(value));
		}
		
		public boolean isDirty() {
			return storable.isDirty();
		}
		
		public void clear() {
			storable.clear();
		}
		
	}
	
	public class StoredIterableBase {

		IStoredIterable iterable;
		Iterator<IStored> iterator;
		
		public StoredIterableBase(IStoredIterable iterable) {
			this.iterable = iterable;
			this.iterator = iterable.iterator();
		}
		
		public boolean hasNext() {
			return iterator.hasNext();
		}
		
		public Object next() {
			return converter.toJS(iterator.next(), false);
		}
		
	}
	
	
	public class StoredIterableMirror extends StoredIterableBase {

		public StoredIterableMirror(IStoredIterable iterable) {
			super(iterable);
		}
		
		public long count() {
			return iterable.count();
		}
		
		public long totalCount() {
			return iterable.totalCount();
		}
		
		public Object iterator() {
			Iterator<IStored> iterator = iterable.iterator();
			return new Iterator<Object>() {

				@Override
				public boolean hasNext() {
					return iterator.hasNext();
				}

				@Override
				public Object next() {
					return converter.toJS(iterator.next(), false);
				}};
			
		}

		public Object iterate(ScriptObjectMirror function, ScriptObjectMirror binding) {
			return new StoredIteratorMirror(iterable, function, binding);
		}
	}

	public class StoredIteratorMirror extends StoredIterableBase {

		ScriptObjectMirror function;
		ScriptObjectMirror binding;
		
		public StoredIteratorMirror(IStoredIterable iterable, ScriptObjectMirror function, ScriptObjectMirror binding) {
			super(iterable);
			this.function = function;
			this.binding = binding;
		}

		@Override
		public Object next() {
			Object item = iterator.next();
			return function.call(binding,  item);
		}
		
		public Object getText() {
			List<String> items = new ArrayList<>();
			while(this.hasNext()) {
				Object item = this.next();
				items.add(item.toString());
			}
			return String.join(", ", items);
		}
	}
	
	public Object isAuditEnabled() {
		return store.isAuditEnabled();
	}

	public Object fetchLatestAuditMetadataId(Object dbId) {
		return store.fetchLatestAuditMetadataId(convertDbId(dbId));
	}
	
	public Object fetchAuditMetadataAsDocument(Object dbId) {
		PromptoDocument<String, Object> metadata = store.fetchAuditMetadataAsDocument(convertDbId(dbId));
		return metadata==null ? null : converter.toJS(metadata, true);
	}
	
	public Object deleteAuditMetadata(Object dbId) {
		return store.deleteAuditMetadata(convertDbId(dbId));
	}

	public Object fetchAllAuditMetadataIds(Object dbId) {
		List<PromptoDbId> dbIds = store.fetchAllAuditMetadataIds(convertDbId(dbId));
		return converter.toJS(dbIds, true);
	}
	
	public Object fetchLatestAuditRecordAsDocument(Object dbId) {
		PromptoDocument<String, Object> record = store.fetchLatestAuditRecordAsDocument(convertDbId(dbId));
		return record==null ? null : converter.toJS(record, false);
	}

	public Object deleteAuditRecord(Object dbId) {
		return store.deleteAuditRecord(convertDbId(dbId));
	}

	public Object fetchAllAuditRecordsAsDocuments(Object dbId) {
		List<PromptoDocument<String, Object>> records = store.fetchAllAuditRecordsAsDocuments(convertDbId(dbId));
		return converter.toJS(records, true);
	}
	
	public Object fetchDbIdsAffectedByAuditMetadataId(Object dbId) {
		List<PromptoDbId> dbIds = store.fetchDbIdsAffectedByAuditMetadataId(convertDbId(dbId));
		return converter.toJS(dbIds, true);
	}
	
	@SuppressWarnings("unchecked")
	public Object fetchAuditRecordsMatchingAsDocuments(Object auditPredicates, Object instancePredicates) {
		Map<String, Object> ap = (Map<String, Object>) converter.fromJS(auditPredicates);
		Map<String, Object> ip = (Map<String, Object>) converter.fromJS(instancePredicates);
		List<PromptoDocument<String, Object>> records = store.fetchAuditRecordsMatchingAsDocuments(ap, ip);
		return converter.toJS(records, true);
	}
	
	public PromptoDbId convertDbId(Object dbId) {
		if(dbId instanceof Number)
			dbId = ((Number)dbId).longValue();
		return PromptoDbId.of(dbId);
	}


}
