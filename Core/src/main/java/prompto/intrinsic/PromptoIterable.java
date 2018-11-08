package prompto.intrinsic;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public abstract class PromptoIterable<S,R> implements IterableWithCounts<R> {

	Iterable<S> source;
	long length;
	
	public PromptoIterable(Iterable<S> source, long length) {
		this.source = source;
		this.length = length;
	}
	
	@Override
	public Iterator<R> iterator() {
		return new PromptoIterator();
	}
	
	@Override
	public String toString() {
		return StreamSupport.stream(spliterator(), false)
				.map(Object::toString)
				.collect(Collectors.joining(", "));
	}

	
	class PromptoIterator implements Iterator<R> {
		
		Iterator<S> iter = source.iterator();
		
		@Override
		public boolean hasNext() { return iter.hasNext(); }
		
		@Override
		public R next() { 
			return apply(iter.next()); 
		}
		
	}
	
	protected abstract R apply(S s);
}
