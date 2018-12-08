package prompto.parser.o;

import java.io.File;

import prompto.declaration.DeclarationList;
import prompto.utils.BaseParserTest;

public abstract class BaseOParserTest extends BaseParserTest {

	@Override
	public DeclarationList parseString(String code) throws Exception {
		return super.parseOString(code);
	}
	
	@Override
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseOResource(resourceName);
	}
	
	@Override
	public DeclarationList parseFile(File file) throws Exception {
		return super.parseOFile(file);
	}

}
