package prompto.css;

import prompto.utils.CodeWriter;

public class CssText implements ICssValue {

	String text;
	
	public CssText(String text) {
		this.text = text;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}

}
