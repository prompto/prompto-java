package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
	public void testAddAmount() throws Exception {
		checkOutput("operators/addAmount.pec");
	}

	@Test
	public void testDivAmount() throws Exception {
		checkOutput("operators/divAmount.pec");
	}

	@Test
	public void testIdivAmount() throws Exception {
		checkOutput("operators/idivAmount.pec");
	}

	@Test
	public void testModAmount() throws Exception {
		checkOutput("operators/modAmount.pec");
	}

	@Test
	public void testMultAmount() throws Exception {
		checkOutput("operators/multAmount.pec");
	}

	@Test
	public void testSubAmount() throws Exception {
		checkOutput("operators/subAmount.pec");
	}

}

