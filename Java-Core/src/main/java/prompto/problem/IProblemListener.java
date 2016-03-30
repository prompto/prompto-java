package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public interface IProblemListener {

	void reportDuplicate(String name, ISection section, ISection existing);
	void reportIllegalReturn(ISection section);
	void reportIllegalNonBoolean(ISection section, IType type);
	void reportUnknownIdentifier(String name, ISection section);
	void reportUnknownAttribute(String name, ISection section);
	void reportUnknownMethod(String name, ISection section);
	void reportIllegalComparison(IType type, IType other, ISection section);
	void reportIllegalMember(String name, ISection section);

}
