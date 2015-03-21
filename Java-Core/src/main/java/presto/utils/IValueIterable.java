package presto.utils;

import java.util.Iterator;

import presto.expression.IExpression;
import presto.runtime.Context;
import presto.value.IValue;

public class IValueIterable implements Iterable<IValue> {

	Context context;
	Iterable<Object> iterable;
	
	public IValueIterable(Context context, Iterable<Object> iterable) {
		this.context = context;
		this.iterable = iterable;
	}

	@Override
	public Iterator<IValue> iterator() {
		return new IValueIterator(iterable.iterator());
	}

	class IValueIterator implements Iterator<IValue> {
		
		Iterator<Object> iterator;
		
		public IValueIterator(Iterator<Object> iterator) {
			this.iterator = iterator;
		}

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public IValue next() {
			try {
				Object value = iterator.next();
				if (value instanceof IExpression)
					value = ((IExpression) value).interpret(context);
				if (value instanceof IValue)
					return (IValue) value;
				else
					throw new InternalError("Item not a value!");
			} catch (Throwable t) {
				throw new InternalError(t.getMessage());
			}

		}

		@Override
		public void remove() {
			throw new InternalError("Should never get there");
		}

	}
}