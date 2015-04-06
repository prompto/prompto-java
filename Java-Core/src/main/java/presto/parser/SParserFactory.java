package presto.parser;

import org.antlr.v4.runtime.ANTLRInputStream;


public class SParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer() {
		return new SIndentingLexer(new ANTLRInputStream(""));
	}

	@Override
	public IParser newParser() {
		return new SCleverParser("");
	}

}
