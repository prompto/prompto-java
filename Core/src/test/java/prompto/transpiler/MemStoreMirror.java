package prompto.transpiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.store.memory.MemStore;
import prompto.store.memory.Query;

@SuppressWarnings("restriction")
public class MemStoreMirror {
	
	MemStore store = new MemStore();
	ScriptEngine nashorn;
	ValueConverter converter;
	
	public MemStoreMirror(ScriptEngine nashorn) {
		this.nashorn = nashorn;
		this.converter = new ValueConverter();
	}

	public StorableMirror newStorableDocument(String[] categories, ScriptObjectMirror dbIdListener) {
		IDbIdListener listener = dbIdListener==null ? null : dbId->dbIdListener.call(null, dbId);
		IStorable storable = store.newStorable(categories, listener);
		return new StorableMirror(storable);
	}
	
	public void store(Object[] toDelete, Object[] toStore) {
		Set<Object> del = toDelete==null ? null : Stream.of(toDelete).map(dbId->store.convertToDbId(dbId)).collect(Collectors.toSet());
		Set<IStorable> add = toStore==null ? null : Stream.of(toStore).map(item->((StorableMirror)item).getStorable()).collect(Collectors.toSet());
		store.store(del, add);
	}
	
	public void storeAsync(Object[] toDelete, Object[] toStore, ScriptObjectMirror andThen) {
		Set<Object> del = toDelete==null ? null : Stream.of(toDelete).collect(Collectors.toSet());
		Set<IStorable> add = toStore==null ? null : Stream.of(toStore).map(item->((StorableMirror)item).getStorable()).collect(Collectors.toSet());
		store.store(del, add);
		andThen.call(null);
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

	}
	
	class ValueConverter {

		@SuppressWarnings("unchecked")
		public Object fromJS(Object value) {
			if(value instanceof ScriptObjectMirror)
				value = fromScriptObjectMirror((ScriptObjectMirror)value);
			if(value==null || value instanceof Boolean || value instanceof Integer || value instanceof Long || value instanceof Float || value instanceof Double || value instanceof String)
				return value;
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


		private boolean isFunction(Object v) {
			return v instanceof ScriptObjectMirror && ((ScriptObjectMirror)v).isFunction();
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
			else if(value instanceof Map) 
				return toJSObject((Map<String,Object>)value, isStorable); 
			else
				throw new UnsupportedOperationException(value.getClass().getName());
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
			return storable.getOrCreateDbId();
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

}
