package presto.runtime.p;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.p.BasePParserTest;
import presto.runtime.utils.Out;

public class TestTesting extends BasePParserTest {

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
		checkOutput("testing/and.p");
	}

	@Test
	public void testContains() throws Exception {
		checkOutput("testing/contains.p");
	}

	@Test
	public void testGreater() throws Exception {
		checkOutput("testing/greater.p");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("testing/method.p");
	}

	@Test
	public void testNegative() throws Exception {
		checkOutput("testing/negative.p");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.p");
	}

	@Test
	public void testNot() throws Exception {
		checkOutput("testing/not.p");
	}

	@Test
	public void testOr() throws Exception {
		checkOutput("testing/or.p");
	}

	@Test
	public void testPositive() throws Exception {
		checkOutput("testing/positive.p");
	}

	@Test
	public void testPositiveError() throws Exception {
		checkOutput("testing/positiveError.p");
	}

}

