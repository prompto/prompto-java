package prompto.utils;

import prompto.declaration.AttributeDeclaration;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.IStore;

public abstract class StoreUtils {

	public static AttributeInfo getAttributeInfo(Context context, String name, IStore store) {
		AttributeInfo info = store==null ? null : store.getAttributeInfo(name);
		if(info==null) {
			AttributeDeclaration decl = context.findAttribute(name);
			info = decl==null ? null : decl.getAttributeInfo(context);
		}
		return info;
	}

	

}
