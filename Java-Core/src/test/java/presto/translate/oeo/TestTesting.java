package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTesting extends BaseOParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceOEO("testing/and.o");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceOEO("testing/contains.o");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceOEO("testing/greater.o");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceOEO("testing/method.o");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceOEO("testing/negative.o");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceOEO("testing/negativeError.o");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceOEO("testing/not.o");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceOEO("testing/or.o");
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

