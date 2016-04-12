package prompto.declaration;

import prompto.argument.IArgument;
import prompto.compiler.ClassFile;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.ArgumentList;
import prompto.grammar.Specificity;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.value.IValue;

public interface IMethodDeclaration extends IDeclaration {

	IType getReturnType();
	ArgumentList getArguments();
	String getSignature(Dialect dialect);
	boolean isAbstract();
	boolean isEligibleAsMain();
	default String getNameAsKey() { return getName(); }
	String getProto();
	IValue interpret(Context context) throws PromptoError;
	void check(ConcreteCategoryDeclaration declaration, Context context);
	boolean isAssignableTo(Context context, ArgumentAssignmentList assignments, boolean checkInstance);
	boolean isAssignableFrom(Context context, ArgumentAssignmentList assignments);
	void registerArguments(Context local);
	Specificity computeSpecificity(Context context, IArgument argument, ArgumentAssignment assignment, 
			boolean allowAncestor, boolean useInstance);
	void setMemberOf(CategoryDeclaration declaration);
	CategoryDeclaration getMemberOf();
	void compile(Context context, ClassFile classFile);
	void compilePrototype(Context context, ClassFile classFile);
	void compileAssignments(Context context, MethodInfo method, Flags flags, ArgumentAssignmentList assignments);
	
}


