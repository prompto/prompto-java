package prompto.declaration;

import prompto.property.PropertyMap;

public interface IWidgetDeclaration extends IDeclaration {

	void setProperties(PropertyMap properties);
	PropertyMap getProperties();

}
