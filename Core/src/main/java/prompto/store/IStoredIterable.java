package prompto.store;

public interface IStoredIterable extends Iterable<IStored> {
	
	long length();
	long totalLength();
	
}
