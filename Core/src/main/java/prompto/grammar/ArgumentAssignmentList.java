package prompto.grammar;

import java.util.Collection;
import java.util.LinkedList;

import prompto.declaration.IMethodDeclaration;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;


public class ArgumentAssignmentList extends LinkedList<ArgumentAssignment> {

	private static final long serialVersionUID = 1L;

	public ArgumentAssignmentList() {
		
	}
	
	public ArgumentAssignmentList(ArgumentAssignment assignment) {
		this.add(assignment);
	}
	
	public ArgumentAssignmentList(Collection<ArgumentAssignment> assignments) {
		super(assignments);
	}

	public ArgumentAssignmentList(Collection<ArgumentAssignment> assignments, ArgumentAssignment assignment) {
		super(assignments);
		this.add(assignment);
	}

	public ArgumentAssignment find(Identifier name) {
		for(ArgumentAssignment assignment : this) {
			if(name.equals(assignment.getArgumentId()))
				return assignment;
		}
		return null;
	}

	public ArgumentAssignmentList resolveAndCheck(Context context, IMethodDeclaration declaration) {
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		for(ArgumentAssignment assignment : this)
			assignments.add(assignment.resolveAndCheck(context, declaration.getArguments()));
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
		case M:
			toMDialect(writer);
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

	private void toMDialect(CodeWriter writer) {
		toODialect(writer);
	}

	public void declare(Transpiler transpiler) {
		for(ArgumentAssignment as : this) {
			as.declare(transpiler);
		}
		
	}


}
