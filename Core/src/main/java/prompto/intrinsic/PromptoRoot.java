package prompto.intrinsic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import prompto.compiler.CompilerUtils;
import prompto.compiler.PromptoClassLoader;
import prompto.declaration.CategoryDeclaration;
import prompto.error.NotStorableError;
import prompto.grammar.Identifier;
import prompto.runtime.ApplicationContext;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.DataStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.store.InvalidValueError;

public abstract class PromptoRoot extends PromptoStorableBase implements IMutable, IDocumentable {

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
	
	public static PromptoRoot newInstanceFromDbIdRef(Object value) {
		if(value instanceof PromptoRoot)
			return (PromptoRoot)value;
		if(DataStore.getInstance().getDbIdClass().isInstance(value))
			value = DataStore.getInstance().fetchUnique(value);
		if(value instanceof IStored)
			return newInstance((IStored)value);
		else
			return (PromptoRoot)value; // will eventually throw an InvalidCastException 
	}
	
	public static IterableWithCounts<PromptoRoot> newIterable(IStoredIterable iterable) {
		return new IterableWithCounts<PromptoRoot>() {
			
			@Override
			public Long getCount() {
				return iterable.count();
			}
			
			@Override
			public Long getTotalCount() {
				return iterable.totalCount();
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
	
	
	public static Object getStorableData(Object value) {
		if(value instanceof PromptoEnum)
			return ((PromptoEnum)value).getName();
		else if(value instanceof PromptoRoot)
			return ((PromptoRoot)value).getStorableData();
		else
			return null;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends PromptoRoot> T convertObjectToExact(Object o, Class<T> klass) {
		if(o==null)
			return null;
		else if(klass.isInstance(o))
			return (T)o;
		// TODO: convert Document to instance
		else
			throw new InvalidValueError("Expected a " + klass.getSimpleName() +", got " + o.getClass().getSimpleName());
	}

	protected IStorable storable;
	protected boolean mutable;
	
	protected PromptoRoot() {
	}
	
	protected PromptoRoot(IStored stored) {
		if(stored!=null)
			dbId = stored.getDbId();
	}
	
	public CategoryDeclaration getCategory() {
		String name = getCategoryName();
		Context context = ApplicationContext.get();
		return context.getRegisteredDeclaration(CategoryDeclaration.class, new Identifier(name));
	}
	
	private String getCategoryName() {
		String[] parts = this.getClass().getName().split("%");
		return parts[parts.length-1];
	}

	public IStorable getStorable() {
		return storable;
	}
	
	public final Object getStorableData() {
		// this is called when storing the instance as a field value, so we just return the dbId
		// the instance data itself will be collected as part of collectStorables
		if(this.storable==null)
			throw new NotStorableError();
		else
			return this.getOrCreateDbId();
	}
	
	private Object getOrCreateDbId() throws NotStorableError {
		Object dbId = getDbId();
		if(dbId==null) {
			dbId = this.storable.getOrCreateDbId();
			setDbId(dbId);
		}
		return dbId;
	}

	/* not a great name, but avoids collision with field setters */
	protected final void setStorable(String name, Object value) {
		if(storable!=null)
			storable.setData(name, value);
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
			PromptoException.throwEnumeratedException("NOT_MUTABLE");
	}
	
	@Override
	public void checkImmutable() {
		if(this.mutable) 
			PromptoException.throwEnumeratedException("NOT_MUTABLE");
	}
	
	@Override
	public PromptoRoot toMutable() {
		try {
			Constructor<?> cons = this.getClass().getConstructor();
			PromptoRoot instance = (PromptoRoot)cons.newInstance();
			instance.mutable = true;
			List<Field> fields = collectFields();
			for(Field field: fields) {
				field.setAccessible(true);
				Object value = field.get(this);
				field.set(instance, value);
			}
			return instance;
		} catch(Exception e) {
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
		fields.forEach(field-> {
			sb.append(field.getName());
			sb.append(':');
			sb.append(String.valueOf(getFieldValue(this, field)));
			sb.append(", ");
		});
		if(sb.length()>1)
			sb.setLength(sb.length()-", ".length()); // remove trailing ", "
		sb.append('}');
		return sb.toString();
	}

	protected static Object getFieldValue(Object instance, Field field) {
		boolean accessible = field.isAccessible();
		return accessible ? getAccessibleFieldValue(instance, field) : getInaccessibleFieldValue(instance, field);
	}
	
	private static Object getInaccessibleFieldValue(Object instance, Field field) {
		try {
			field.setAccessible(true);
			return getAccessibleFieldValue(instance, field);
		} finally {
			field.setAccessible(false);
		}
	}


	private static Object getAccessibleFieldValue(Object instance, Field field) {
		try {
			return field.get(instance);
		} catch (Exception e) {
			return "<unreadable>";
		} 
	}
	
	private List<Field> collectFields() {
		List<Field> list = new ArrayList<>();
		collectFields(list, this.getClass());
		return list;
	}

	private static Set<String> hiddenFields = new HashSet<>(Arrays.asList("category", "dbId", "storable", "mutable", "hiddenFields"));
	
	private void collectFields(List<Field> list, Class<?> klass) {
		if(Object.class==klass)
			return;
		collectFields(list, klass.getSuperclass());
		list.addAll(
				Arrays.asList(klass.getDeclaredFields())
				.stream()
				.filter((f)->
					!hiddenFields.contains(f.getName()))
				.collect(Collectors.toList()));
	}

	public void collectStorables(Consumer<IStorable> collector) {
		if(storable!=null && storable.isDirty()) {
			getOrCreateDbId();
			collector.accept(storable);
		}
	}

	@Override
	public PromptoDocument<String, Object> toDocument() {
		PromptoDocument<String, Object> doc = new PromptoDocument<>(); 
		List<Field> fields = collectFields();
		fields.forEach(field-> {
			Object value = getFieldValue(this, field);
			if(value instanceof IDocumentable)
				value = ((IDocumentable)value).toDocument();
			doc.put(field.getName(), value);
		});
		return doc;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other==null || other.getClass()!=this.getClass())
			return false;
		for(Field field : collectFields()) {
			Object thisValue = getFieldValue(this, field);
			Object otherValue = getFieldValue(other, field);
			if(!Objects.equals(thisValue, otherValue))
				return false;
		}
		return true;
	}
	
}
