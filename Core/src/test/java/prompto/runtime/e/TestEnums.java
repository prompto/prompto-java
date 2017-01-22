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
	public void testInterpretedCategoryEnum() throws Exception {
		checkInterpretedOutput("enums/categoryEnum.pec");
	}

	@Test
	public void testCompiledCategoryEnum() throws Exception {
		checkCompiledOutput("enums/categoryEnum.pec");
	}

	@Test
	public void testInterpretedIntegerEnum() throws Exception {
		checkInterpretedOutput("enums/integerEnum.pec");
	}

	@Test
	public void testCompiledIntegerEnum() throws Exception {
		checkCompiledOutput("enums/integerEnum.pec");
	}

	@Test
	public void testInterpretedTextEnum() throws Exception {
		checkInterpretedOutput("enums/textEnum.pec");
	}

	@Test
	public void testCompiledTextEnum() throws Exception {
		checkCompiledOutput("enums/textEnum.pec");
	}

}

