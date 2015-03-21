package presto.java;


public abstract class JavaSelectorExpression implements JavaExpression {

	JavaExpression parent;
	
	public void setParent(JavaExpression parent) {
		this.parent = parent;
	}
	
}
