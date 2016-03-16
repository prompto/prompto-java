package prompto.intrinsic;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
public class PromptoTuple<V> extends ArrayList<V> {

	public PromptoTuple() {
	}

	public PromptoTuple(Collection<V> items) {
		super(items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		forEach((i)->{
			sb.append(i.toString());
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-2); // trim last ", "
		sb.append(')');
		return sb.toString();
	}
	
	public Long getLength() {
		return (long)size();
	}
	
	public long getNativeLength() {
		return size();
	}

	public PromptoTuple<V> slice(long first, long last) {
		if (last < 0)
			last = this.size() + 1 + last;
		return new PromptoTuple<>(this.subList((int)(first-1), (int)last));
	}
	
	public boolean containsAny(Collection<Object> items) {
		for(Object item : items) {
			if(contains(item))
				return true;
		}
		return false;
	}
}
