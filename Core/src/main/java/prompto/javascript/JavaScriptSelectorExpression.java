package prompto.javascript;

import prompto.transpiler.Transpiler;

public abstract class JavaScriptSelectorExpression implements JavaScriptExpression {

	JavaScriptExpression parent;
	
	public void setParent(JavaScriptExpression parent) {
		this.parent = parent;
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		if(parent!=null)
			parent.declare(transpiler);
	}
	

	
}
