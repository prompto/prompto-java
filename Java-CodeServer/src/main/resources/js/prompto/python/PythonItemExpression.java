package prompto.python;



public class PythonItemExpression extends PythonSelectorExpression {

	PythonExpression item;
	
	public PythonItemExpression(PythonExpression item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return parent.toString() + "[" + item.toString() + "]";
	}

}
