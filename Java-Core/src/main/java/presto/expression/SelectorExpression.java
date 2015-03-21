package presto.expression;

import presto.error.SyntaxError;
import presto.grammar.UnresolvedIdentifier;
import presto.runtime.Context;
import presto.type.IType;


public abstract class SelectorExpression implements IExpression {

	IExpression parent;
	
	public SelectorExpression() {
	}
	
	public SelectorExpression(IExpression parent) {
		this.parent = parent;
	}
	
	public IExpression getParent() {
		return parent;
	}
	
	public void setParent(IExpression parent) {
		this.parent = parent;
	}
	
	public IType checkParent(Context context) throws SyntaxError {
		if (parent instanceof UnresolvedIdentifier)
			return ((UnresolvedIdentifier)parent).checkMember(context);
		else
			return parent.check(context);
 	}


}
