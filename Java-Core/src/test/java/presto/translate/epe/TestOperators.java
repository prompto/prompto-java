package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestOperators extends BaseEParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceEPE("operators/addAmount.e");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceEPE("operators/divAmount.e");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceEPE("operators/idivAmount.e");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceEPE("operators/modAmount.e");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceEPE("operators/multAmount.e");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceEPE("operators/subAmount.e");
	}

}

