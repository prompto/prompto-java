package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.type.IType;


public abstract class SelectorBase extends CodeSection implements IExpression {

	IExpression parent;
	
	public SelectorBase() {
	}
	
	public SelectorBase(IExpression parent) {
		this.parent = parent;
	}
	
	public IExpression getParent() {
		return parent;
	}
	
	public void setParent(IExpression parent) {
		this.parent = parent;
	}
	
	public IType checkParent(Context context) {
		if (parent instanceof UnresolvedIdentifier)
			return ((UnresolvedIdentifier)parent).checkMember(context);
		else
			return parent.check(context);
 	}

	public IExpression resolveParent(Context context) {
        if(parent instanceof UnresolvedIdentifier) {
        	((UnresolvedIdentifier) parent).checkMember(context);
        	return ((UnresolvedIdentifier) parent).getResolved();
        } else
        	return parent;
	}

	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		return compile(context, method, flags, true);
	}

	@Override
	public final ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return compile(context, method, flags, false);
	}

	public abstract ResultInfo compile(Context context, MethodInfo method, Flags flags, boolean asParent);
	

}
