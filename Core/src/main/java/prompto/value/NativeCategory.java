package prompto.value;

import prompto.declaration.NativeCategoryDeclaration;
import prompto.runtime.Context;

public class NativeCategory extends NativeInstance<Object> {

	public NativeCategory(Context context, NativeCategoryDeclaration declaration) {
		super(context, declaration);
	}

	public NativeCategory(NativeCategoryDeclaration declaration, Object instance) {
		super(declaration, instance);
	}

}
