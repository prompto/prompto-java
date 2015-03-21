package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestEnums extends BaseOParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceOPO("enums/categoryEnum.o");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceOPO("enums/integerEnum.o");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceOPO("enums/textEnum.o");
	}

}

