package prompto.runtime.m;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.m.BaseMParserTest;
import prompto.runtime.utils.Out;

public class TestCss extends BaseMParserTest {

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
		checkInterpretedOutput("css/textValue.pmc");
	}

	@Test
	public void testCompiledTextValue() throws Exception {
		checkCompiledOutput("css/textValue.pmc");
	}

	@Test
	public void testTranspiledTextValue() throws Exception {
		checkTranspiledOutput("css/textValue.pmc");
	}

}

