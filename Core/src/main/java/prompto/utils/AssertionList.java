package prompto.utils;

import prompto.expression.IAssertion;
import prompto.transpiler.Transpiler;

@SuppressWarnings("serial")
public class AssertionList extends ObjectList<IAssertion> {

	public AssertionList() {
	}
	
	public AssertionList(IAssertion item) {
		this.add(item);
	}

	public void toDialect(CodeWriter writer) {
		for(IAssertion exp : this) {
			exp.toDialect(writer);
			switch(writer.getDialect()) {
			case O:
				writer.append(";\n");
				break;
			default:
				writer.append("\n");
			}
		}
	}

	public void declare(Transpiler transpiler) {
		this.forEach(item->item.declare(transpiler));
		
	}

}
