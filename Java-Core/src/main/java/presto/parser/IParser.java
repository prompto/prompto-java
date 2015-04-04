package presto.parser;

import java.io.InputStream;

import presto.grammar.DeclarationList;

public interface IParser {

	ILexer getLexer();
	void setProblemListener(IProblemListener listener);
	DeclarationList parse(String path, InputStream data) throws Exception;
}
