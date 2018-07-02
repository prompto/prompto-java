package prompto.css;

import prompto.utils.CodeWriter;

public interface ICssValue {

	void toDialect(CodeWriter writer);

}
