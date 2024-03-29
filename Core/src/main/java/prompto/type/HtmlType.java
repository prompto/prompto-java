package prompto.type;

import java.lang.reflect.Type;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class HtmlType extends NativeType {

	static HtmlType instance = new HtmlType();
	
	public static HtmlType instance() {
		return instance;
	}
	
	private HtmlType() {
		super(Family.HTML);
	}

	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		if(other==JsxType.instance())
			return true;
		else
			return super.isAssignableFrom(context, other);
	}
	
	@Override
	public Type toJavaType(Context context) {
		// just need an opaque instance 
		return Object.class;
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to to
	}

}
