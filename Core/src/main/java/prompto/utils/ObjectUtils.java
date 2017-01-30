package prompto.utils;

public abstract class ObjectUtils {

	@SuppressWarnings("unchecked")
	public static <T> T downcast(Class<T> klass, Object actual) {
		if(actual!=null && klass.isAssignableFrom(actual.getClass()))
			return (T)actual;
		else
			return null;
	}

}
