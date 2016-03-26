package prompto.intrinsic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import prompto.compiler.CompilerUtils;
import prompto.compiler.PromptoClassLoader;
import prompto.error.PromptoError;
import prompto.store.IStorable;
import prompto.store.IStored;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStorable.IDbIdProvider;

public abstract class PromptoRoot implements IDbIdProvider, IDbIdListener {

	public static PromptoRoot newInstance(IStored stored) {
		if(stored==null) // happens on an unsuccessful fetchOne
			return null;
		else try {
			Object list = stored.getData("category");
			@SuppressWarnings("unchecked")
			String name = ((PromptoList<String>)list).getLast();
			String concreteName = "" + CompilerUtils.PROMPTO_CHAR + '.' 
									+ CompilerUtils.CATEGORY_CHAR + '.'
									+ name + CompilerUtils.INNER_SEPARATOR
									+ name;
			PromptoClassLoader loader = PromptoClassLoader.getInstance();
			if(loader==null)
				throw new UnsupportedOperationException("newPromptoRoot can only be used in compiled mode!");
			Class<?> klass = Class.forName(concreteName, true, loader);
			Constructor<?> cons = klass.getConstructor(IStored.class);
			Object instance = cons.newInstance(stored);
			return (PromptoRoot)instance;
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO for now
		}
	}
	
	protected Object dbId;
	protected IStorable storable;
	
	protected PromptoRoot() {
	}
	
	protected PromptoRoot(IStored stored) {
		if(stored!=null)
			dbId = stored.getDbId();
	}
	
	public final Object getDbId() {
		return dbId;
	}
	
	public final void setDbId(Object dbId) {
		this.dbId = dbId;
	}
	
	public IStorable getStorable() {
		return storable;
	}
	
	/* not a great name, but avoids collision with field setters */
	protected final void setStorable(String name, Object value) {
		if(storable!=null) try {
			storable.setData(name, value, this);
		} catch(PromptoError e) {
			throw new RuntimeException(e); // TODO for now
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		// sb.append("{id:");
		// sb.append(System.identityHashCode(this));
		// sb.append(", ");
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
		list.addAll(
				Arrays.asList(klass.getDeclaredFields())
				.stream()
				.filter((f)->
					!"dbId".equals(f.getName()))
				.filter((f)->
					!"storable".equals(f.getName()))
				.collect(Collectors.toList()));
	}

	public void collectStorables(List<IStorable> storables) {
		IStorable storable = getStorable();
		if(storable!=null && storable.isDirty())
			storables.add(storable);
	}
	
}
