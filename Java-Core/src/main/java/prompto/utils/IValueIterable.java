package prompto.utils;

import java.util.Collection;
import java.util.Iterator;

import prompto.expression.IExpression;
import prompto.intrinsic.IterableWithLength;
import prompto.intrinsic.IteratorWithLength;
import prompto.runtime.Context;
import prompto.value.IValue;

public class IValueIterable<T extends Object> implements IterableWithLength<IValue> {

	Context context;
	Collection<T> iterable;
	
	public IValueIterable(Context context, Collection<T> iterable) {
		this.context = context;
		this.iterable = iterable;
	}

	@Override
	public IteratorWithLength<IValue> iterator() {
		return new IteratorWithLength<IValue>() {
		
			Iterator<T> iterator = iterable.iterator();
			
			@Override
			public long getLength() {
				return iterable.size();
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
		};
	}
}