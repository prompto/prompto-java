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
	public void testAddAmount() throws Exception {
		checkOutput("operators/addAmount.poc");
	}

	@Test
	public void testDivAmount() throws Exception {
		checkOutput("operators/divAmount.poc");
	}

	@Test
	public void testIdivAmount() throws Exception {
		checkOutput("operators/idivAmount.poc");
	}

	@Test
	public void testModAmount() throws Exception {
		checkOutput("operators/modAmount.poc");
	}

	@Test
	public void testMultAmount() throws Exception {
		checkOutput("operators/multAmount.poc");
	}

	@Test
	public void testSubAmount() throws Exception {
		checkOutput("operators/subAmount.poc");
	}

}

