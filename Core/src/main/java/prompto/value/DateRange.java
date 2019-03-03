package prompto.value;

import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoRange;
import prompto.type.DateType;



public class DateRange extends RangeBase<DateValue> {

	static class PromptoDateRange extends PromptoRange<DateValue> {

		public PromptoDateRange(prompto.value.DateValue low, prompto.value.DateValue high) {
			super(low, high);
		}
		
		@Override
		public prompto.value.DateValue getItem(long item) {
			PromptoDate result = low.value.plusDays(item-1);
			if(result.isAfter(high.value))
				throw new IndexOutOfBoundsException();
			return new prompto.value.DateValue(result);
		}
		
		@Override
		public PromptoDateRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoDateRange(getItem(first), getItem(last));
		}

		@Override
		public long getNativeCount() {
			long h = high.value.toJavaTime();
			long l = low.value.toJavaTime();
			return 1 + ( (h-l)/(24*60*60*1000));
		}

		@Override
		public boolean contains(Object item) {
			if(!(item instanceof prompto.value.DateValue))
				return false;
			prompto.value.DateValue other = (prompto.value.DateValue)item;
			return other.compareTo(low)>=0 && high.compareTo(other)>=0;
		}

		
	}
	
	public DateRange(DateValue left, DateValue right) {
		this(new PromptoDateRange(left, right));
	}
	
	public DateRange(PromptoRange<DateValue> range) {
		super(DateType.instance(), range);
	}

	@Override
	public RangeBase<DateValue> newInstance(PromptoRange<DateValue> range) {
		return new DateRange(range);
	}

}
