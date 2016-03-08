package prompto.value;

import prompto.type.IntegerType;


public class IntegerRange extends Range<Integer> {

	public IntegerRange(Integer left, Integer right) {
		super(IntegerType.instance(), left, right);
	}

	@Override
	public long length() {
		return 1 + high.longValue() - low.longValue();
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
	@Override
	public Integer getItem(long index) {
		Long result = low.longValue() + index - 1;
		if(result>high.longValue())
			throw new IndexOutOfBoundsException();
		return new Integer(result);
	}

	@Override
	public Range<Integer> newInstance(Integer left, Integer right) {
		return new IntegerRange(left, right);
	}
	

}
