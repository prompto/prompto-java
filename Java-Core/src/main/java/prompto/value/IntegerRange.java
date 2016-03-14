package prompto.value;

import prompto.intrinsic.PromptoRange;
import prompto.type.IntegerType;


public class IntegerRange extends RangeBase<Integer> {

	static class PromptoIntegerRange extends PromptoRange<Integer> {

		public PromptoIntegerRange(Integer low, Integer high) {
			super(low, high);
		}
		
		@Override
		public Integer getItem(long item) {
			java.lang.Long result = low.longValue() + item - 1;
			if(result>high.longValue())
				throw new IndexOutOfBoundsException();
			return new Integer(result);
		}
		
		@Override
		public long length() {
			return 1L + high.longValue() - low.longValue();
		}
			
		@Override
		public PromptoIntegerRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoIntegerRange(getItem(first), getItem(last));
		}


	}
	
	public IntegerRange(Integer left, Integer right) {
		this(new PromptoIntegerRange(left, right));
	}

	public IntegerRange(PromptoRange<Integer> range) {
		super(IntegerType.instance(), range);
	}

	@Override
	public long length() {
		return 1 + getHigh().longValue() - getLow().longValue();
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
	@Override
	public RangeBase<Integer> newInstance(PromptoRange<Integer> range) {
		return new IntegerRange(range);
	}
	

}
