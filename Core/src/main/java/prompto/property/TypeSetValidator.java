package prompto.property;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import prompto.declaration.IMethodDeclaration;
import prompto.jsx.JsxProperty;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.type.MethodType;

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
	
	
	@Override
	public Set<MethodType> getMethodTypes(Context context) {
		return types.stream()
				.filter(type->type instanceof MethodType)
				.map(type->(MethodType)type)
				.collect(Collectors.toSet());
	}
	
	@Override
	public Set<IMethodDeclaration> getMethodDeclarations(Context context) {
		return types.stream()
				.filter(type->type instanceof MethodType)
				.map(type->getMethods(context, type))
				.flatMap(Collection::stream)
				.collect(Collectors.toSet());
	}

	private Collection<IMethodDeclaration> getMethods(Context context, IType type) {
		MethodDeclarationMap maps = context.getRegisteredDeclaration(MethodDeclarationMap.class, type.getTypeNameId());
		return maps.values();
	}


}
