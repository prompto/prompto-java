package prompto.parser.s;

import prompto.grammar.DeclarationList;
import prompto.utils.BaseParserTest;

public abstract class BaseSParserTest extends BaseParserTest {

	public DeclarationList parseString(String code) throws Exception {
		return super.parseSString(code);
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseSResource(resourceName);
	}
	
}
