package prompto.type;

import java.util.HashMap;

import prompto.declaration.CategoryDeclaration;
import prompto.grammar.Identifier;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;


public class TypeMap extends HashMap<Identifier, IType> {

	private static final long serialVersionUID = 1L;

	public void add(IType type) {
		put(type.getTypeNameId(), type);
	}
	
	public IType inferType(Context context, ICodeSection section) {
		IType inferred = null;
		// first pass: get less specific type
		for(IType current : values()) {
			if(inferred == null || inferred == NullType.instance())
				inferred = current;
			else if(inferred.equals(current))
				continue;
			else if(inferred.isAssignableFrom(context, current))
				inferred = current == DecimalType.instance() ? current : inferred;
			else if(current.isAssignableFrom(context, inferred))
				inferred = current;
			else {
				IType common = inferCommonBaseType(context, inferred, current);
				if(common!=null)
					inferred = common;
				else
					context.getProblemListener().reportIncompatibleTypes(section, current, inferred);
			}
		}
		if(inferred==null)
			return VoidType.instance();
		// second pass: check compatible
		for(IType current : values()) {
			if(current!=inferred && !inferred.isAssignableFrom(context, current))
				context.getProblemListener().reportIncompatibleTypes(section, inferred, current);
		}
		return inferred;
	}

	public IType inferCommonBaseType(Context context, IType type1, IType type2) {
		if(type1 instanceof CategoryType && type2 instanceof CategoryType)
			return inferCommonCategoryType(context, (CategoryType)type1, (CategoryType)type2, true);
		else if(type1 instanceof NativeType || type2 instanceof NativeType)
			return AnyType.instance();
		else
			return null;
	}
	
	
	public IType inferCommonCategoryType(Context context, CategoryType type1, CategoryType type2, boolean trySwap) {
		CategoryDeclaration decl1 = context.getRegisteredDeclaration(CategoryDeclaration.class, type1.getTypeNameId());
		if(decl1.getDerivedFrom()!=null) {
			for(Identifier id : decl1.getDerivedFrom()) {
				CategoryType parentType = new CategoryType(id);
				if(parentType.isAssignableFrom(context, type2))
					return parentType;
			}
			// climb up the tree
			for(Identifier id : decl1.getDerivedFrom()) {
				CategoryType parentType = new CategoryType(id);
				IType commonType = inferCommonBaseType(context, parentType, type2);
				if(commonType!=null)
					return commonType;
			}
		}
		if(trySwap)
			return inferCommonCategoryType(context, type2, type1, false);
		else
			return null;
	}

}
