package prompto.property;

import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.IType;

public class RequiredForAccessibilityValidator implements IPropertyValidator {

	IPropertyValidator validator;
	
	public RequiredForAccessibilityValidator(IPropertyValidator validator) {
		this.validator = validator;
	}
	
	@Override
	public boolean isRequiredForAccessibility() {
		return true;
	}
	
	@Override
	public IPropertyValidator optionalForAccessibility() {
		return validator;
	}
	
	@Override
	public IPropertyValidator requiredForAccessibility() {
		return this;
	}
	
	@Override
	public IType getType(Context context) {
		return validator.getType(context);
	}
	
	@Override
	public boolean validate(Context context, JsxProperty property) {
		return validator.validate(context, property);
	}
	
	@Override
	public String getKeyName() {
		return validator.getKeyName();
	}
	
	@Override
	public String toLiteral() {
		return validator.toLiteral(); // TODO required bit
	}

}
