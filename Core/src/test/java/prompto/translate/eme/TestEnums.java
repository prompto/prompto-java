package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestEnums extends BaseEParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceEME("enums/categoryEnum.pec");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceEME("enums/integerEnum.pec");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceEME("enums/textEnum.pec");
	}

	@Test
	public void testTextEnumArg() throws Exception {
		compareResourceEME("enums/textEnumArg.pec");
	}

	@Test
	public void testTextEnumVar() throws Exception {
		compareResourceEME("enums/textEnumVar.pec");
	}

}

