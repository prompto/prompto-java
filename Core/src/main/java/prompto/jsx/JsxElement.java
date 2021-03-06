package prompto.jsx;

import java.util.List;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class JsxElement extends JsxElementBase {

	String nameSuite;
	String openingSuite;
	List<IJsxExpression> children;
	JsxClosing closing;
	
	public JsxElement(Identifier name, String nameSuite, List<JsxProperty> attributes, String openingSuite) {
		super(name, attributes);
		this.nameSuite = nameSuite;
		this.openingSuite = openingSuite;
	}

	public void setChildren(List<IJsxExpression> children) {
		this.children = children;
	}
	
	public void setClosing(JsxClosing closing) {
		this.closing = closing;
	}
	
	@Override
	protected void checkChildren(Context context) {
		if (children != null)
			children.forEach(child->child.check(context));
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("<").append(id);
		if(nameSuite!=null)
			writer.appendRaw(nameSuite);
		else if(!properties.isEmpty())
			writer.append(" ");
		properties.forEach(attr->attr.toDialect(writer));
		writer.append(">");
		if(openingSuite!=null)
			writer.appendRaw(openingSuite);
		if(children!=null)
			children.forEach(child->child.toDialect(writer));
		closing.toDialect(writer);
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
