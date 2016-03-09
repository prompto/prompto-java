package prompto.custom;

import java.util.HashMap;

@SuppressWarnings("serial")
public class PromptoMap<K,V> extends HashMap<K,V>{

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (Entry<K,V> kvp : entrySet()) {
			sb.append(kvp.getKey().toString());
			sb.append(":");
			sb.append(kvp.getValue().toString());
			sb.append(", ");
		}
		if (sb.length() > 2)
			sb.setLength(sb.length() - 2);
		sb.append("}");
		return sb.toString();
	}
}
