package prompto.problem;

import java.util.Set;

import prompto.declaration.IDeclaration;
import prompto.parser.ISection;
import prompto.type.IType;

public interface IProblemListener {

	default boolean isCheckNative() { return true; };
	void reportDuplicate(ISection section, String name, ISection existing);
	void reportAmbiguousIdentifier(ISection section, String name);
	void reportUnknownIdentifier(ISection section, String name);
	void reportUnknownMember(ISection section, String name);
	void reportUnknownProperty(ISection section, String name);
	void reportMissingProperty(ISection section, String name);
	void reportDuplicateProperty(ISection section, String name);
	default void reportUnknownAttribute(ISection section, String name) {
		reportUnknownAttribute(section, name, "");
	}
	void reportUnknownAttribute(ISection section, String name, String hint);
	void reportUnknownAnnotation(ISection section, String name);
	void reportUnknownMethod(ISection section, String name);
	void reportUnknownCategory(ISection section, String name);
	void reportNoMatchingPrototype(ISection section, String proto);
	void reportIllegalReturn(ISection section);
	void reportIllegalAssignment(ISection section, IType expected, IType actual);
	void reportIllegalAssignment(ISection section, Set<IType> expected, IType actual);
	void reportIllegalComparison(ISection section, IType type, IType other);
	void reportIllegalOperation(ISection section, String message);
	void reportIllegalRemoteCall(ISection section, String message);
	void reportIllegalAnnotation(ISection section, String message);
	void reportIllegalValue(ISection section, String message);
	void reportInitializeConstructor(ISection section);
	void reportIllegalInitializeParameters(ISection section);
	void reportIncompatibleTypes(ISection section, IType first, IType second);
	void reportNoSuperType(ISection section, IType actual);
	void reportNotMutable(ISection section, String name);
	void reportNotStorable(ISection section, String name);
	void reportAssigningVoidType(ISection section);
	void reportReturningVoidType(ISection section);
	void reportMissingBinding(ISection section, String name);
	void reportMissingAttribute(ISection section, String message);
	void reportExpectingCollection(ISection section, IType actual);
	void reportExpectingResource(ISection section, IType actual);

	void pushDeclaration(IDeclaration declaration);
	IDeclaration popDeclaration();
	String getEnclosingDeclaration();

}
