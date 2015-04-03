package presto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;

public class ONamingLexer extends OLexer implements ILexer {

	public ONamingLexer(CharStream input) {
    	super(input);
    }
    
    @Override
    public void reset(InputStream input) throws IOException {
    	setInputStream(new ANTLRInputStream(input));
    }

	@Override
	public Dialect getDialect() {
		return Dialect.O;
	}
}
