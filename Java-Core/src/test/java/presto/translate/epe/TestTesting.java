package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestTesting extends BaseEParserTest {

	@Test
	public void testNegative() throws Exception {
		compareResourceEPE("testing/negative.e");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceEPE("testing/negativeError.e");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceEPE("testing/positive.e");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceEPE("testing/positiveError.e");
	}

}

