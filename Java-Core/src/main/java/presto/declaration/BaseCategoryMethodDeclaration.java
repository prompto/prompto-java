package presto.declaration;

import presto.error.SyntaxError;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.ArgumentList;
import presto.grammar.IArgument;
import presto.grammar.Specificity;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;

public abstract class BaseCategoryMethodDeclaration extends BaseDeclaration implements ICategoryMethodDeclaration {

	ArgumentList arguments;
	IType returnType;
	StatementList instructions;
	
	protected BaseCategoryMethodDeclaration(String name, ArgumentList arguments, IType returnType, StatementList instructions) {
		super(name);
		this.arguments = arguments;
		this.returnType = returnType;
		this.instructions = instructions;
	}
	
	@Override
	public void register(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArgumentList getArguments() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProto(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Specificity computeSpecificity(Context context, IArgument argument,
			ArgumentAssignment assignment, boolean checkInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAssignableTo(Context context,
			ArgumentAssignmentList assignments, boolean checkInstance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerArguments(Context local) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isEligibleAsMain() {
		// TODO Auto-generated method stub
		return false;
	}
		
}
