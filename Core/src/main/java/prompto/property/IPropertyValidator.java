package prompto.property;

import java.util.Collections;
import java.util.Set;

import prompto.declaration.IMethodDeclaration;
import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.IType;

public interface IPropertyValidator {

	IType getType(Context context);
	void validate(Context context, JsxProperty property);
	String getKeyName();
	String toLiteral();
	default boolean isRequired() {
		return false;
	}
	default IPropertyValidator required() {
		return new RequiredValidator(this);
	}
	default IPropertyValidator optional() {
		return this;
	}
	default boolean isRequiredForAccessibility() {
		return false;
	}
	default IPropertyValidator requiredForAccessibility() {
		return new RequiredForAccessibilityValidator(this);
	}
	default IPropertyValidator optionalForAccessibility() {
		return this;
	}
	default Set<IMethodDeclaration> getMethods(Context context) {
		return Collections.emptySet();
	}
	

}
