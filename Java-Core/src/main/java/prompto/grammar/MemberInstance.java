package prompto.grammar;

import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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
	public void toDialect(CodeWriter writer, IExpression expression) {
		parent.toDialect(writer, null);
		writer.append(".");
		writer.append(name);
	}
	
	@Override
	public IType checkAssignValue(Context context, IExpression expression) throws SyntaxError {
		IType type = parent.checkAssignMember(context, name);
		IType actualType = expression.check(context);
		actualType.checkAssignableTo(context, type);
		return type;
	}
	
	@Override
	public IType checkAssignMember(Context context, Identifier memberName) throws SyntaxError {
		return parent.checkAssignMember(context, name);
	}
	
	@Override
	public IType checkAssignElement(Context context) throws SyntaxError {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
		IValue root = parent.interpret(context);
		if(!root.isMutable())
			throw new NotMutableError();
		IValue value = expression.interpret(context);
		root.setMember(context, name, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue root = parent.interpret(context);
		return root.getMember(context, name, true);
	}
	

}
