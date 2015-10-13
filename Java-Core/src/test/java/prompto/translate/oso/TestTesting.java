package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestTesting extends BaseOParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceOSO("testing/and.poc");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceOSO("testing/contains.poc");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceOSO("testing/greater.poc");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceOSO("testing/method.poc");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceOSO("testing/negative.poc");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceOSO("testing/negativeError.poc");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceOSO("testing/not.poc");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceOSO("testing/or.poc");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceOSO("testing/positive.poc");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceOSO("testing/positiveError.poc");
	}

}

