package prompto.jsx;

import java.util.List;

import prompto.grammar.Identifier;
import prompto.transpiler.Transpiler;
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
		writer.append("<").append(id);
		attributes.forEach(attr->attr.toDialect(writer));
		writer.append(">");
		if(children!=null)
			children.forEach(child->child.toDialect(writer));
		writer.append("</").append(id).append(">");
	}
	
	@Override
	public void declareChildren(Transpiler transpiler) {
	    if (this.children != null)
	        this.children.forEach(child -> child.declare(transpiler));
	}
	
	
	@Override
	public void transpileChildren(Transpiler transpiler) {
	    if (this.children != null)
	        this.children.forEach(child -> {
	            transpiler.append(", ");
	            child.transpile(transpiler);
	        });
	}

}
