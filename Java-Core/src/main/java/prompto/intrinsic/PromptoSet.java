package prompto.intrinsic;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings("serial")
public class PromptoSet<V> extends HashSet<V> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		forEach((i)->{
			sb.append(i.toString());
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-2); // trim last ", "
		sb.append('>');
		return sb.toString();
	}
	
	public Long getLength() {
		return (long)size();
	}
	
	public long getNativeLength() {
		return size();
	}
	
	public PromptoList<V> sort() {
		TreeSet<V> sorted = new TreeSet<>(this);
		return new PromptoList<>(sorted);
	}

	public boolean containsAny(Collection<Object> items) {
		for(Object item : items) {
			if(contains(item))
				return true;
		}
		return false;
	}
}
