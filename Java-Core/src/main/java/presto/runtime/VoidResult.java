package presto.runtime;

import presto.type.VoidType;
import presto.value.BaseValue;

public class VoidResult extends BaseValue {
	
	protected VoidResult() {
		super(VoidType.instance());
	}

	private static VoidResult instance = new VoidResult();
	
	public static VoidResult instance() {
		return instance;
	}



}
