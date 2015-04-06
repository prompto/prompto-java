package presto.parser.s;

import presto.grammar.DeclarationList;
import presto.utils.BaseParserTest;

public abstract class BaseSParserTest extends BaseParserTest {

	public DeclarationList parseString(String code) throws Exception {
		return super.parseSString(code);
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseSResource(resourceName);
	}
	
}
