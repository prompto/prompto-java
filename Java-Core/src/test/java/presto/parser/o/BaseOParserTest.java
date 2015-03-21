package presto.parser.o;

import presto.grammar.DeclarationList;
import presto.utils.BaseParserTest;

public abstract class BaseOParserTest extends BaseParserTest {

	public DeclarationList parseString(String code) throws Exception {
		return super.parseOString(code);
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseOResource(resourceName);
	}
	
}
