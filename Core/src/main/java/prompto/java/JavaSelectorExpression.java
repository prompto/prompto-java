package prompto.java;

import prompto.parser.CodeSection;

public abstract class JavaSelectorExpression extends CodeSection implements JavaExpression {

	JavaExpression parent;
	
	public void setParent(JavaExpression parent) {
		this.parent = parent;
	}
	
}
