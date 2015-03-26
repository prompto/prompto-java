package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestTesting extends BaseEParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceEOE("testing/and.e");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceEOE("testing/contains.e");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceEOE("testing/greater.e");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceEOE("testing/method.e");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceEOE("testing/negative.e");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceEOE("testing/negativeError.e");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceEOE("testing/not.e");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceEOE("testing/or.e");
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

