package prompto.type;

import java.lang.reflect.Type;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class CssType extends NativeType {

	static CssType instance = new CssType();
	
	public static CssType instance() {
		return instance;
	}
	
	private CssType() {
		super(Family.CSS);
	}

	@Override
	public Type getJavaType(Context context) {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	

	@Override
	public void transpile(Transpiler transpiler) {
		// nothing to do
	}



}
