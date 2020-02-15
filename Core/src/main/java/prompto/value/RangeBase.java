package prompto.value;

import java.util.Iterator;
import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoRange;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.RangeType;

public abstract class RangeBase<T extends IValue> extends BaseValue implements IContainer<T>, IRange<T> {
	
	PromptoRange<T> range;
	
	protected RangeBase(IType type, PromptoRange<T> range) {
		super(new RangeType(type));
		this.range = range;
	}
	
	@Override
	public Object getStorableData() {
		return range;
	}
	
	@Override
	public String toString() {
		return range.toString();
	}
	
	public T getLow() {
		return range.getLow();
	}
	
	public T getHigh() {
		return range.getHigh();
	}

	@Override
	public long getLength() {
		return range.getNativeCount();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof RangeBase && range.equals(((RangeBase<?>)obj).range);
	}
		
	@Override
	public boolean hasItem(Context context, IValue lval) {
		return range.contains(lval);
	}
	
	@Override
	public T getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof IntegerValue) {
			try {
				return range.getItem(((IntegerValue) index).longValue());
			} catch (IndexOutOfBoundsException e) {
				throw new IndexOutOfRangeError();
			}
		} else
			throw new SyntaxError("No such item:" + index.toString());
		  			
	}
	
	@Override
	public RangeBase<T> slice(IntegerValue fi, IntegerValue li) throws PromptoError {
		try {
			long _fi = fi==null ? 1L : fi.longValue();
			long _li = li==null ? -1L : li.longValue();
			PromptoRange<T> sliced = range.slice(_fi, _li);
			return newInstance(sliced);
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfRangeError();
		}
	}

	@Override
	public IterableWithCounts<T> getIterable(Context context) {
		return new RangeIterable(context);
	}	
	
	public abstract RangeBase<T> newInstance(PromptoRange<T> range);

	class RangeIterable implements IterableWithCounts<T> {
		
		Context context;
		
		public RangeIterable(Context context) {
			this.context = context;
		}

		@Override
		public Long getCount() {
			return RangeBase.this.getLength();
		}
		
		@Override
		public Long getTotalCount() {
			return RangeBase.this.getLength();
		}
		
		@Override
		public Iterator<T> iterator() {
			return new Iterator<T>() {
		
				long index = 0L;
				long length = RangeBase.this.getLength();
				
				@Override
				public boolean hasNext() {
					return index<length;
				}
		
				@Override
				public T next() {
					try {
						return getItem(context, new IntegerValue(++index));
					} catch(Throwable t) {
						throw new InternalError(t.getMessage());
					}
				}
		
				@Override
				public void remove() {
					throw new RuntimeException("Shold never get there!");
				}
			};
			
		}
	}
	
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		result.set("low", producer.apply(getLow()));
		result.set("high", producer.apply(getHigh()));
		ObjectNode value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", IntegerType.instance().getTypeName());
		value.put("value", getLength());
		result.set("count", value);
		return result;
	}


}
