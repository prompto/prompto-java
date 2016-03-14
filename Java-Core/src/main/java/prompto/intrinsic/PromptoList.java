package prompto.intrinsic;

import java.util.ArrayList;
import java.util.Collection;

import prompto.value.IMultiplyable;

@SuppressWarnings("serial")
public class PromptoList<V> extends ArrayList<V> implements IMultiplyable {

	public PromptoList() {
	}

	public PromptoList(Collection<V> items) {
		super(items);
	}

	public Long getLength() {
		return (long)size();
	}
	
	public long getNativeLength() {
		return size();
	}

	public PromptoList<V> multiply(int count) {
		PromptoList<V> result = new PromptoList<>();
		while(count-->0)
			result.addAll(this);
		return result;
	}

	public PromptoList<V> slice(long first, long last) {
		if (last < 0)
			last = this.size() + 1 + last;
		return new PromptoList<>(this.subList((int)(first-1), (int)last));
	}
}
