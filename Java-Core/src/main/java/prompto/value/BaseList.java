package prompto.value;

import java.util.Collection;
import java.util.List;

import prompto.error.IndexOutOfRangeError;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.ContainerType;
import prompto.type.IType;


public abstract class BaseList<T extends BaseList<T>> extends BaseValue implements IContainer<IValue>, ISliceable<IValue>, IListable<T> {

	protected List<IValue> items;

	protected BaseList(ContainerType type) {
		super(type);
		this.items = newItemsInstance();
	}
	
	protected BaseList(ContainerType type, List<IValue> items) {
		super(type);
		this.items = items;
	}

	public BaseList(ContainerType type, Collection<IValue> items) {
		super(type);
		this.items = newItemsInstance(items);
	}

	protected abstract List<IValue> newItemsInstance();
	protected abstract List<IValue> newItemsInstance(Collection<IValue> items);

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
	public long length() {
		return items.size();
	}

	@Override
	public boolean isEmpty() {
		return items.isEmpty();
	}

	public T slice(Integer fi, Integer li) throws IndexOutOfRangeError {
		long _fi = fi == null ? 1L : fi.longValue();
		if (_fi < 0)
			throw new IndexOutOfRangeError();
		long _li = li == null ? items.size() : li.longValue();
		if (_li < 0)
			_li = items.size() + 1 + _li;
		if (_li > items.size())
			throw new IndexOutOfRangeError();
		List<IValue> result = newItemsInstance();
		long idx = 0;
		for (IValue e : this.items) {
			if (++idx < _fi)
				continue;
			if (idx > _li)
				break;
			result.add(e);
		}
		return newInstance(result);
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
	public IValue Add(Context context, IValue value) throws PromptoError {
        if (value instanceof BaseList<?>)
            return this.merge(((BaseList<?>)value).getItems());
        else if (value instanceof SetValue)
            return this.merge(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " +this.type.getId() + " + " + value.getClass().getSimpleName());
    }


	@Override
	public Iterable<IValue> getIterable(Context context) {
		return items;
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
