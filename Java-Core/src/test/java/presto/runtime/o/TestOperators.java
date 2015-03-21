package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("operators/addAmount.o");
	}

	@Test
	public void testDivAmount() throws Exception {
		checkOutput("operators/divAmount.o");
	}

	@Test
	public void testIdivAmount() throws Exception {
		checkOutput("operators/idivAmount.o");
	}

	@Test
	public void testModAmount() throws Exception {
		checkOutput("operators/modAmount.o");
	}

	@Test
	public void testMultAmount() throws Exception {
		checkOutput("operators/multAmount.o");
	}

	@Test
	public void testSubAmount() throws Exception {
		checkOutput("operators/subAmount.o");
	}

}

