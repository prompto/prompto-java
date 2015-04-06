package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestOperators extends BaseEParserTest {

	@Test
	public void testAddAmount() throws Exception {
		compareResourceESE("operators/addAmount.pec");
	}

	@Test
	public void testDivAmount() throws Exception {
		compareResourceESE("operators/divAmount.pec");
	}

	@Test
	public void testIdivAmount() throws Exception {
		compareResourceESE("operators/idivAmount.pec");
	}

	@Test
	public void testModAmount() throws Exception {
		compareResourceESE("operators/modAmount.pec");
	}

	@Test
	public void testMultAmount() throws Exception {
		compareResourceESE("operators/multAmount.pec");
	}

	@Test
	public void testSubAmount() throws Exception {
		compareResourceESE("operators/subAmount.pec");
	}

}

