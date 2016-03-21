package prompto.intrinsic;

public interface IterableWithLength<T> extends Iterable<T> {

    IteratorWithLength<T> iterator();
}
