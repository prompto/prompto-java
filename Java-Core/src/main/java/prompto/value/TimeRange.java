package prompto.value;

import prompto.intrinsic.PromptoTime;
import prompto.type.TimeType;



public class TimeRange extends RangeBase<Time> {

	public TimeRange(Time left, Time right) {
		super(TimeType.instance(), left, right);
	}
	
	@Override
	public long length() {
		return 1 + (getHigh().getMillisOfDay() - getLow().getMillisOfDay())/1000;
	}
	
	@Override
	public int compare(Time o1, Time o2) {
		return o1.compareTo(o2);
	}

	@Override
	public Time getItem(long index) {
		PromptoTime result = getLow().getValue().plusSeconds(index-1);
		if(result.isAfter(getHigh().getValue()))
			throw new IndexOutOfBoundsException();
		return new Time(result);
	}
	
	@Override
	public RangeBase<Time> newInstance(Time left, Time right) {
		return new TimeRange(left, right);
	}


}
