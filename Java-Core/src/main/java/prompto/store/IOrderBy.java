package prompto.store;

import prompto.declaration.AttributeInfo;

public interface IOrderBy {

	AttributeInfo getAttributeInfo();
	boolean isDescending();

}
