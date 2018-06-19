package prompto.jsx;

import prompto.utils.CodeWriter;

public interface IJsxValue {

	default void toDialect(CodeWriter writer) {
		throw new UnsupportedOperationException("toDialect " + this.getClass().getName());
	}

}
