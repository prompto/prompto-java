package prompto.jsx;

import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;

public class JsxText implements IJsxExpression {

	String text;
	
	
	public JsxText(String text) {
		this.text = text;
	}

	@Override
	public IType check(Context context) {
		return TextType.instance();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}

}
