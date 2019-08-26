package prompto.declaration;

import prompto.grammar.Structure;

public interface IWidgetDeclaration extends IDeclaration {

	void setPropertyTypes(Structure types);
	Structure getPropertyTypes();

}
