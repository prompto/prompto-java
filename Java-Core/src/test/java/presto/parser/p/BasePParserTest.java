package presto.parser.p;

import presto.grammar.DeclarationList;
import presto.utils.BaseParserTest;

public abstract class BasePParserTest extends BaseParserTest {

	public DeclarationList parseString(String code) throws Exception {
		return super.parsePString(code);
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parsePResource(resourceName);
	}
	
}
