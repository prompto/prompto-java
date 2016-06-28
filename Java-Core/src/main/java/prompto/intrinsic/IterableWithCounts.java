package prompto.intrinsic;

public interface IterableWithCounts<T> extends Iterable<T> {

	Long getCount();
	Long getTotalCount();
	
}
