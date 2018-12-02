package prompto.intrinsic;

public abstract class PromptoUtils {

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
