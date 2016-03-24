package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestOperators extends BaseOParserTest {

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
		checkInterpretedOutput("operators/addAmount.poc");
	}

	@Test
	public void testInterpretedDivAmount() throws Exception {
		checkInterpretedOutput("operators/divAmount.poc");
	}

	@Test
	public void testInterpretedIdivAmount() throws Exception {
		checkInterpretedOutput("operators/idivAmount.poc");
	}

	@Test
	public void testInterpretedModAmount() throws Exception {
		checkInterpretedOutput("operators/modAmount.poc");
	}

	@Test
	public void testInterpretedMultAmount() throws Exception {
		checkInterpretedOutput("operators/multAmount.poc");
	}

	@Test
	public void testInterpretedSubAmount() throws Exception {
		checkInterpretedOutput("operators/subAmount.poc");
	}

}

