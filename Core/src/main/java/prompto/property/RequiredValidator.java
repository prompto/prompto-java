package prompto.property;

import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.IType;

public class RequiredValidator implements IPropertyValidator {

	IPropertyValidator validator;
	
	public RequiredValidator(IPropertyValidator validator) {
		this.validator = validator;
	}
	
	@Override
	public boolean isRequired() {
		return true;
	}
	
	@Override
	public IPropertyValidator optional() {
		return validator;
	}
	
	@Override
	public IPropertyValidator required() {
		return this;
	}
	
	@Override
	public IType getType(Context context) {
		return validator.getType(context);
	}
	
	@Override
	public void validate(Context context, JsxProperty property) {
		validator.validate(context, property);
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
