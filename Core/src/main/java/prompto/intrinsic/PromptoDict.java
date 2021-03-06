package prompto.intrinsic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;

@SuppressWarnings("serial")
public class PromptoDict<K,V> extends HashMap<K,V> implements Iterable<PromptoDict.Entry<K,V>>, IJsonNodeProducer {

	boolean mutable;

	public PromptoDict(boolean mutable) {
		this.mutable = mutable;
	}
	
	public boolean isMutable() {
		return mutable;
	}
	
	public void setMutable(boolean mutable) {
		this.mutable = mutable;
	}
	
	public PromptoDict<String,String> swap() {
		PromptoDict<String,String> swapped = new PromptoDict<>(true);
		for (HashMap.Entry<K,V> kvp : entrySet()) {
			String key = String.valueOf(kvp.getValue());
			String value = String.valueOf(kvp.getKey());
			swapped.put(key, value);	
		}
		swapped.setMutable(false);
		return swapped;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (HashMap.Entry<K,V> kvp : entrySet()) {
			String key = kvp.getKey().toString();
			if(!key.startsWith("\""))
				sb.append('"');
			sb.append(key);
			if(!key.endsWith("\""))
				sb.append('"');
			sb.append(":");
			sb.append(kvp.getValue().toString());
			sb.append(", ");
		}
		if (sb.length() > 2)
			sb.setLength(sb.length() - 2);
		else
			sb.append(":");
		sb.append(">");
		return sb.toString();
	}
	
	@Override
	public V get(Object key) {
		if(key==null)
			throw new NullPointerException();
		return super.get(key);
	}
	
	@Override
	public V put(K key, V value) {
		if(!mutable)
			PromptoException.throwEnumeratedException("NOT_MUTABLE");
		if(key==null)
			throw new NullPointerException();
		return super.put(key, value);
	}
	
	public Long getCount() {
		return (long)size();
	}
	
	public long getNativeCount() {
		return size();
	}
	
	public boolean contains(Object item) {
		return containsKey(item);
	}

	public boolean containsAll(Collection<Object> items) {
		return keySet().containsAll(items);
	}
	
	public boolean containsAny(Collection<Object> items) {
		for(Object item : items) {
			if(containsKey(item))
				return true;
		}
		return false;
	}

	public PromptoSet<K> getKeys() {
		PromptoSet<K> set = new PromptoSet<K>();
		set.addAll(keySet()); // TODO worth the copy?
		return set;
	}
	
	public PromptoList<V> getValues() {
		return new PromptoList<V>(values(), false); // TODO worth the copy?
	}
	
	public static class Entry<K,V> {

		HashMap.Entry<K,V> entry;
		
		public Entry(HashMap.Entry<K,V> entry) {
			this.entry = entry;
		}
		
		public K getKey() {
			return entry.getKey();
		}
		
		public V getValue() {
			return entry.getValue();
		}

	}

	@Override
	public Iterator<Entry<K, V>> iterator() {
		return new Iterator<Entry<K, V>>() {
			Iterator<HashMap.Entry<K,V>> iter = entrySet().iterator();
			@Override public boolean hasNext() { return iter.hasNext(); }
			@Override public Entry<K, V> next() { return new PromptoDict.Entry<>(iter.next()); }
			
		};
	}

	public void removeValue(V value) {
		Set<K> keys = entrySet().stream()
			.filter(e -> e.getValue().equals(value))
			.map(e -> e.getKey())
			.collect(Collectors.toSet());
		keys.forEach(this::remove);
	}
	
	@Override
	public JsonNode toJsonNode() {
		return new PromptoDocument<K,V>(this).toJsonNode();
	}

}
