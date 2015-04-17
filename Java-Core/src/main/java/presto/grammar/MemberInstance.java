package presto.grammar;

import presto.error.NotMutableError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class MemberInstance implements IAssignableSelector {
	
	IAssignableInstance parent;
	Identifier name;
	
	public MemberInstance(Identifier name) {
		this.name = name;
	}
	
	@Override
	public void setParent(IAssignableInstance parent) {
		this.parent = parent;
	}
	
	public Identifier getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append(".");
		writer.append(name);
	}
	
	@Override
	public void checkAssignValue(Context context, IExpression expression) throws SyntaxError {
		parent.checkAssignMember(context, name);
		expression.check(context);
	}
	
	@Override
	public void checkAssignMember(Context context, Identifier memberName) throws SyntaxError {
		parent.checkAssignMember(context, name);
	}
	
	@Override
	public void checkAssignElement(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PrestoError {
		IValue root = parent.interpret(context);
		if(!root.isMutable())
			throw new NotMutableError();
		IValue value = expression.interpret(context);
		root.setMember(context, name, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue root = parent.interpret(context);
		return root.getMember(context, name);
	}
	

}
