package presto.grammar;

import presto.error.PrestoError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.IValueIterable;
import presto.utils.ObjectList;
import presto.value.ICollection;
import presto.value.ISliceable;
import presto.value.IValue;

@SuppressWarnings("serial")
public abstract class SymbolList <T extends Symbol> extends ObjectList<T> implements IValue, ICollection<IValue> {
	
	IType type;
	
	public SymbolList(T symbol) {
		this.add(symbol);
	}

	public void setType(IType type) {
		this.type = type;
	}
	
	@Override
	public IType getType() {
		return type;
	}
	
	@Override
	public long length() {
		return this.size();
	}
	
	@Override
	public boolean hasItem(Context context, IValue iValue) throws PrestoError {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public IValue getItem(Context context, IValue item) throws PrestoError {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Iterable<IValue> getItems(Context context) {
		return new IValueIterable(context, (Iterable<Object>)(Object)this);
	}
	
	
	public IValue Add(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Add not supported by " + this.getClass().getSimpleName());
	}

	public IValue Subtract(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Subtract not supported by " + this.getClass().getSimpleName());
	}

	public IValue Multiply(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Multiply not supported by " + this.getClass().getSimpleName());
	}

	public IValue Divide(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Divide not supported by " + this.getClass().getSimpleName());
	}

	public IValue IntDivide(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Integer divide not supported by " + this.getClass().getSimpleName());
	}

	public IValue Modulo(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Integer divide not supported by " + this.getClass().getSimpleName());
	}

	public int CompareTo(Context context, IValue value) throws PrestoError {
		throw new UnsupportedOperationException("Compare not supported by " + this.getClass().getSimpleName());
	}

	public IValue getMember(Context context, String name) throws PrestoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}

	public Object ConvertTo(Class<?> type) {
		return this;
	}
	
	@Override
	public boolean Roughly(Context context, IValue value) throws PrestoError {
		return this.equals(value);
	}
	
	@Override
	public ISliceable<IValue> asSliceable(Context context) throws PrestoError {
		return null;
	}
}
