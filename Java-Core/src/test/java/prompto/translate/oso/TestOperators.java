package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestOperators extends BaseOParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceEOE("operators/addAmount.poc");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceEOE("operators/divAmount.poc");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceEOE("operators/idivAmount.poc");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceEOE("operators/modAmount.poc");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceEOE("operators/multAmount.poc");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceEOE("operators/subAmount.poc");
	}

}

