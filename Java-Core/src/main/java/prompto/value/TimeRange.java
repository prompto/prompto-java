package prompto.value;

import prompto.intrinsic.PromptoRange;
import prompto.intrinsic.PromptoTime;
import prompto.type.TimeType;



public class TimeRange extends RangeBase<Time> {

	static class PromptoTimeRange extends PromptoRange<Time> {

		public PromptoTimeRange(prompto.value.Time low, prompto.value.Time high) {
			super(low, high);
		}

		@Override
		public prompto.value.Time getItem(long item) {
			PromptoTime result = low.getValue().plusSeconds(item-1);
			if(result.isAfter(high.getValue()))
				throw new IndexOutOfBoundsException();
			return new prompto.value.Time(result);
		}
		
		@Override
		public PromptoTimeRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoTimeRange(getItem(first), getItem(last));
		}

		@Override
		public long length() {
			return 1 + (high.getMillisOfDay() - low.getMillisOfDay())/1000;
		}
		

	}
	
	public TimeRange(Time left, Time right) {
		this(new PromptoTimeRange(left, right));
	}
	
	
	public TimeRange(PromptoRange<Time> range) {
		super(TimeType.instance(), range);
	}


	@Override
	public int compare(Time o1, Time o2) {
		return o1.compareTo(o2);
	}

	@Override
	public RangeBase<Time> newInstance(PromptoRange<Time> range) {
		return new TimeRange(range);
	}


}
