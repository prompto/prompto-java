package prompto.intrinsic;

public interface IterableWithLengths<T> extends Iterable<T> {

	Long getLength();
	Long getTotalLength();
	
}
