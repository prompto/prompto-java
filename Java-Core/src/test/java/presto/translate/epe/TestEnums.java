package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestEnums extends BaseEParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceEPE("enums/categoryEnum.e");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceEPE("enums/integerEnum.e");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceEPE("enums/textEnum.e");
	}

}

