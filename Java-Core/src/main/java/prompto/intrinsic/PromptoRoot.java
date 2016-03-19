package prompto.intrinsic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PromptoRoot {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		List<Field> fields = collectFields();
		fields.forEach((field)-> {
			sb.append(field.getName());
			sb.append(':');
			try {
				field.setAccessible(true);
				sb.append(String.valueOf(field.get(this)));
				field.setAccessible(false);
			} catch (Exception e) {
				sb.append("<unreadable>");
			} 
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-", ".length()); // remove trailing ", "
		sb.append('}');
		return sb.toString();
	}

	private List<Field> collectFields() {
		List<Field> list = new ArrayList<>();
		collectFields(list, this.getClass());
		return list;
	}

	private void collectFields(List<Field> list, Class<?> klass) {
		if(Object.class==klass)
			return;
		collectFields(list, klass.getSuperclass());
		list.addAll(Arrays.asList(klass.getDeclaredFields()));
	}
	
}
