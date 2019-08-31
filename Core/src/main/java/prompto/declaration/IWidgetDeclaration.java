package prompto.declaration;

import prompto.grammar.PropertyMap;

public interface IWidgetDeclaration extends IDeclaration {

	void setProperties(PropertyMap properties);
	PropertyMap getProperties();

}
