package prompto.parser.m;

import java.io.File;

import prompto.declaration.DeclarationList;
import prompto.utils.BaseParserTest;

public abstract class BaseMParserTest extends BaseParserTest {

	@Override
	public DeclarationList parseString(String code) throws Exception {
		return super.parseMString(code);
	}
	
	@Override
	public DeclarationList parseResource(String resourceName) throws Exception {
		return super.parseMResource(resourceName);
	}
	
	@Override
	public DeclarationList parseFile(File file) throws Exception {
		return super.parseMFile(file);
	}

}
