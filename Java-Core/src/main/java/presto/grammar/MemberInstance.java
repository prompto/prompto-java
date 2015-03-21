package presto.grammar;

import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.Document;
import presto.value.IValue;

public class MemberInstance implements IAssignableSelector {
	
	IAssignableInstance parent;
	String name;
	
	public MemberInstance(String name) {
		this.name = name;
	}
	
	@Override
	public void setParent(IAssignableInstance parent) {
		this.parent = parent;
	}
	
	public String getName() {
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
	public void checkAssignMember(Context context, String memberName) throws SyntaxError {
		parent.checkAssignMember(context, name);
	}
	
	@Override
	public void checkAssignElement(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PrestoError {
		IValue value = expression.interpret(context);
		IValue doc = parent.interpret(context);
		if(doc instanceof Document)
			((Document)doc).SetMember(name, value);
		else
			throw new InvalidDataError("Expecting a document, got:" + doc.getClass().getSimpleName());
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue doc = parent.interpret(context);
		if(doc instanceof Document) 
			return ((Document)doc).getMember(context, name);
		else
			throw new InvalidDataError("Expecting a document, got:" + doc.getClass().getSimpleName());
	}
	

}
