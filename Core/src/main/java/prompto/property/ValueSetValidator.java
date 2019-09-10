package prompto.property;

import java.util.Set;

import prompto.jsx.IJsxValue;
import prompto.jsx.JsxLiteral;
import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;

public class ValueSetValidator implements IPropertyValidator {

	Set<String> values;
	
	public ValueSetValidator(Set<String> values) {
		this.values = values;
	}

	@Override
	public IType getType(Context context) {
		return AnyType.instance();
	}
	
	@Override
	public void validate(Context context, JsxProperty property) {
		IJsxValue value = property.getValue();
		if(value instanceof JsxLiteral && !values.contains(value.toString())) {
			String message = "Illegal value " + value.toString() + ", expected one of " + toLiteral(); 
			context.getProblemListener().reportIllegalValue(property, message);
		}
	}
	
	@Override
	public boolean isRequired() {
		return !values.contains(null);
	}
	
	
	@Override
	public String getKeyName() {
		return "values";
	}
	
	@Override
	public String toLiteral() {
		return "<" + String.join(", ", values) + ">";
	}


}
