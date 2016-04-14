package prompto.intrinsic;

import java.util.HashMap;

@SuppressWarnings("serial")
public class PromptoDocument<K,V> extends HashMap<K,V> {

	public V getOrCreate(K key, Class<? extends V> autoCreate) {
		V v = super.get(key);
		if(v==null && autoCreate!=null) try {
			v = autoCreate.newInstance();
			super.put(key, v);
		} catch(IllegalAccessException | InstantiationException e) {
			throw new RuntimeException(e);
		}
		return v;
	}
}
