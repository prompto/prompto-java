package prompto.intrinsic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import prompto.compiler.CompilerUtils;
import prompto.compiler.PromptoClassLoader;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStorable.IDbIdProvider;
import prompto.store.IStored;
import prompto.store.IStoredIterable;

public abstract class PromptoRoot implements IDbIdProvider, IDbIdListener, IMutable {

	public static PromptoRoot newInstance(IStored stored) {
		if(stored==null) // happens on an unsuccessful fetchOne
			return null;
		else try {
			Object list = stored.getData("category");
			@SuppressWarnings("unchecked")
			String name = ((PromptoList<String>)list).getLast();
			String concreteName = CompilerUtils.getCategoryConcreteType(name).getTypeName();
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
	
	public static IterableWithLength<PromptoRoot> newIterable(IStoredIterable iterable) {
		return new IterableWithLength<PromptoRoot>() {
			
			@Override
			public Long getLength() {
				return iterable.length();
			}

			@Override
			public Iterator<PromptoRoot> iterator() {
				return new Iterator<PromptoRoot>() {
					
					Iterator<IStored> iterator = iterable.iterator();
					
					@Override public boolean hasNext() { 
						return iterator.hasNext(); 
					}
					@Override public PromptoRoot next() { 
						return newInstance(iterator.next()); 
					}
				};
			}
		};
	}
	
	protected Object dbId;
	protected IStorable storable;
	protected boolean mutable;
	
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
		if(storable!=null)
			storable.setData(name, value, this);
	}
	
	@Override
	public boolean isMutable() {
		return mutable;
	}
	
	@Override
	public void setMutable(boolean mutable) {
		this.mutable = mutable;
	}
	
	@Override
	public void checkMutable() {
		if(!this.mutable) 
			throwEnumeratedException("NOT_MUTABLE");
	}
	
	@Override
	public void checkImmutable() {
		if(this.mutable) 
			throwEnumeratedException("NOT_MUTABLE");
	}

	protected void throwEnumeratedException(String name) {
		try {
			String exceptionName = "π.ε.Error$%Error";
			ClassLoader loader = this.getClass().getClassLoader();
			Class<?> klass = loader.loadClass(exceptionName);
			Field field = klass.getDeclaredField(name);
			RuntimeException instance = (RuntimeException)(field.get(null));
			throw instance;
		} catch(ClassNotFoundException | NoSuchFieldException | IllegalAccessException | SecurityException e) {
			throw new RuntimeException(e);
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
				.filter((f)->
					!"mutable".equals(f.getName()))
				.collect(Collectors.toList()));
	}

	public void collectStorables(List<IStorable> storables) {
		IStorable storable = getStorable();
		if(storable!=null && storable.isDirty())
			storables.add(storable);
	}
	
}
