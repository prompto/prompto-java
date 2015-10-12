package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestEnums extends BaseEParserTest {

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
		checkOutput("enums/categoryEnum.pec");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		checkOutput("enums/integerEnum.pec");
	}

	@Test
	public void testTextEnum() throws Exception {
		checkOutput("enums/textEnum.pec");
	}

}

