package presto.parser;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;


public interface ILexer extends TokenSource {
	Dialect getDialect();
	Token nextToken();
}
