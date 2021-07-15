package prompto.intrinsic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* class for enumerated native symbols */
public abstract class PromptoNativeSymbol implements PromptoEnum {

	public static List<PromptoNativeSymbol> getNativeSymbols(Class<?> klass) {
		List<PromptoNativeSymbol> list = new ArrayList<>();
		for(Field field : klass.getDeclaredFields()) {
			if(Character.isUpperCase(field.getName().charAt(0))) {
				list.add(nativeSymbolOf(field));
			}
		}
		return list;
	}
	
	public static PromptoNativeSymbol nativeSymbolOf(Class<?> klass, String name) {
		try {
			Field field = klass.getDeclaredField(name);
			return nativeSymbolOf(field);
		} catch (IllegalArgumentException | NoSuchFieldException e) {
			return null;
		}
	}
	
	private static PromptoNativeSymbol nativeSymbolOf(Field field) {
		return new PromptoNativeSymbol() {
			@Override
			public String getName() {
				return field.getName();
			}
			@Override
			public Object getValue() {
				try {
					return field.get(null);
				} catch(IllegalAccessException e) {
					return null;
				}
			}
		};	
	}

	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public Object toDocumentValue() {
		return getValue();
	}
}
