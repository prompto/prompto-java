package presto.csharp;


public abstract class CSharpSelectorExpression implements CSharpExpression {

	CSharpExpression parent;
	
	public void setParent(CSharpExpression parent) {
		this.parent = parent;
	}
	
}
