package presto.value;

import presto.type.IType;

public class TypeValue extends BaseValue {

	IType value;
	
	public TypeValue(IType value) {
		super(null); // TODO
		this.value = value;
	}
	
	public IType getValue() {
		return value;
	}

}
