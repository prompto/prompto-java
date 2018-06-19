package prompto.jsx;

import prompto.grammar.Identifier;
import prompto.utils.CodeWriter;

public class JsxAttribute {

	Identifier name;
	IJsxValue value;
	
	
	public JsxAttribute(Identifier name, IJsxValue value) {
		this.name = name;
		this.value = value;
	}


	public void toDialect(CodeWriter writer) {
		writer.append(" ").append(name);
		if(value!=null) {
			writer.append("=");
			value.toDialect(writer);
		}
	}

}
