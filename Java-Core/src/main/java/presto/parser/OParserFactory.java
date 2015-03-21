package presto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;



public class OParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer(String data) {
		return new ONamingLexer(new ANTLRInputStream(data));
	}

	@Override
	public IParser newParser(String data) {
		return new OCleverParser(data);
	}

	@Override
	public ILexer newLexer(InputStream data) {
		try {
			return new ONamingLexer(new ANTLRInputStream(data));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public IParser newParser(String path, InputStream data) {
		try {
			return new OCleverParser(path, data);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
