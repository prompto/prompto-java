package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedCategoryEnum() throws Exception {
		checkInterpretedOutput("enums/categoryEnum.poc");
	}

	@Test
	public void testInterpretedIntegerEnum() throws Exception {
		checkInterpretedOutput("enums/integerEnum.poc");
	}

	@Test
	public void testInterpretedTextEnum() throws Exception {
		checkInterpretedOutput("enums/textEnum.poc");
	}

}

