package prompto.intrinsic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("serial")
public class PromptoDict<K,V> extends HashMap<K,V> implements Iterable<PromptoDict.Entry<K,V>> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (HashMap.Entry<K,V> kvp : entrySet()) {
			sb.append(kvp.getKey().toString());
			sb.append(":");
			sb.append(kvp.getValue().toString());
			sb.append(", ");
		}
		if (sb.length() > 2)
			sb.setLength(sb.length() - 2);
		sb.append("}");
		return sb.toString();
	}
	
	public Long getLength() {
		return (long)size();
	}
	
	public long getNativeLength() {
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
		return new PromptoList<V>(values()); // TODO worth the copy?
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

			@Override
			public boolean hasNext() { return iter.hasNext(); }

			@Override
			public Entry<K, V> next() { return new PromptoDict.Entry<>(iter.next()); }
			
		};
	}
}
