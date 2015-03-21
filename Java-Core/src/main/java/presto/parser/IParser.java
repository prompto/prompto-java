package presto.parser;

import presto.grammar.DeclarationList;

public interface IParser {

	DeclarationList parse() throws Exception;

}
