package prompto.custom;

import java.util.HashSet;

@SuppressWarnings("serial")
public class PromptoSet<V> extends HashSet<V> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		forEach((i)->{
			sb.append(i.toString());
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-2); // trim last ", "
		sb.append('>');
		return sb.toString();
	}
}
