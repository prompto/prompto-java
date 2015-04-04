package presto.parser;

import java.util.Collection;

import presto.declaration.IDeclaration;

public interface IProblemListener {

	void reset();
	int getCount();
	Collection<IProblem> getProblems();
	void reportDuplicate(IDeclaration declaration, ISection existing);

}
