package prompto.csharp;



public class CSharpItemExpression extends CSharpSelectorExpression {

	CSharpExpression item;
	
	public CSharpItemExpression(CSharpExpression item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return parent.toString() + "[" + item.toString() + "]";
	}

}
