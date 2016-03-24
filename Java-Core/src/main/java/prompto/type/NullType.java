package prompto.type;

import java.lang.reflect.Type;

import prompto.error.SyntaxError;
import prompto.runtime.Context;

public class NullType extends BaseType {

	static NullType instance = new NullType();
	
	public static NullType instance() {
		return instance;
	}
	
	private NullType() {
		super(Family.NULL);
	}

	@Override
	public Type getJavaType() {
		return null;
	}

	@Override
	public void checkUnique(Context context) throws SyntaxError {
		// ok
	}

	@Override
	public void checkExists(Context context) throws SyntaxError {
		// ok
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return true;
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return false;
	}
		

}
