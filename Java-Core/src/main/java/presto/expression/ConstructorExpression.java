package presto.expression;

import presto.declaration.CategoryDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IInstance;
import presto.value.IValue;

public class ConstructorExpression implements IExpression {
	
	CategoryType type;
	IExpression copyFrom;
	ArgumentAssignmentList assignments;
	
	public ConstructorExpression(CategoryType type, ArgumentAssignmentList assignments) {
		this.type = type;
		setAssignments(assignments);
	}
	
	public CategoryType getType() {
		return type;
	}
	
	public void setAssignments(ArgumentAssignmentList assignments) {
		this.assignments = assignments;
		// in O and P, first anonymous argument is copyFrom
		if(assignments!=null && assignments.size()>0 && assignments.get(0).getArgument()==null) {
			copyFrom = assignments.get(0).getExpression();
			this.assignments.remove(0);
		}
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	public void setCopyFrom(IExpression copyFrom) {
		this.copyFrom = copyFrom;
	}

	public IExpression getCopyFrom() {
		return copyFrom;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toPDialect(writer);
			break;
		}
	}
	
	private void toPDialect(CodeWriter writer) {
		toODialect(writer);
	}

	private void toODialect(CodeWriter writer) {
		writer.append(type.getName());
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		if (copyFrom != null)
			assignments.add(new ArgumentAssignment(null, copyFrom));
		if(this.assignments!=null)
			assignments.addAll(this.assignments);
		assignments.toDialect(writer);
	}

	private void toEDialect(CodeWriter writer) {
		writer.append(type.getName());
		if (copyFrom != null) {
			writer.append(" from ");
			writer.append(copyFrom.toString());
			if (assignments != null && assignments.size()>0)
				writer.append(",");
		}
		if (assignments != null)
			assignments.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getName());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getName());
		type = cd.getType(context);
		cd.checkConstructorContext(context);
		if(copyFrom!=null) {
			IType cft = copyFrom.check(context);
			if(!(cft instanceof CategoryType))
				throw new SyntaxError("Cannot copy from " + cft.getName());
		}
		if(assignments!=null) {
			for(ArgumentAssignment assignment : assignments) {
				if(!cd.hasAttribute(context, assignment.getName()))
					throw new SyntaxError("\"" + assignment.getName() + 
						"\" is not an attribute of " + type.getName());	
				assignment.check(context);
			}
		}
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IInstance instance = type.newInstance(context);
		if(copyFrom!=null) {
			Object copyObj = copyFrom.interpret(context);
			if(copyObj instanceof IInstance) {
				IInstance copyFrom = (IInstance)copyObj;
				CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getName());
				for(Identifier name : copyFrom.getMemberNames()) {
					if(cd.hasAttribute(context, name)) 
						instance.setMember(context, name, copyFrom.getMember(context,name));
				}
			}
		}
		if(assignments!=null) {
			for(ArgumentAssignment assignment : assignments) {
				IValue value = assignment.getExpression().interpret(context);
				instance.setMember(context, assignment.getName(), value);
			}
		}
		return instance;
	}

}
