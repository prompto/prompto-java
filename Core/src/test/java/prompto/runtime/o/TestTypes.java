package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestTypes extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedLiteral() throws Exception {
		checkInterpretedOutput("types/literal.poc");
	}

	@Test
	public void testCompiledLiteral() throws Exception {
		checkCompiledOutput("types/literal.poc");
	}

	@Test
	public void testTranspiledLiteral() throws Exception {
		checkTranspiledOutput("types/literal.poc");
	}

}

