package prompto.value;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import prompto.error.IndexOutOfRangeError;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLength;
import prompto.intrinsic.IteratorWithLength;
import prompto.runtime.Context;
import prompto.type.ContainerType;
import prompto.type.IType;


public abstract class BaseList<T extends BaseList<T,I>,I extends List<IValue>> extends BaseValue implements IContainer<IValue>, ISliceable<IValue>, IListable<T> {

	protected I items;

	protected BaseList(ContainerType type) {
		super(type);
		this.items = newItemsInstance();
	}
	
	protected BaseList(ContainerType type, I items) {
		super(type);
		this.items = items;
	}

	public BaseList(ContainerType type, Collection<IValue> items) {
		super(type);
		this.items = newItemsInstance(items);
	}

	protected abstract I newItemsInstance();
	protected abstract I newItemsInstance(Collection<IValue> items);

	public IType getItemType() {
		return ((ContainerType)type).getItemType();
	}

	@Override
	public String toString() {
		return items.toString();
	}

	public void addItem(IValue item) {
		items.add(item);
	}
	
	public Collection<IValue> getItems() {
		return items;
	}
	
	public IValue getItem(int index) {
		return items.get(index);
	}
	
	public void setItem(int index, IValue element) {
		items.set(index, element);
	}
	
	@Override
	public long getLength() {
		return items.size();
	}

	public T merge(Collection<IValue> items) {
		List<IValue> result = newItemsInstance();
		result.addAll(this.items);
		result.addAll(items);
		return newInstance(result);
	}
	
	public boolean hasItem(Context context, IValue lval) throws PromptoError {
		return this.items.contains(lval); // TODO interpret before
	}

	public IValue getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof Integer) {
			try {
				int idx = (int)((Integer)index).longValue() - 1;
				return items.get(idx);
			} catch (IndexOutOfBoundsException e) {
				throw new IndexOutOfRangeError();
			}

		} else
			throw new SyntaxError("No such item:" + index.toString());
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
        if (value instanceof BaseList<?,?>)
            return this.merge(((BaseList<?,?>)value).getItems());
        else if (value instanceof SetValue)
            return this.merge(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " +this.type.getId() + " + " + value.getClass().getSimpleName());
    }


	@Override
	public IterableWithLength<IValue> getIterable(Context context) {
		return new IterableWithLength<IValue>() {
			@Override
			public IteratorWithLength<IValue> iterator() {
				return new IteratorWithLength<IValue>() {
					Iterator<IValue> iter = items.iterator();
					@Override public long getLength() { return items.size(); }
					@Override public boolean hasNext() { return iter.hasNext(); }
					@Override public IValue next() { return iter.next(); }
				};
			}
		};
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(items.size());
		else
			throw new InvalidDataError("No such member:" + name);
	}

}
