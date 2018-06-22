package prompto.jsx;

import java.util.List;

import prompto.grammar.Identifier;
import prompto.utils.CodeWriter;

public class JsxSelfClosing extends JsxElementBase {

	public JsxSelfClosing(Identifier name, List<JsxAttribute> attributes) {
		super(name, attributes);
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("<").append(id);
		attributes.forEach(attr->attr.toDialect(writer));
		writer.append("/>");
	}

}
