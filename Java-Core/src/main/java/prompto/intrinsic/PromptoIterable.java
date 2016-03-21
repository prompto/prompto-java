package prompto.intrinsic;

import java.util.Iterator;

public abstract class PromptoIterable<S,R> implements IterableWithLength<R> {

	Iterable<S> source;
	long length;
	
	public PromptoIterable(Iterable<S> source, long length) {
		this.source = source;
		this.length = length;
	}
	
	@Override
	public IteratorWithLength<R> iterator() {
		return new PromptoIterator();
	}
	
	class PromptoIterator implements IteratorWithLength<R> {
		
		Iterator<S> iter = source.iterator();
		
		@Override public long getLength() { return length; }
		
		@Override
		public boolean hasNext() { return iter.hasNext(); }
		
		@Override
		public R next() { 
			return apply(iter.next()); 
		}
	}
	
	protected abstract R apply(S s);
}
