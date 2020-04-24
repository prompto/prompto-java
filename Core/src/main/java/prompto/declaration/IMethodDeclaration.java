package prompto.declaration;

import java.util.function.Predicate;

import prompto.compiler.ClassFile;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.ParameterList;
import prompto.grammar.Identifier;
import prompto.grammar.Specificity;
import prompto.param.IParameter;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.ContextFlags;
import prompto.statement.DeclarationStatement;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.value.IValue;

public interface IMethodDeclaration extends IDeclaration {

	String getProto();
	@Override
	default IType check(Context context) {
		// called as IExpression::check
		return check(context, ContextFlags.NONE);
	}
	IType check(Context context, ContextFlags flags);
	IType getReturnType();
	ParameterList getParameters();
	String getSignature(Dialect dialect);
	boolean isAbstract();
	boolean isTemplate();
	boolean isEligibleAsMain();
	default String getNameAsKey() { return getName(); }
	void setMemberOf(CategoryDeclaration declaration);
	CategoryDeclaration getMemberOf();
	default void setDeclarationOf(DeclarationStatement<IMethodDeclaration> statement) { throw new UnsupportedOperationException("setDeclarationStatement " + this.getClass().getName()); }
	default DeclarationStatement<IMethodDeclaration> getDeclarationOf() { throw new UnsupportedOperationException("getDeclarationStatement " + this.getClass().getName()); }
	IValue interpret(Context context) throws PromptoError;
	IType checkChild(Context context);
	boolean isAssignableTo(Context context, ArgumentList assignments, boolean checkInstance, boolean allowDerived, Predicate<Specificity> filter);
	boolean isAssignableFrom(Context context, ArgumentList assignments);
	void registerParameters(Context local);
	Specificity computeSpecificity(Context context, IParameter parameter, Argument argument, boolean useInstance, boolean allowDerived);
	void compile(Context context, ContextFlags flags, ClassFile classFile);
	void compilePrototype(Context context, ContextFlags flags, ClassFile classFile);
	String compileTemplate(Context context, ContextFlags flags, ClassFile classFile);
	void compileParameters(Context context, MethodInfo method, Flags flags, ArgumentList assignments);
	@Override
	String getTranspiledName(Context context);
	default void fullDeclare(Transpiler transpiler, Identifier methodName) { throw new UnsupportedOperationException("fullDeclare " + this.getClass().getName()); }
	default boolean containerHasAnnotation(Context context, String name) {
		CategoryDeclaration category = getMemberOf();
		return category!=null &&  category.hasAnnotation(context, name);
	};
	default boolean containerHasLocalAnnotation(String name) {
		CategoryDeclaration category = getMemberOf();
		return category!=null &&  category.hasLocalAnnotation(name);
	}
	default void declare(Transpiler transpiler) {
		// called as IExpression::declare
		declare(transpiler, ContextFlags.NONE);
	}
	void declare(Transpiler transpiler, ContextFlags flags);
	
}


