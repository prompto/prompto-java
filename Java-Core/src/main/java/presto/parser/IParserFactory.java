package presto.parser;

import java.io.InputStream;



public interface IParserFactory {

	ILexer newLexer(String data);
	ILexer newLexer(InputStream data);
	IParser newParser(String data);
	IParser newParser(String path, InputStream data);
}
