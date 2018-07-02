package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestCss extends BaseOParserTest {

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
		checkInterpretedOutput("css/textValue.poc");
	}

	@Test
	public void testCompiledTextValue() throws Exception {
		checkCompiledOutput("css/textValue.poc");
	}

	@Test
	public void testTranspiledTextValue() throws Exception {
		checkTranspiledOutput("css/textValue.poc");
	}

}

