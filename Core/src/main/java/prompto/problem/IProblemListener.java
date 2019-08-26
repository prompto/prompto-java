package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public interface IProblemListener {

	default boolean isCheckNative() { return true; };
	void reportDuplicate(ISection section, String name, ISection existing);
	void reportIllegalReturn(ISection section);
	void reportUnknownIdentifier(ISection section, String name);
	void reportUnknownProperty(ISection section, String name);
	void reportUnknownAttribute(ISection section, String name);
	void reportUnknownAnnotation(ISection section, String name);
	void reportUnknownMethod(ISection section, String name);
	void reportNoMatchingPrototype(ISection section, String proto);
	void reportIllegalAssignment(ISection section, IType expected, IType actual);
	void reportIllegalComparison(ISection section, IType type, IType other);
	void reportIllegalMember(ISection section, String name);
	void reportIllegalOperation(ISection section, String message);
	void reportIllegalRemoteCall(ISection section, String message);
	void reportAmbiguousIdentifier(ISection section, String name);
	void reportIllegalAnnotation(ISection section, String message);

}
