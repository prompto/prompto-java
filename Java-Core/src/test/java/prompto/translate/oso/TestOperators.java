package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestOperators extends BaseOParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceOSO("operators/addAmount.poc");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceOSO("operators/divAmount.poc");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceOSO("operators/idivAmount.poc");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceOSO("operators/modAmount.poc");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceOSO("operators/multAmount.poc");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceOSO("operators/subAmount.poc");
	}

}

