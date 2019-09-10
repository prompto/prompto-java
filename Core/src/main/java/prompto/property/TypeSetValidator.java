package prompto.property;

import java.util.Set;
import java.util.stream.Collectors;

import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;

public class TypeSetValidator implements IPropertyValidator {

	Set<IType> types;
	
	public TypeSetValidator(Set<IType> types) {
		this.types = types;
	}
	
	@Override
	public IType getType(Context context) {
		return AnyType.instance();
	}

	@Override
	public void validate(Context context, JsxProperty property) {
		IType actual = property.check(context);
		if(!types.stream()
				.anyMatch(t->t.isAssignableFrom(context, actual)))
			context.getProblemListener().reportIllegalAssignment(property, types, actual);
	}
	
	@Override
	public String getKeyName() {
		return "types";
	}
	
	@Override
	public String toLiteral() {
		return "<" + types.stream().map(String::valueOf).collect(Collectors.joining(", ")) + ">";
	}

}
