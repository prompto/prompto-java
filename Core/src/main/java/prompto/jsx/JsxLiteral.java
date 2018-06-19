package prompto.jsx;

import prompto.utils.CodeWriter;

public class JsxLiteral implements IJsxValue {

	String text;
	
	public JsxLiteral(String text) {
		this.text = text;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}

}
