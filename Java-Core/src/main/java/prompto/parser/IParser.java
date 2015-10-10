package prompto.parser;

import java.io.InputStream;

import prompto.grammar.DeclarationList;
import prompto.problem.IProblemListener;

public interface IParser {

	ILexer getLexer();
	void setProblemListener(IProblemListener listener);
	DeclarationList parse(String path, InputStream data) throws Exception;
}
