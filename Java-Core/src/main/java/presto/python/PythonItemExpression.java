package presto.python;

import presto.utils.CodeWriter;

public class PythonItemExpression extends PythonSelectorExpression {

	PythonExpression item;
	
	public PythonItemExpression(PythonExpression item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return parent.toString() + "[" + item.toString() + "]";
	}

	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append('[');
		item.toDialect(writer);
		writer.append(']');
	}

}
