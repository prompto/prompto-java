package presto.parser;

import java.util.Collection;

public interface IErrorListener {

	void reset();
	int getCount();
	Collection<IError> getErrors();

}
