package prompto.intrinsic;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
public class PromptoList<V> extends ArrayList<V> {

	public PromptoList() {
	}

	public PromptoList(Collection<V> items) {
		super(items);
	}

	public Long getLength() {
		return (long)size();
	}
	
	public long getNativeLength() {
		return size();
	}
}
