package prompto.value;

import prompto.intrinsic.PromptoRange;
import prompto.type.IntegerType;


public class IntegerRange extends RangeBase<IntegerValue> {

	static class PromptoIntegerRange extends PromptoRange<IntegerValue> {

		public PromptoIntegerRange(IntegerValue low, IntegerValue high) {
			super(low, high);
		}
		
		@Override
		public IntegerValue getItem(long item) {
			java.lang.Long result = low.longValue() + item - 1;
			if(result>high.longValue())
				throw new IndexOutOfBoundsException();
			return new IntegerValue(result);
		}
		
		@Override
		public long getNativeCount() {
			return 1L + high.longValue() - low.longValue();
		}
			
		@Override
		public PromptoIntegerRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoIntegerRange(getItem(first), getItem(last));
		}

		@Override
		public boolean contains(Object item) {
			if(!(item instanceof prompto.value.IntegerValue))
				return false;
			IntegerValue other = (prompto.value.IntegerValue)item;
			return other.compareTo(low)>=0 && high.compareTo(other)>=0;
		}

	}
	
	public IntegerRange(IntegerValue left, IntegerValue right) {
		this(new PromptoIntegerRange(left, right));
	}

	public IntegerRange(PromptoRange<IntegerValue> range) {
		super(IntegerType.instance(), range);
	}

	@Override
	public long getLength() {
		return 1 + getHigh().longValue() - getLow().longValue();
	}

	@Override
	public RangeBase<IntegerValue> newInstance(PromptoRange<IntegerValue> range) {
		return new IntegerRange(range);
	}
	

}
