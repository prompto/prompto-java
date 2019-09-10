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
	public void validate(Context context, JsxProperty property) {
		// TODO accept any property
	}
	
	@Override
	public String getKeyName() {
		return "type";
	}
	
	@Override
	public String toLiteral() {
		return AnyType.instance().getTypeName();
	}

}
