package presto.value;

import org.joda.time.LocalDate;

import presto.type.DateType;



public class DateRange extends Range<Date> {

	public DateRange(Date left, Date right) {
		super(DateType.instance(), left, right);
	}
	
	@Override
	public long length() {
		long h = high.getValue().toDate().getTime();
		long l = low.getValue().toDate().getTime();
		return 1 + ( (h-l)/(24*60*60*1000));
	}

	@Override
	public int compare(Date o1, Date o2) {
		return o1.compareTo(o2);
	}

	@Override
	public Date getItem(long index) {
		LocalDate result = low.getValue().plusDays((int)index-1);
		if(result.isAfter(high.getValue()))
			throw new IndexOutOfBoundsException();
		return new Date(result);
	}
	
	@Override
	public Range<Date> newInstance(Date left, Date right) {
		return new DateRange(left, right);
	}

}
