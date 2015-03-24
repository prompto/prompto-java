package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTesting extends BaseOParserTest {

	@Test
	public void testNegative() throws Exception {
		compareResourceOPO("testing/negative.o");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceOPO("testing/negativeError.o");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceOPO("testing/positive.o");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceOPO("testing/positiveError.o");
	}

}

