package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestTesting extends BaseEParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceEPE("testing/and.e");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceEPE("testing/contains.e");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceEPE("testing/greater.e");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceEPE("testing/method.e");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceEPE("testing/negative.e");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceEPE("testing/negativeError.e");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceEPE("testing/not.e");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceEPE("testing/or.e");
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

