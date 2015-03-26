package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestTesting extends BaseOParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceOPO("testing/and.o");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceOPO("testing/contains.o");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceOPO("testing/greater.o");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceOPO("testing/method.o");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceOPO("testing/negative.o");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceOPO("testing/negativeError.o");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceOPO("testing/not.o");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceOPO("testing/or.o");
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

