package prompto.declaration;

import java.util.List;

import prompto.compiler.ClassFile;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.ArgumentList;
import prompto.grammar.IArgument;
import prompto.grammar.Specificity;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.value.IValue;

public interface IMethodDeclaration extends IDeclaration {

	IType getReturnType();
	ArgumentList getArguments();
	String getSignature(Dialect dialect);
	boolean isEligibleAsMain();
	default String getNameAsKey() { return getName(); }
	String getProto();
	IValue interpret(Context context) throws PromptoError;
	void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError;
	boolean isAssignableTo(Context context, ArgumentAssignmentList assignments, boolean checkInstance);
	void registerArguments(Context local) throws SyntaxError;
	Specificity computeSpecificity(Context context, IArgument argument, ArgumentAssignment assignment, boolean checkInstance);
	void setMemberOf(ConcreteCategoryDeclaration declaration);
	ConcreteCategoryDeclaration getMemberOf();
	void compile(Context context, ClassFile classFile);
	void compilePrototype(Context context, ClassFile classFile);
	default void compileInnerClasses(Context context, java.lang.reflect.Type parentClass, List<ClassFile> list) {}

}


