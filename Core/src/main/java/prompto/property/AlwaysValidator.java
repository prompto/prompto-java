package prompto.property;

import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;

public class AlwaysValidator implements IPropertyValidator {
	
	public static AlwaysValidator INSTANCE = new AlwaysValidator();
	
	private AlwaysValidator() {
	}
	
	@Override
	public IType getType(Context context) {
		return AnyType.instance();
	}
	
	@Override
	public boolean validate(Context context, JsxProperty property) {
		// accept any property
		return true;
	}
	
	@Override
	public String getKeyName() {
		return "type";
	}
	
	@Override
	public String toLiteral() {
		return AnyType.instance().getTypeName();
	}
	
	@Override
	public String toString() {
		return "any";
	}

}
