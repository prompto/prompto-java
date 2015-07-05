package prompto.parser;

import org.antlr.v4.runtime.ANTLRInputStream;

public class OParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer() {
		return new ONamingLexer(new ANTLRInputStream(""));
	}

	@Override
	public IParser newParser() {
		return new OCleverParser("");
	}

}
