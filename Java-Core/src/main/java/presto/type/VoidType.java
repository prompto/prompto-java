package presto.type;

import presto.runtime.Context;


public class VoidType extends NativeType {

	static VoidType instance = new VoidType();
	
	public static VoidType instance() {
		return instance;
	}
	
	private VoidType() {
		super("Void");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return void.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		throw new RuntimeException("Should never get there !");
	}
	
}
