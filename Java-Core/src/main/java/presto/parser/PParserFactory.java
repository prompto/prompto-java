package presto.parser;

import org.antlr.v4.runtime.ANTLRInputStream;


public class PParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer() {
		return new PIndentingLexer(new ANTLRInputStream(""));
	}

	@Override
	public IParser newParser() {
		return new PCleverParser("");
	}

}
