package prompto.custom;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
public class PromptoList<V> extends ArrayList<V> {

	public PromptoList() {
	}

	public PromptoList(Collection<V> items) {
		super(items);
	}


}
