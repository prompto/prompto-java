package prompto.value;

import java.util.Iterator;

import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.RangeType;

public abstract class Range<T extends IValue> extends BaseValue implements IContainer<T>, IRange<T> {
	
	T low;
	T high;
	
	public Range(IType type, T left, T right) {
		super(new RangeType(type));
		// can't just use T extends Comparable<T> because LocalDate and LocalTime extend Comparable<R>
		int cmp = compare(left,right);
		if(cmp<0) {
			this.low = left;
			this.high = right;
		} else {
			this.low = right;
			this.high = left;
		}
	}
	
	@Override
	public String toString() {
		return "[" + (low==null?"":low.toString()) + ".." 
				+ (high==null?"":high.toString()) + "]";
	}
	
	public T getLow() {
		return low;
	}
	
	public T getHigh() {
		return high;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Range<?>))
			return false;
		Range<?> r = (Range<?>)obj;
		return low.equals(r.low) && high.equals(r.high);
	}
		
	public boolean hasItem(Context context, IValue lval) {
		@SuppressWarnings("unchecked")
		T val = (T)lval;
		return compare(val,low)>=0 && compare(high,val)>=0;
	}
	
	@SuppressWarnings("unchecked")
	public T getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof Integer) {
			try {
				Object value = this.getItem(((Integer) index).IntegerValue());
				if (value instanceof IValue)
					return (T) value;
				else
					throw new InternalError("Item not a value!");
			} catch (IndexOutOfBoundsException e) {
				throw new IndexOutOfRangeError();
			}

		} else
			throw new SyntaxError("No such item:" + index.toString());
		  			
	}

	public Range<T> slice(Integer fi, Integer li) throws PromptoError {
		long size = length();
		long _fi = fi==null ? 1L : fi.IntegerValue();
		if(_fi<0)
			throw new IndexOutOfRangeError();
		long _li = li==null ? size : li.IntegerValue();
		if(_li<0)
			_li = size + 1 + _li;
		else if(_li>size)
			throw new IndexOutOfRangeError();
		return newInstance(getItem(_fi),getItem(_li));
	}

	@Override
	public Iterable<T> getItems(Context context) {
		return new RangeIterable(context);
	}	
	
	class RangeIterable implements Iterable<T> {
		
		Context context;
		
		public RangeIterable(Context context) {
			this.context = context;
		}

		@Override
		public Iterator<T> iterator() {
			return new RangeIterator();
		}

		class RangeIterator implements Iterator<T> {
		
			long index = 0L;
			
			@Override
			public boolean hasNext() {
				return index<length();
			}
	
			@Override
			public T next() {
				try {
					return getItem(context, new Integer(++index));
				} catch(Throwable t) {
					throw new InternalError(t.getMessage());
				}
			}
	
			@Override
			public void remove() {
				throw new RuntimeException("Shold never get there!");
			}
			
		}
	}
	
	@Override
	public boolean isEmpty() {
		return length()==0;
	}
	
	public abstract long length();
	public abstract int compare(T o1,T o2);
	public abstract T getItem(long index);
	public abstract Range<T> newInstance(T left,T right);



}
