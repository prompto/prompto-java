package prompto.value;

import prompto.intrinsic.PromptoDate;
import prompto.type.DateType;



public class DateRange extends RangeBase<Date> {

	public DateRange(Date left, Date right) {
		super(DateType.instance(), left, right);
	}
	
	@Override
	public long length() {
		long h = getHigh().getValue().toJavaTime();
		long l = getLow().getValue().toJavaTime();
		return 1 + ( (h-l)/(24*60*60*1000));
	}

	@Override
	public int compare(Date o1, Date o2) {
		return o1.compareTo(o2);
	}

	@Override
	public Date getItem(long index) {
		PromptoDate result = getLow().getValue().plusDays(index-1);
		if(result.isAfter(getHigh().getValue()))
			throw new IndexOutOfBoundsException();
		return new Date(result);
	}
	
	@Override
	public RangeBase<Date> newInstance(Date left, Date right) {
		return new DateRange(left, right);
	}

}
