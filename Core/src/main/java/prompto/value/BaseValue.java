package prompto.value;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Consumer;

import prompto.error.NotStorableError;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.IType;

import com.fasterxml.jackson.core.JsonGenerator;

public abstract class BaseValue implements IValue {
	
	IType type;
	
	protected BaseValue(IType type) {
		this.type = type;
	}
	
	@Override
	public boolean isMutable() {
		return false;
	}
	
	@Override
	public void setType(IType type) {
		this.type = type;
	}
	
	@Override
	public IType getType() {
		return type;
	}
	
	@Override
	public boolean roughly(Context context, IValue value) throws PromptoError {
		return this.equals(value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ISliceable<IValue> asSliceable(Context context) throws PromptoError {
		return (this instanceof ISliceable) ? (ISliceable<IValue>)this : null;
	}
	
	@Override
	public Object convertTo(Context context, Type type) {
		return this;
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		throw new UnsupportedOperationException("toJson not supported by " + this.getClass().getSimpleName());
	}
	
	@Override
	public void collectStorables(Consumer<IStorable> collector) throws NotStorableError {
		// nothing to do
	}

}
