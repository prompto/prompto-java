package presto.parser;

import org.antlr.v4.runtime.ANTLRInputStream;

public class EParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer() {
		return new EIndentingLexer(new ANTLRInputStream(""));
	}

	@Override
	public IParser newParser() {
		return new ECleverParser("");
	}

}
