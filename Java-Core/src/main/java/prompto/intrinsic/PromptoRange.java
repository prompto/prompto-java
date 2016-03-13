package prompto.intrinsic;

public class PromptoRange<T extends Object> {
	
	T low;
	T high;
	
	public PromptoRange(T low, T high) {
		this.low = low;
		this.high = high;
	}
	
	public T getLow() {
		return low;
	}
	
	public T getHigh() {
		return high;
	}
	
	@Override
	public String toString() {
		return "[" + low.toString() + ".." + high.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof PromptoRange<?>
			&& low.equals(((PromptoRange<?>)obj).low) 
			&& high.equals(((PromptoRange<?>)obj).high);
	}
}
