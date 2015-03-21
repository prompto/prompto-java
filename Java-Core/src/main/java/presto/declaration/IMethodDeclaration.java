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
	String getProto(Context context) throws SyntaxError;
	Specificity computeSpecificity(Context context, IArgument argument, ArgumentAssignment assignment, boolean checkInstance);
	IValue interpret(Context context) throws PrestoError;
	boolean isAssignableTo(Context context, ArgumentAssignmentList assignments, boolean checkInstance);
	void registerArguments(Context local) throws SyntaxError;
	boolean isEligibleAsMain();

}


