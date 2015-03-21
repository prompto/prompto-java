package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestEnums extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testCategoryEnum() throws Exception {
		checkOutput("enums/categoryEnum.o");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		checkOutput("enums/integerEnum.o");
	}

	@Test
	public void testTextEnum() throws Exception {
		checkOutput("enums/textEnum.o");
	}

}

