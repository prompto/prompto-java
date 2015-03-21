package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestOperators extends BaseEParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceEOE("operators/addAmount.e");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceEOE("operators/divAmount.e");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceEOE("operators/idivAmount.e");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceEOE("operators/modAmount.e");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceEOE("operators/multAmount.e");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceEOE("operators/subAmount.e");
	}

}

