package prompto.intrinsic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class PromptoCategorySymbol {

	public static List<Object> getCategorySymbols(Class<?> klass) {
		List<Object> list = new ArrayList<>();
		for(Field field : klass.getDeclaredFields()) {
			if(Character.isUpperCase(field.getName().charAt(0))) {
				list.add(categorySymbolOf(field));
			}
		}
		return list;
	}

	public static Object categorySymbolOf(Class<?> klass, String name) {
		try {
			Field field = klass.getDeclaredField(name);
			return categorySymbolOf(field);
		} catch (IllegalArgumentException | NoSuchFieldException e) {
			return null;
		}
	}
	
	private static Object categorySymbolOf(Field field) {
		try {
			return field.get(null);
		} catch(IllegalAccessException e) {
			return null;
		}
	}
	

}
