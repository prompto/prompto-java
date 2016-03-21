package prompto.intrinsic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PromptoList<V> sort() {
		PromptoList<V> sorted = new PromptoList<>(this);
		Collections.sort((PromptoList<Comparable>)sorted); // work around non Comparable V
		return sorted;
	}
	
	public boolean containsAny(Collection<Object> items) {
		for(Object item : items) {
			if(contains(item))
				return true;
		}
		return false;
	}
	
	@Override
	public IteratorWithLength<V> iterator() {
		return new IteratorWithLength<V>() {
			Iterator<V> iter = PromptoList.super.iterator();
			@Override public long getLength() { return PromptoList.this.size(); }
			@Override public boolean hasNext() { return iter.hasNext(); }
			@Override public V next() { return iter.next(); }
		};
	}
		
}
