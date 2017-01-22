package prompto.utils;

public abstract class ObjectUtils {

	public static boolean areEqual(Object o1,Object o2) {
		if(o1==o2)
			return true;
		else if(o1==null || o2==null)
			return false;
		else
			return o1.equals(o2);
	}

	@SuppressWarnings("unchecked")
	public static <T> T downcast(Class<T> klass, Object actual) {
		if(actual!=null && klass.isAssignableFrom(actual.getClass()))
			return (T)actual;
		else
			return null;
	}

}
