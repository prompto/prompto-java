package prompto.intrinsic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* the root class for enumerated symbols */
public class PromptoSymbol {

	public static List<PromptoSymbol> getSymbols(Class<?> klass) {
		List<PromptoSymbol> list = new ArrayList<>();
		for(Field field : klass.getDeclaredFields()) {
			PromptoSymbol symbol = new PromptoSymbol() {
				@Override
				public String getName() {
					return field.getName();
				}
				@Override
				public Object getValue() {
					try {
						return field.get(null);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}
			};
			list.add(symbol);
		}
		return list;
	}
	
	public String getName() {
		return "";
	}
	
	public Object getValue() {
		return null;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
