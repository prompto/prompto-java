package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestEnums extends BaseOParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceOSO("enums/categoryEnum.poc");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceOSO("enums/integerEnum.poc");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceOSO("enums/textEnum.poc");
	}

}

