package prompto.css;

import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public interface ICssValue {

	void toDialect(CodeWriter writer);
	void toString(StringBuilder sb);
	void declare(Transpiler transpiler);
	void transpile(Transpiler transpiler);

}
