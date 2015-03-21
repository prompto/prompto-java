package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestOperators extends BaseOParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceOPO("operators/addAmount.o");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceOPO("operators/divAmount.o");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceOPO("operators/idivAmount.o");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceOPO("operators/modAmount.o");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceOPO("operators/multAmount.o");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceOPO("operators/subAmount.o");
	}

}

