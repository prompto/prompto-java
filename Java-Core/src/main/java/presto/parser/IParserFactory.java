package presto.parser;

public interface IParserFactory {
	ILexer newLexer();
	IParser newParser();
}
