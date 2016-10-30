package prompto.memstore;

import prompto.store.AttributeInfo;

public interface IOrderBy {

	AttributeInfo getAttributeInfo();
	boolean isDescending();

}
