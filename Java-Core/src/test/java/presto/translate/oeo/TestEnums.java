package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestEnums extends BaseOParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceOEO("enums/categoryEnum.o");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceOEO("enums/integerEnum.o");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceOEO("enums/textEnum.o");
	}

}

