package presto.grammar;

import presto.declaration.EnumeratedCategoryDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.EnumeratedCategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IInstance;
import presto.value.IValue;
import presto.value.Text;

public class CategorySymbol extends Symbol implements IExpression  {
	
	ArgumentAssignmentList assignments;
	
	public CategorySymbol(Identifier name,ArgumentAssignmentList assignments) {
		super(name);
		this.assignments = assignments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(symbol);
		writer.append(" ");
		assignments.toDialect(writer);
	}
	
	public void setAssignments(ArgumentAssignmentList assignments) {
		this.assignments = assignments;
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(assignments!=null)
			sb.append(assignments.toString());
		if(sb.length()==0)
			sb.append(type.getName());
		return sb.toString();
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		EnumeratedCategoryDeclaration cd = context.getRegisteredDeclaration(
				EnumeratedCategoryDeclaration.class, type.getName());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getName());
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
		EnumeratedCategoryType type = (EnumeratedCategoryType)this.getType(context);
		IInstance instance = type.newInstance(context);
		if(assignments!=null) {
			for(ArgumentAssignment assignment : assignments) {
				IValue value = assignment.getExpression().interpret(context);
				instance.setMember(context, assignment.getName(), value);
			}
		}
		instance.setMember(context, new Identifier("name"), new Text(this.getName().toString()));
		return instance;
	}


}
