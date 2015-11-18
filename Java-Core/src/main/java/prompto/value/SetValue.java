package prompto.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.SetType;

public class SetValue extends BaseValue implements IContainer<IValue>, IListable<SetValue> {

	Set<IValue> items = null;
	
	public SetValue(IType itemType) {
		super(new SetType(itemType));
		this.items = newSet();
	}
	
	public SetValue(IType itemType, Set<IValue> items) {
		super(new SetType(itemType));
		this.items = items;
	}

	protected Set<IValue> newSet() {
		return new HashSet<IValue>();
	}

	@Override
	public boolean isEmpty() {
		return items.isEmpty();
	}

	@Override
	public long length() {
		return items.size();
	}

	public Collection<IValue> getItems() {
		return items;
	}
	
	@Override
	public boolean hasItem(Context context, IValue value) throws PromptoError {
		return items.contains(value);
	}

	@Override
	public IValue getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof Integer) {
			int idx = (int)((Integer)index).IntegerValue() - 1;
			return getNthItem(idx);
		} else
			throw new SyntaxError("No such item:" + index.toString());
	}

	private IValue getNthItem(int idx) throws PromptoError {
		Iterator<IValue> it = items.iterator();
		while(it.hasNext()) {
			IValue item = it.next();
			if(idx--==0)
				return item;
		}
		throw new IndexOutOfRangeError();
	}

	@Override
	public Iterable<IValue> getIterable(Context context) {
		return items;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof SetValue))
			return false;
		return items.equals(((SetValue)obj).items);
	}

	@Override
	public SetValue newInstance(List<IValue> values) {
		IType itemType = ((SetType)type).getItemType();
		SetValue result = new SetValue(itemType);
		result.items.addAll(values);
		return result;
	}
	
	@Override
	public String toString() {
		String result = items.toString();
		return "<" + result.substring(1,result.length()-1) + ">";
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

	public SetValue merge(Collection<IValue> items) {
		List<IValue> result = new ArrayList<IValue>();
		result.addAll(this.items);
		result.addAll(items);
		return newInstance(result);
	}

}
