package prompto.intrinsic;

import java.util.Iterator;

public class PromptoIterator<T> implements IteratorWithLength<T> {

	Iterator<T> source;
	long length;
	
	public long getLength() {
		return length;
	}
	
	public PromptoIterator(Iterator<T> source, long length) {
		this.source = source;
		this.length = length;
	}
	
	@Override
	public boolean hasNext() {
		return source.hasNext();
	}
	
	@Override
	public T next() {
		return source.next();
	}
	
}
