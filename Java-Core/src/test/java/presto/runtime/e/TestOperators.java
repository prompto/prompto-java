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
		checkOutput("operators/addAmount.e");
	}

	@Test
	public void testDivAmount() throws Exception {
		checkOutput("operators/divAmount.e");
	}

	@Test
	public void testIdivAmount() throws Exception {
		checkOutput("operators/idivAmount.e");
	}

	@Test
	public void testModAmount() throws Exception {
		checkOutput("operators/modAmount.e");
	}

	@Test
	public void testMultAmount() throws Exception {
		checkOutput("operators/multAmount.e");
	}

	@Test
	public void testSubAmount() throws Exception {
		checkOutput("operators/subAmount.e");
	}

}

