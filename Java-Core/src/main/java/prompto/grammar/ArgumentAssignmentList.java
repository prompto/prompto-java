package prompto.grammar;

import java.util.LinkedList;

import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;


public class ArgumentAssignmentList extends LinkedList<ArgumentAssignment> {

	private static final long serialVersionUID = 1L;

	public ArgumentAssignmentList() {
		
	}
	
	public ArgumentAssignmentList(ArgumentAssignment assignment) {
		this.add(assignment);
	}
	
	public ArgumentAssignmentList(ArgumentAssignmentList assignments) {
		super(assignments);
	}

	public ArgumentAssignmentList(ArgumentAssignmentList assignments, ArgumentAssignment assignment) {
		super(assignments);
		this.add(assignment);
	}

	public ArgumentAssignment find(Identifier name) {
		for(ArgumentAssignment assignment : this) {
			if(name.equals(assignment.getName()))
				return assignment;
		}
		return null;
	}

	public ArgumentAssignmentList makeAssignments(Context context, IMethodDeclaration declaration) throws SyntaxError {
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		for(ArgumentAssignment assignment : this)
			assignments.add(assignment.makeAssignment(context, declaration));
		return assignments;
	}
	
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
	
	private void toEDialect(CodeWriter writer) {
		int idx = 0;
		// anonymous argument before 'with'
		if(this.size()>0 && this.get(0).getArgument()==null) {
			writer.append(' ');
			this.get(idx++).toDialect(writer);
		}
		if(idx<this.size()) {
			writer.append(" with ");
			this.get(idx++).toDialect(writer);
			writer.append(", ");
			while(idx<this.size()-1) {
				this.get(idx++).toDialect(writer);
				writer.append(", ");
			}
			writer.trimLast(2);
			if(idx<this.size()) {
				writer.append(" and ");				
				this.get(idx++).toDialect(writer);
			}
		}
	}
	
	private void toODialect(CodeWriter writer) {
		writer.append("(");
		for(ArgumentAssignment as : this) {
			as.toDialect(writer);
			writer.append(", ");
		}
		if(this.size()>0)
			writer.trimLast(2);
		writer.append(")");
	}

	private void toPDialect(CodeWriter writer) {
		toODialect(writer);
	}


}
