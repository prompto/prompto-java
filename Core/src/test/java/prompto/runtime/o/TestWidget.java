package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestWidget extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedMinimal() throws Exception {
		checkInterpretedOutput("widget/minimal.poc");
	}

	@Test
	public void testCompiledMinimal() throws Exception {
		checkCompiledOutput("widget/minimal.poc");
	}

	@Test
	public void testTranspiledMinimal() throws Exception {
		checkTranspiledOutput("widget/minimal.poc");
	}

}
