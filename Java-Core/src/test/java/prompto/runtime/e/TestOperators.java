package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestOperators extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedAddAmount() throws Exception {
		checkInterpretedOutput("operators/addAmount.pec");
	}

	@Test
	public void testInterpretedDivAmount() throws Exception {
		checkInterpretedOutput("operators/divAmount.pec");
	}

	@Test
	public void testInterpretedIdivAmount() throws Exception {
		checkInterpretedOutput("operators/idivAmount.pec");
	}

	@Test
	public void testInterpretedModAmount() throws Exception {
		checkInterpretedOutput("operators/modAmount.pec");
	}

	@Test
	public void testInterpretedMultAmount() throws Exception {
		checkInterpretedOutput("operators/multAmount.pec");
	}

	@Test
	public void testInterpretedSubAmount() throws Exception {
		checkInterpretedOutput("operators/subAmount.pec");
	}

}

