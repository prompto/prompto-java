package prompto.property;

import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.IType;

public class TypeValidator implements IPropertyValidator {

	IType type;
	
	public TypeValidator(IType type) {
		this.type = type;
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}

	@Override
	public void validate(Context context, JsxProperty property) {
		IType actual = property.check(context);
		if(!type.isAssignableFrom(context, actual))
		context.getProblemListener().reportIllegalAssignment(property, type, actual);
	}
	
	@Override
	public String getKeyName() {
		return "type";
	}
	
	@Override
	public String toLiteral() {
		return type.getTypeName();
	}

}
