package prompto.parser;

import org.antlr.v4.runtime.ANTLRInputStream;


public class MParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer() {
		return new MIndentingLexer(new ANTLRInputStream(""));
	}

	@Override
	public IParser newParser() {
		return new MCleverParser("");
	}

}
