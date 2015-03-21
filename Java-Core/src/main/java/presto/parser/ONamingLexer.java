package presto.parser;

import org.antlr.v4.runtime.CharStream;

public class ONamingLexer extends OLexer implements ILexer {

    public ONamingLexer(CharStream input) {
    	super(input);
    }

	@Override
	public Dialect getDialect() {
		return Dialect.O;
	}
}
