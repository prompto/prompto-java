package prompto.property;

import java.util.Set;
import java.util.stream.Collectors;

import prompto.jsx.IJsxValue;
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
	public boolean validate(Context context, JsxProperty property) {
		IJsxValue value = property.getValue();
		if(value!=null && value.isLiteral()) {
			String text = value.toString();
			if(text.startsWith("\"") && text.endsWith("\""))
				text = text.substring(1, text.length() - 1);
			if(values.contains(text))
				return true;
			else {
				String message = "Illegal value " + value.toString() + ", expected one of " + toLiteral(); 
				context.getProblemListener().reportIllegalValue(property, message);
				return false;
			}
		} else
			return true; // can only check literals
	}
	
	@Override
	public String getKeyName() {
		return "values";
	}
	
	@Override
	public String toLiteral() {
		return "<" + values.stream().map(s->s==null? "null" : '"' + s + '"').collect(Collectors.joining(", ")) + ">";
	}


}
