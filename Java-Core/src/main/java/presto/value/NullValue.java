package presto.value;

import presto.type.NullType;


public class NullValue extends BaseValue {

	static NullValue instance = new NullValue();
	
	public static NullValue instance() {
		return instance;
	}
	
	private NullValue() {
		super(NullType.instance());
	}

}
