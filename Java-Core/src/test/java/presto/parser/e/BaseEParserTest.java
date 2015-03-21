package presto.parser.e;

import presto.grammar.DeclarationList;
import presto.utils.BaseParserTest;


public abstract class BaseEParserTest extends BaseParserTest {

	public DeclarationList parseString(String code) throws Exception {
		return super.parseEString(code);
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseEResource(resourceName);
	}
	
}
