package prompto.grammar;

import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.IType;
import prompto.utils.IValueIterable;
import prompto.utils.ObjectList;
import prompto.value.IContainer;
import prompto.value.IInstance;
import prompto.value.ISliceable;
import prompto.value.IValue;

import com.fasterxml.jackson.core.JsonGenerator;

@SuppressWarnings("serial")
public abstract class SymbolList <T extends Symbol> extends ObjectList<T> implements IValue, IContainer<IValue> {
	
	IType type;
	
	public SymbolList(T symbol) {
		this.add(symbol);
	}

	@Override
	public void storeValue(Context context, String name, IStorable storable) {
		throw new UnsupportedOperationException("Cannot store " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean isMutable() {
		return false;
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
	public boolean hasItem(Context context, IValue iValue) throws PromptoError {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public IValue getItem(Context context, IValue item) throws PromptoError {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Iterable<IValue> getIterable(Context context) {
		return new IValueIterable(context, (Iterable<Object>)(Object)this);
	}
	
	
	public IValue Add(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Add not supported by " + this.getClass().getSimpleName());
	}

	public IValue Subtract(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Subtract not supported by " + this.getClass().getSimpleName());
	}

	public IValue Multiply(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Multiply not supported by " + this.getClass().getSimpleName());
	}

	public IValue Divide(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Divide not supported by " + this.getClass().getSimpleName());
	}

	public IValue IntDivide(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Integer divide not supported by " + this.getClass().getSimpleName());
	}

	public IValue Modulo(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Integer divide not supported by " + this.getClass().getSimpleName());
	}

	public int CompareTo(Context context, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("Compare not supported by " + this.getClass().getSimpleName());
	}

	@Override
	public void setMember(Context context, Identifier name, IValue value) throws PromptoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier name, boolean autoCreate) throws PromptoError {
		throw new UnsupportedOperationException("No member support for " + this.getClass().getSimpleName());
	}

	public Object ConvertTo(Class<?> type) {
		return this;
	}
	
	@Override
	public boolean Roughly(Context context, IValue value) throws PromptoError {
		return this.equals(value);
	}
	
	@Override
	public ISliceable<IValue> asSliceable(Context context) throws PromptoError {
		return null;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		throw new UnsupportedOperationException("toJson not supported by " + this.getClass().getSimpleName());
	}

}
