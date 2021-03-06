package prompto.property;

import java.util.Collections;
import java.util.Set;

import prompto.declaration.IMethodDeclaration;
import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;

public interface IPropertyValidator {

	IType getType(Context context);
	boolean validate(Context context, JsxProperty property);
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
	default Set<IMethodDeclaration> getMethodDeclarations(Context context) {
		return Collections.emptySet();
	}
	default Set<MethodType> getMethodTypes(Context context) {
		return Collections.emptySet();
	}
	

}
