package prompto.type;

import java.lang.reflect.Type;

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
	public Type toJavaType() {
		return Object.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return true;
	}
	
}
