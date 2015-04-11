package presto.parser;

import java.util.Collection;

import presto.type.IType;

public interface IProblemListener {

	void reset();
	int getCount();
	Collection<IProblem> getProblems();
	void reportDuplicate(String name, ISection section, ISection existing);
	void reportIllegalReturn(ISection section);
	void reportIllegalNonBoolean(ISection section, IType type);
	void reportUnknowIdentifier(String name, ISection section);
	void reportUnknownAttribute(String name, ISection section);

}
