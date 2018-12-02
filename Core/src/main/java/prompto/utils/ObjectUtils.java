package prompto.utils;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class ObjectUtils {

	@SuppressWarnings("unchecked")
	public static <T> T downcast(Class<T> klass, Object actual) {
		if(actual!=null && klass.isAssignableFrom(actual.getClass()))
			return (T)actual;
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public static Set<Class<?>> getClassesInCallStack() {
		return (Set<Class<?>>)(Object) Stream.of(new Throwable().getStackTrace())
				.map(StackTraceElement::getClassName)
				.filter(s->s.indexOf("$Lambda$")<0)
				.map(n->{try{ return Class.forName(n); } catch (ClassNotFoundException e) { throw new RuntimeException(e); }})
				.collect(Collectors.toSet());
	}

	@SuppressWarnings("unchecked")
	public static int safeCompare(Object a, Object b) {
		if(a==b)
			return 0;
		else if(a==null)
			return -1;
		else if(b==null)
			return 1;
		else if(a instanceof Comparable<?>)
			return ((Comparable<Object>)a).compareTo(b);
		else throw new RuntimeException("Not a comparable object:" + a);
	}

}
