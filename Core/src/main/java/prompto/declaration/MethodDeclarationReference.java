package prompto.declaration;

import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import prompto.code.ICodeStore;
import prompto.compiler.ClassFile;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.grammar.Annotation;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.grammar.ParameterList;
import prompto.grammar.Specificity;
import prompto.param.IParameter;
import prompto.parser.Dialect;
import prompto.parser.ILocation;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class MethodDeclarationReference implements IMethodDeclaration {

	IMethodDeclaration wrapped;
	
	public MethodDeclarationReference(IMethodDeclaration wrapped) {
		this.wrapped = wrapped; 
	}

	@Override
	public boolean isReference() {
		return true;
	}

	@Override
	public void register(Context context) {
		wrapped.register(context);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		wrapped.toDialect(writer);
	}

	@Override
	public void setOrigin(ICodeStore origin) {
		wrapped.setOrigin(origin);
	}

	@Override
	public ICodeStore getOrigin() {
		return wrapped.getOrigin();
	}

	@Override
	public DeclarationType getDeclarationType() {
		return wrapped.getDeclarationType();
	}

	@Override
	public void setComments(Collection<CommentStatement> comments) {
		wrapped.setComments(comments);
	}

	@Override
	public Collection<CommentStatement> getComments() {
		return wrapped.getComments();
	}

	@Override
	public void setAnnotations(Collection<Annotation> annotations) {
		wrapped.setAnnotations(annotations);
	}

	@Override
	public void addAnnotation(Annotation annotation) {
		wrapped.addAnnotation(annotation);
	}

	@Override
	public Collection<Annotation> getLocalAnnotations() {
		return wrapped.getLocalAnnotations();
	}

	@Override
	public Collection<Annotation> getAllAnnotations(Context context) {
		return wrapped.getAllAnnotations(context);
	}

	@Override
	public Stream<Annotation> getAllAnnotationsAsStream(Context context) {
		return wrapped.getAllAnnotationsAsStream(context);
	}

	@Override
	public boolean hasLocalAnnotation(String name) {
		return wrapped.hasLocalAnnotation(name);
	}

	@Override
	public boolean hasAnyLocalAnnotation(Set<String> names) {
		return wrapped.hasAnyLocalAnnotation(names);
	}

	@Override
	public boolean hasInheritedAnnotation(Context context, String name) {
		return wrapped.hasInheritedAnnotation(context, name);
	}

	@Override
	public boolean removeAnnotation(String name) {
		return wrapped.removeAnnotation(name);
	}

	@Override
	public Identifier getId() {
		return wrapped.getId();
	}

	@Override
	public IType getType(Context context) {
		return wrapped.getType(context);
	}

	@Override
	public String getPath() {
		return wrapped.getPath();
	}

	@Override
	public ILocation getStart() {
		return wrapped.getStart();
	}

	@Override
	public ILocation getEnd() {
		return wrapped.getEnd();
	}

	@Override
	public Dialect getDialect() {
		return wrapped.getDialect();
	}

	@Override
	public void setAsBreakpoint(boolean set) {
		wrapped.setAsBreakpoint(set);
	}

	@Override
	public boolean isBreakpoint() {
		return wrapped.isBreakpoint();
	}

	@Override
	public boolean isOrContains(ISection section) {
		return wrapped.isOrContains(section);
	}

	@Override
	public String getProto() {
		return wrapped.getProto();
	}

	@Override
	public IType check(Context context, boolean isStart) {
		return wrapped.check(context, isStart);
	}

	@Override
	public IType getReturnType() {
		return wrapped.getReturnType();
	}

	@Override
	public ParameterList getParameters() {
		return wrapped.getParameters();
	}

	@Override
	public String getSignature(Dialect dialect) {
		return wrapped.getSignature(dialect);
	}

	@Override
	public boolean isAbstract() {
		return wrapped.isAbstract();
	}

	@Override
	public boolean isTemplate() {
		return wrapped.isTemplate();
	}

	@Override
	public boolean isEligibleAsMain() {
		return wrapped.isEligibleAsMain();
	}

	@Override
	public void setMemberOf(CategoryDeclaration declaration) {
		wrapped.setMemberOf(declaration);
	}

	@Override
	public CategoryDeclaration getMemberOf() {
		return wrapped.getMemberOf();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return wrapped.interpret(context);
	}

	@Override
	public IType checkChild(Context context) {
		return wrapped.checkChild(context);
	}

	@Override
	public boolean isAssignableTo(Context context, ArgumentList assignments, boolean checkInstance, boolean allowDerived, Predicate<Specificity> filter) {
		return wrapped.isAssignableTo(context, assignments, checkInstance, allowDerived, filter);
	}

	@Override
	public boolean isAssignableFrom(Context context, ArgumentList assignments) {
		return wrapped.isAssignableFrom(context, assignments);
	}

	@Override
	public void registerParameters(Context local) {
		wrapped.registerParameters(local);
	}

	@Override
	public Specificity computeSpecificity(Context context, IParameter parameter, Argument argument, boolean useInstance, boolean allowDerived) {
		return wrapped.computeSpecificity(context, parameter, argument, useInstance, allowDerived);
	}

	@Override
	public void compile(Context context, boolean isStart, ClassFile classFile) {
		wrapped.compile(context, isStart, classFile);
	}

	@Override
	public void compilePrototype(Context context, boolean isStart, ClassFile classFile) {
		wrapped.compilePrototype(context, isStart, classFile);
	}

	@Override
	public String compileTemplate(Context context, boolean isStart, ClassFile classFile) {
		return wrapped.compileTemplate(context, isStart, classFile);
	}

	@Override
	public void compileParameters(Context context, MethodInfo method, Flags flags, ArgumentList assignments) {
		wrapped.compileParameters(context, method, flags, assignments);
	}

	@Override
	public String getTranspiledName(Context context) {
		return wrapped.getTranspiledName(context);
	}

	@Override
	public String getTranspiledName(Context context, String methodName) {
		return wrapped.getTranspiledName(context, methodName);
	}

	@Override
	public void declare(Transpiler transpiler) {
		wrapped.declare(transpiler);
	}

}
