package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.AnyType;
import presto.type.IType;
import presto.type.TupleType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;
import presto.value.IValue;
import presto.value.Integer;
import presto.value.TupleValue;

public class AssignTupleStatement extends SimpleStatement {
	
	IdentifierList names;
	IExpression expression;
	
	public AssignTupleStatement(IdentifierList names, IExpression expression) {
		this.names = names;
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		names.toDialect(writer, false);
		writer.append(" = ");
		expression.toDialect(writer);
	}
	
	public void add(Identifier i1) {
		this.names.add(i1);
	}

	public IdentifierList getNames() {
		return names;
	}
	
	public void setExpression(IExpression expression) {
		this.expression = expression;
	}
	
	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof AssignTupleStatement))
			return false;
		AssignTupleStatement other = (AssignTupleStatement)obj;
		return this.getNames().equals(other.getNames())
				&& this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = expression.check(context);
		if(type!=TupleType.instance())
			throw new SyntaxError("Expecting a tuple expression, got " + type.getName());
		for(Identifier name : names) {
			INamed actual = context.getRegistered(name);
			if(actual==null)
				context.registerValue(new Variable(name, AnyType.instance()));
			else {
				// need to check type compatibility
				IType actualType = actual.getType(context);
				AnyType.instance().checkAssignableTo(context,actualType);
			}
		}
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		Object object = expression.interpret(context);
		if(!(object instanceof TupleValue))
			throw new SyntaxError("Expecting a tuple expression, got " + object.getClass().getSimpleName());
		TupleValue tuple = (TupleValue)object;
		for(int i=0;i<names.size();i++) {
			Identifier name = names.get(i);
			IValue value = tuple.getItem(context, new Integer(i+1));
			if(context.getRegisteredValue(INamed.class, name)==null)
				context.registerValue(new Variable(name, value.getType()));
			context.setValue(name, value);
		}
		return null;
	}


}
