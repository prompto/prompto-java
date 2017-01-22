package prompto.utils;

import prompto.expression.IExpression;

@SuppressWarnings("serial")
public class ExpressionList extends ObjectList<IExpression>{

	public ExpressionList() {
	}
	
	public ExpressionList(IExpression item) {
		this.add(item);
	}

	public void toDialect(CodeWriter writer) {
		if(this.size()>0) {
			for(IExpression exp : this) {
				exp.toDialect(writer);
				writer.append(", ");
			}
			writer.trimLast(2);
		}
	}

}
