package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestCss extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedTextValue() throws Exception {
		checkInterpretedOutput("css/textValue.pec");
	}

	@Test
	public void testCompiledTextValue() throws Exception {
		checkCompiledOutput("css/textValue.pec");
	}

	@Test
	public void testTranspiledTextValue() throws Exception {
		checkTranspiledOutput("css/textValue.pec");
	}

}

