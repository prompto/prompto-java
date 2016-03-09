package prompto.custom;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
public class PromptoTuple<V> extends ArrayList<V> {

	public PromptoTuple() {
	}

	public PromptoTuple(Collection<V> items) {
		super(items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		forEach((i)->{
			sb.append(i.toString());
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-2); // trim last ", "
		sb.append(')');
		return sb.toString();
	}
}
