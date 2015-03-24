package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTesting extends BaseOParserTest {

	@Test
	public void testNegative() throws Exception {
		compareResourceOEO("testing/negative.o");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceOEO("testing/negativeError.o");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceOEO("testing/positive.o");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceOEO("testing/positiveError.o");
	}

}

