package prompto.intrinsic;

import java.util.Collection;
import java.util.HashMap;

@SuppressWarnings("serial")
public class PromptoDict<K,V> extends HashMap<K,V> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (Entry<K,V> kvp : entrySet()) {
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

}
