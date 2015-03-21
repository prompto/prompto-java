package presto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;



public class EParserFactory implements IParserFactory {

	@Override
	public ILexer newLexer(String data) {
		return new EIndentingLexer(new ANTLRInputStream(data));
	}

	@Override
	public IParser newParser(String data) {
		return new ECleverParser(data);
	}

	@Override
	public ILexer newLexer(InputStream data) {
		try {
			return new EIndentingLexer(new ANTLRInputStream(data));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public IParser newParser(String path, InputStream data) {
		try {
			return new ECleverParser(path, data);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
