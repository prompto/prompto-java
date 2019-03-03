package prompto.value;

import prompto.intrinsic.PromptoRange;
import prompto.intrinsic.PromptoTime;
import prompto.type.TimeType;



public class TimeRange extends RangeBase<TimeValue> {

	static class PromptoTimeRange extends PromptoRange<TimeValue> {

		public PromptoTimeRange(prompto.value.TimeValue low, prompto.value.TimeValue high) {
			super(low, high);
		}

		@Override
		public prompto.value.TimeValue getItem(long item) {
			PromptoTime result = low.value.plusSeconds(item-1);
			if(result.isAfter(high.value))
				throw new IndexOutOfBoundsException();
			return new prompto.value.TimeValue(result);
		}
		
		@Override
		public PromptoTimeRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoTimeRange(getItem(first), getItem(last));
		}

		@Override
		public long getNativeCount() {
			return 1 + (high.getMillisOfDay() - low.getMillisOfDay())/1000;
		}
		
		@Override
		public boolean contains(Object item) {
			if(!(item instanceof prompto.value.TimeValue))
				return false;
			prompto.value.TimeValue other = (prompto.value.TimeValue)item;
			return other.compareTo(low)>=0 && high.compareTo(other)>=0;
		}

	}
	
	public TimeRange(TimeValue left, TimeValue right) {
		this(new PromptoTimeRange(left, right));
	}
	
	
	public TimeRange(PromptoRange<TimeValue> range) {
		super(TimeType.instance(), range);
	}


	@Override
	public RangeBase<TimeValue> newInstance(PromptoRange<TimeValue> range) {
		return new TimeRange(range);
	}


}
