package presto.parser;

import java.util.Collection;

public interface IProblemListener {

	void reset();
	int getCount();
	Collection<IProblem> getProblems();

}
