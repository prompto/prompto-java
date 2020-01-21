package prompto.type;

import java.lang.reflect.Type;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class NullType extends BaseType {

	static NullType instance = new NullType();
	
	public static NullType instance() {
		return instance;
	}
	
	private NullType() {
		super(Family.NULL);
	}

	@Override
	public Type getJavaType(Context context) {
		return null;
	}

	@Override
	public void checkUnique(Context context) {
		// ok
	}

	@Override
	public void checkExists(Context context) {
		// ok
	}

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return true;
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return false;
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}

}
