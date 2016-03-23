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
}
