package prompto.value;

import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoRange;
import prompto.type.DateType;



public class DateRange extends RangeBase<Date> {

	static class PromptoDateRange extends PromptoRange<Date> {

		public PromptoDateRange(prompto.value.Date low, prompto.value.Date high) {
			super(low, high);
		}
		
		@Override
		public prompto.value.Date getItem(long item) {
			PromptoDate result = low.getValue().plusDays(item-1);
			if(result.isAfter(high.getValue()))
				throw new IndexOutOfBoundsException();
			return new prompto.value.Date(result);
		}
		
		@Override
		public PromptoDateRange slice(long first, long last) {
			last = adjustLastSliceIndex(last);
			return new PromptoDateRange(getItem(first), getItem(last));
		}

		@Override
		public long length() {
			long h = high.getValue().toJavaTime();
			long l = low.getValue().toJavaTime();
			return 1 + ( (h-l)/(24*60*60*1000));
		}

		
	}
	
	public DateRange(Date left, Date right) {
		this(new PromptoDateRange(left, right));
	}
	
	public DateRange(PromptoRange<Date> range) {
		super(DateType.instance(), range);
	}

	@Override
	public int compare(Date o1, Date o2) {
		return o1.compareTo(o2);
	}

	@Override
	public RangeBase<Date> newInstance(PromptoRange<Date> range) {
		return new DateRange(range);
	}

}
