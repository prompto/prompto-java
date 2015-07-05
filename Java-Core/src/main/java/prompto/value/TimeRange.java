package prompto.value;

import org.joda.time.LocalTime;

import prompto.type.TimeType;



public class TimeRange extends Range<Time> {

	public TimeRange(Time left, Time right) {
		super(TimeType.instance(), left, right);
	}
	
	@Override
	public long length() {
		return 1 + (high.getMillisOfDay() - low.getMillisOfDay())/1000;
	}
	
	@Override
	public int compare(Time o1, Time o2) {
		return o1.compareTo(o2);
	}

	@Override
	public Time getItem(long index) {
		LocalTime result = low.getValue().plusSeconds((int)index-1);
		if(result.isAfter(high.getValue()))
			throw new IndexOutOfBoundsException();
		return new Time(result);
	}
	
	@Override
	public Range<Time> newInstance(Time left, Time right) {
		return new TimeRange(left, right);
	}


}
