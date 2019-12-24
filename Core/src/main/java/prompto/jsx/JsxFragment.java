package prompto.jsx;

import java.util.List;

import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.JsxType;
import prompto.utils.CodeWriter;

public class JsxFragment extends Section implements IJsxExpression {

	String openingSuite;
	List<IJsxExpression> children;
	
	public JsxFragment(String openingSuite) {
		this.openingSuite = openingSuite;
	}

	public void setChildren(List<IJsxExpression> children) {
		this.children = children;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("<>");
		if(openingSuite!=null)
			writer.appendRaw(openingSuite);
		if(children!=null)
			children.forEach(child->child.toDialect(writer));
		writer.append("</>");
	}
	
	@Override
	public IType check(Context context) {
		if (children != null)
			children.forEach(child->child.check(context));
		return JsxType.instance();
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    if (children != null)
	        children.forEach(child -> child.declare(transpiler));
	}
	
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    if (children != null && !children.isEmpty()) {
	    	transpiler.append("React.createElement(React.Fragment, null");
	        children.forEach(child -> {
	            transpiler.append(", ");
	            child.transpile(transpiler);
	        });
	        transpiler.append(")");
	    }
	    return false;
	}

}
