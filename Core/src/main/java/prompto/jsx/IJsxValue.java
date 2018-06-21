package prompto.jsx;

import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public interface IJsxValue {

	IType check(Context context);


	default void toDialect(CodeWriter writer) {
		throw new UnsupportedOperationException("toDialect " + this.getClass().getName());
	}

}
