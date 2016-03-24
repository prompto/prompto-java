package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestDiv extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedDivDecimal() throws Exception {
		checkInterpretedOutput("div/divDecimal.poc");
	}

	@Test
	public void testInterpretedDivInteger() throws Exception {
		checkInterpretedOutput("div/divInteger.poc");
	}

	@Test
	public void testInterpretedIdivInteger() throws Exception {
		checkInterpretedOutput("div/idivInteger.poc");
	}

	@Test
	public void testInterpretedModInteger() throws Exception {
		checkInterpretedOutput("div/modInteger.poc");
	}

}

