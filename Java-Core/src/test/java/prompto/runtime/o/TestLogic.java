package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestLogic extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedAndBoolean() throws Exception {
		checkInterpretedOutput("logic/andBoolean.poc");
	}

	@Test
	public void testInterpretedNotBoolean() throws Exception {
		checkInterpretedOutput("logic/notBoolean.poc");
	}

	@Test
	public void testInterpretedOrBoolean() throws Exception {
		checkInterpretedOutput("logic/orBoolean.poc");
	}

}

