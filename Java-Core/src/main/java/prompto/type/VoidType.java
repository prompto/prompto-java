package prompto.type;

import prompto.runtime.Context;


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
	public String getJavaDescriptor(Context context) {
		return "V";
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		throw new RuntimeException("Should never get there !");
	}
	
}
