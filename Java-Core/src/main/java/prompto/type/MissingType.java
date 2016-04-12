package prompto.type;

import java.lang.reflect.Type;

import prompto.runtime.Context;

public class MissingType extends NativeType {

	static MissingType instance = new MissingType();
	static String typeName = "*";
	
	public static MissingType instance() {
		return instance;
	}
	
	private MissingType() {
		super(Family.MISSING);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return Object.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return true;
	}
	
}
