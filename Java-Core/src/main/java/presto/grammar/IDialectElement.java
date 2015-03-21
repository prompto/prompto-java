package presto.grammar;

import presto.parser.Dialect;

public interface IDialectElement {

	String ToDialect(Dialect dialect);

}
