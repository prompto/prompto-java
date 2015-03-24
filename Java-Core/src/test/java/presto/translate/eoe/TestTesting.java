package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestTesting extends BaseEParserTest {

	@Test
	public void testNegative() throws Exception {
		compareResourceEOE("testing/negative.e");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceEOE("testing/negativeError.e");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceEOE("testing/positive.e");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceEOE("testing/positiveError.e");
	}

}

