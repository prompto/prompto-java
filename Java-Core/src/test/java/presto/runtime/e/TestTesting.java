package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestTesting extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAnd() throws Exception {
		checkOutput("testing/and.e");
	}

	@Test
	public void testContains() throws Exception {
		checkOutput("testing/contains.e");
	}

	@Test
	public void testGreater() throws Exception {
		checkOutput("testing/greater.e");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("testing/method.e");
	}

	@Test
	public void testNegative() throws Exception {
		checkOutput("testing/negative.e");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.e");
	}

	@Test
	public void testNot() throws Exception {
		checkOutput("testing/not.e");
	}

	@Test
	public void testOr() throws Exception {
		checkOutput("testing/or.e");
	}

	@Test
	public void testPositive() throws Exception {
		checkOutput("testing/positive.e");
	}

	@Test
	public void testPositiveError() throws Exception {
		checkOutput("testing/positiveError.e");
	}

}

