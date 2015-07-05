package prompto.type;

import prompto.runtime.Context;

public class MissingType extends NativeType {

	static MissingType instance = new MissingType();
	
	public static MissingType instance() {
		return instance;
	}
	
	private MissingType() {
		super("*");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return Object.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return true;
	}
	
}
