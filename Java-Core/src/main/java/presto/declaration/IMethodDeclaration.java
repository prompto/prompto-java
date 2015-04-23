package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.ArgumentList;
import presto.grammar.IArgument;
import presto.grammar.Specificity;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.IType;
import presto.value.IValue;

public interface IMethodDeclaration extends IDeclaration {

	IType getReturnType();
	ArgumentList getArguments();
	String getSignature(Dialect dialect);
	boolean isEligibleAsMain();
	String getProto(Context context) throws SyntaxError;
	IValue interpret(Context context) throws PrestoError;
	void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError;
	boolean isAssignableTo(Context context, ArgumentAssignmentList assignments, boolean checkInstance);
	void registerArguments(Context local) throws SyntaxError;
	Specificity computeSpecificity(Context context, IArgument argument, ArgumentAssignment assignment, boolean checkInstance);
	void setMemberOf(ConcreteCategoryDeclaration declaration);
	ConcreteCategoryDeclaration getMemberOf();

}


