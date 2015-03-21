package presto.parser;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class Utils {

	public static Map<Integer, String> extractTokenNames(Class<?> klass) {
		Map<Integer, String> result = new HashMap<Integer, String>();
		for(Field f : klass.getDeclaredFields()) {
			if(f.getType()!=int.class)
				continue;
			if(!f.getName().equals(f.getName().toUpperCase()))
				continue;
			int mask = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;
			if((f.getModifiers() & mask)!=mask)
				continue;
			try {
				int value = f.getInt(null);
				result.put(value, f.getName());
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}
}
