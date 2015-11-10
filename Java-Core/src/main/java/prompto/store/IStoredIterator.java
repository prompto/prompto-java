package prompto.store;

import java.util.Iterator;

public interface IStoredIterator extends Iterator<IStored> {
	
	long length();
	
}
