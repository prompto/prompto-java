package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestOperators extends BaseOParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceOEO("operators/addAmount.o");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceOEO("operators/divAmount.o");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceOEO("operators/idivAmount.o");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceOEO("operators/modAmount.o");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceOEO("operators/multAmount.o");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceOEO("operators/subAmount.o");
	}

}

