package prompto.problem;

import java.util.Set;

import prompto.declaration.IDeclaration;
import prompto.expression.IExpression;
import prompto.parser.ICodeSection;
import prompto.type.IType;

public interface IProblemListener {

	default boolean isCheckNative() { return true; };
	void reportDuplicate(ICodeSection section, String name, ICodeSection existing);
	void reportAmbiguousIdentifier(ICodeSection section, String name);
	void reportUnknownIdentifier(ICodeSection section, String name);
	void reportUnknownMember(ICodeSection section, String name);
	void reportUnknownProperty(ICodeSection section, String name);
	void reportMissingProperty(ICodeSection section, String name);
	void reportDuplicateProperty(ICodeSection section, String name);
	default void reportUnknownAttribute(ICodeSection section, String name) {
		reportUnknownAttribute(section, name, "");
	}
	void reportUnknownAttribute(ICodeSection section, String name, String hint);
	void reportUnknownAnnotation(ICodeSection section, String name);
	void reportUnknownMethod(ICodeSection section, String name);
	void reportUnknownCategory(ICodeSection section, String name);
	void reportUnknownWidget(ICodeSection section, String name);
	void reportNoMatchingPrototype(ICodeSection section, String actual, Set<String> expected);
	void reportTooManyPrototypes(ICodeSection section, String source, Set<String> culprits);
	void reportMissingArrowPrototype(ICodeSection section, String source);
	void reportTooManyArrowPrototypes(ICodeSection section, String source, Set<String> culprits);
	void reportIllegalReturn(ICodeSection section);
	void reportIllegalOperator(ICodeSection section, String message);
	void reportIllegalAssignment(ICodeSection section, IType expected, IType actual);
	void reportIllegalAssignment(ICodeSection section, Set<IType> expected, IType actual);
	void reportIllegalItemType(ICodeSection section, Set<IType> expected, IType actual);
	void reportIllegalItemOperator(ICodeSection section, IType culprit);
	void reportIllegalOperation(ICodeSection section, String operation, IType left, IType right);
	void reportIllegalPredicate(ICodeSection section, IExpression expression);
	void reportIllegalRemoteCall(ICodeSection section, String message);
	void reportIllegalAnnotation(ICodeSection section, String message);
	void reportIllegalValue(ICodeSection section, String message);
	void reportIllegalInitialize(ICodeSection section);
	void reportIllegalInitializeParameters(ICodeSection section);
	void reportIllegalWidgetConstructor(ICodeSection section, String name);
	void reportIllegalAbstractCategory(ICodeSection section, String name, String missingPrototype);
	void reportIllegalAbstractWidget(ICodeSection section, String name, String missingPrototype);
	void reportIllegalAbstractMethodCall(ICodeSection section, String methodSignature);
	void reportInconsistentHierarchy(ICodeSection section, String category, String culprit);
	void reportUntypedRecursiveMethod(ICodeSection section, String name, String prototype);
	
	void reportIncompatibleTypes(ICodeSection section, IType first, IType second);
	void reportNoSuperType(ICodeSection section, IType actual);
	void reportNotMutable(ICodeSection section, String name);
	void reportNotStorable(ICodeSection section, String name);
	void reportAssigningVoidType(ICodeSection section);
	void reportReturningVoidType(ICodeSection section);
	void reportMissingBinding(ICodeSection section, String name);
	void reportMissingAttribute(ICodeSection section, String message);
	void reportExpectingCollection(ICodeSection section, IType actual);
	void reportExpectingResource(ICodeSection section, IType actual);
	
	void pushDeclaration(IDeclaration declaration);
	IDeclaration popDeclaration();
	String getEnclosingDeclaration();
	
	void reportError(ICodeSection section, String message);

}
