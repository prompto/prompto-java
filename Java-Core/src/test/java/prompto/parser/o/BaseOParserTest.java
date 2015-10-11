package prompto.parser.o;

import prompto.declaration.DeclarationList;
import prompto.utils.BaseParserTest;

public abstract class BaseOParserTest extends BaseParserTest {

	public DeclarationList parseString(String code) throws Exception {
		return super.parseOString(code);
	}
	
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseOResource(resourceName);
	}
	
}
