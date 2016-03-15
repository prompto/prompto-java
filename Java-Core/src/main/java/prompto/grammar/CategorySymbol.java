package prompto.grammar;

import prompto.declaration.EnumeratedCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.Text;

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
			sb.append(type.getId());
		return sb.toString();
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		EnumeratedCategoryDeclaration cd = context.getRegisteredDeclaration(
				EnumeratedCategoryDeclaration.class, type.getId());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getId());
		if(assignments!=null) {
			context = context.newChildContext();
			for(ArgumentAssignment assignment : assignments) {
				if(!cd.hasAttribute(context, assignment.getName()))
					throw new SyntaxError("\"" + assignment.getName() + 
						"\" is not an attribute of " + type.getId());	
				assignment.check(context);
			}
		}
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		EnumeratedCategoryType type = (EnumeratedCategoryType)this.getType(context);
		IInstance instance = type.newInstance(context);
		instance.setMutable(true);
		if(assignments!=null) {
			context = context.newLocalContext();
			for(ArgumentAssignment assignment : assignments) {
				IValue value = assignment.getExpression().interpret(context);
				instance.setMember(context, assignment.getName(), value);
			}
		}
		instance.setMember(context, new Identifier("name"), new Text(this.getIdentifier().toString()));
		instance.setMutable(false);
		return instance;
	}


}
