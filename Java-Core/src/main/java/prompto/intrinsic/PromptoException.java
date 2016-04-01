package prompto.intrinsic;

import java.lang.reflect.Type;

public abstract class PromptoException {

	public static String getExceptionTypeName(Object e) {
		Class<?> type = e.getClass();
		return getExceptionTypeName(type);
	}
	
	public static String getExceptionTypeName(Class<?> type) {
		if(ArithmeticException.class==type)
			return "DIVIDE_BY_ZERO";
		else if(IndexOutOfBoundsException.class==type)
			return "INDEX_OUT_OF_RANGE";
		else if(NullPointerException.class==type)
			return "NULL_REFERENCE";
		else
			return type.getSimpleName();
	}

	public static Type getExceptionType(String name) {
		switch(name) {
		case "DIVIDE_BY_ZERO":
			return ArithmeticException.class;
		case "INDEX_OUT_OF_RANGE":
			return IndexOutOfBoundsException.class;
		case "NULL_REFERENCE":
			return NullPointerException.class;
		default:
			return null;
		}
	}
}
