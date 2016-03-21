package prompto.intrinsic;

import java.util.Iterator;

public interface IteratorWithLength<T> extends Iterator<T> {

	long getLength();
	
}
