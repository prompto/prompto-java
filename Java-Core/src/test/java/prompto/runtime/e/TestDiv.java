package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestDiv extends BaseEParserTest {

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
		checkInterpretedOutput("div/divDecimal.pec");
	}

	@Test
	public void testInterpretedDivInteger() throws Exception {
		checkInterpretedOutput("div/divInteger.pec");
	}

	@Test
	public void testInterpretedIdivInteger() throws Exception {
		checkInterpretedOutput("div/idivInteger.pec");
	}

	@Test
	public void testInterpretedModInteger() throws Exception {
		checkInterpretedOutput("div/modInteger.pec");
	}

}

