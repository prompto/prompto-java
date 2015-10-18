package prompto.problem;

import prompto.error.SyntaxError;
import prompto.parser.ISection;
import prompto.type.IType;

public interface IProblemListener {

	void reportDuplicate(String name, ISection section, ISection existing) throws SyntaxError;
	void reportIllegalReturn(ISection section) throws SyntaxError;
	void reportIllegalNonBoolean(ISection section, IType type) throws SyntaxError;
	void reportUnknownIdentifier(String name, ISection section) throws SyntaxError;
	void reportUnknownAttribute(String name, ISection section) throws SyntaxError;
	void reportUnknownMethod(String name, ISection section) throws SyntaxError;
	void reportIllegalComparison(IType type, IType other, ISection section) throws SyntaxError;
	void reportIllegalMember(String name, ISection section) throws SyntaxError;

}
