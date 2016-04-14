package prompto.intrinsic;

@SuppressWarnings("unchecked")
public abstract class PromptoAny {

	public static void setMember(Object instance, Object key, Object value) {
		if(instance instanceof PromptoDocument)
			((PromptoDocument<Object,Object>)instance).put(key, value);
		else
			throw new UnsupportedOperationException("Cannot call setMember for " + instance.getClass().getName());
	}
	
	public static Object getMember(Object instance, Object key) {
		if(instance instanceof PromptoDocument)
			return ((PromptoDocument<Object,Object>)instance).getOrCreate(key, PromptoDocument.class);
		else
			throw new UnsupportedOperationException("Cannot call getMember for " + instance.getClass().getName());
	}
	
	public static void setItem(Object instance, Object index, Object value) {
		if(instance instanceof PromptoList && index instanceof Long)
			((PromptoList<Object>)instance).set(((Long)index).intValue(), value);
		else if(instance instanceof PromptoTuple && index instanceof Long)
			((PromptoTuple<Object>)instance).set(((Long)index).intValue(), value);
		else
			throw new UnsupportedOperationException("Cannot call setItem for " + instance.getClass().getName());
	}

	public static Object getItem(Object instance, Object index) {
		if(instance instanceof PromptoList && index instanceof Long)
			return ((PromptoList<Object>)instance).get(((Long)index).intValue());
		else if(instance instanceof PromptoTuple && index instanceof Long)
			return ((PromptoTuple<Object>)instance).get(((Long)index).intValue());
		else
			throw new UnsupportedOperationException("Cannot call setItem for " + instance.getClass().getName());
	}
}
