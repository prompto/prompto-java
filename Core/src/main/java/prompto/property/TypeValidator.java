package prompto.property;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import prompto.declaration.IMethodDeclaration;
import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.IType;
import prompto.type.MethodType;

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
	public String toString() {
		return type.toString();
	}

	@Override
	public void validate(Context context, JsxProperty property) {
		IType actual = type instanceof MethodType ? property.checkProto(context, (MethodType)type) : property.check(context);
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
	
	
	@Override
	public Set<MethodType> getMethodTypes(Context context) {
		return type instanceof MethodType ? Collections.singleton((MethodType)type) : IPropertyValidator.super.getMethodTypes(context);
	}
	
	@Override
	public Set<IMethodDeclaration> getMethodDeclarations(Context context) {
		if(type instanceof MethodType) {
			MethodDeclarationMap decls = context.getRegisteredDeclaration(MethodDeclarationMap.class, type.getTypeNameId());
			if(decls!=null)
				return decls.values().stream().map(IMethodDeclaration::asReference).collect(Collectors.toSet());
		} 
		return IPropertyValidator.super.getMethodDeclarations(context);
	}

}
