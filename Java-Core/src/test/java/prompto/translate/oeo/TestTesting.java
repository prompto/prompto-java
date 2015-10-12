package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestTesting extends BaseOParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceEOE("testing/and.poc");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceEOE("testing/contains.poc");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceEOE("testing/greater.poc");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceEOE("testing/method.poc");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceEOE("testing/negative.poc");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceEOE("testing/negativeError.poc");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceEOE("testing/not.poc");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceEOE("testing/or.poc");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceEOE("testing/positive.poc");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceEOE("testing/positiveError.poc");
	}

}

