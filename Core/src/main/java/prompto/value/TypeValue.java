package prompto.value;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TypeType;

public class TypeValue extends BaseValue {

	IType value;
	
	public TypeValue(IType value) {
		super(new TypeType(value));
		this.value = value;
	}
	
	public IType getValue() {
		return value;
	}

	@Override
	public Object getStorableData() {
		throw new UnsupportedOperationException(); // can't be stored
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		return value.getStaticMemberValue(context, id);
	}

}
