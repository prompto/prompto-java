package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.grammar.MethodDeclarationList;
import presto.grammar.NativeAttributeBindingListMap;
import presto.grammar.NativeCategoryBindingList;
import presto.runtime.Context;
import presto.runtime.Context.ResourceContext;
import presto.type.ResourceType;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;
import presto.value.IInstance;
import presto.value.NativeResource;

public class NativeResourceDeclaration extends NativeCategoryDeclaration {
	
	public NativeResourceDeclaration(Identifier name, IdentifierList attributes, 
			NativeCategoryBindingList categoryMappings, 
			NativeAttributeBindingListMap attributeMappings,
			MethodDeclarationList methods) {
		super(name,attributes, categoryMappings, attributeMappings, methods);
	}
	
	@Override
	public ResourceType getType(Context context) {
		return new ResourceType(getIdentifier());
	}
	
	@Override
	public IInstance newInstance() throws PrestoError {
		return new NativeResource(this);
	}
	
	@Override
	public void checkConstructorContext(Context context) throws SyntaxError {
		if(!(context instanceof ResourceContext))
			throw new SyntaxError("Not a resource context!");
	}
	
	@Override
	protected void categoryTypeToEDialect(CodeWriter writer) {
		writer.append("native resource");
	}
	
	@Override
	protected void categoryTypeToODialect(CodeWriter writer) {
		writer.append("native resource");
	}

	@Override
	protected void categoryTypeToPDialect(CodeWriter writer) {
		writer.append("native resource");
	}
}
