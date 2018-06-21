package prompto.jsx;

import java.util.List;

import prompto.grammar.Identifier;
import prompto.utils.CodeWriter;

public class JsxElement extends JsxElementBase {

	List<IJsxExpression> children;
	
	public JsxElement(Identifier name, List<JsxAttribute> attributes) {
		super(name, attributes);
	}

	public void setChildren(List<IJsxExpression> children) {
		this.children = children;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("<").append(name);
		attributes.forEach(attr->attr.toDialect(writer));
		writer.append(">");
		if(children!=null)
			children.forEach(child->child.toDialect(writer));
		writer.append("</").append(name).append(">");
	}

}
