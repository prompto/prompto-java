package presto.runtime.s;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.s.BaseSParserTest;
import presto.runtime.utils.Out;

public class TestTesting extends BaseSParserTest {

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
		checkOutput("testing/and.psc");
	}

	@Test
	public void testContains() throws Exception {
		checkOutput("testing/contains.psc");
	}

	@Test
	public void testGreater() throws Exception {
		checkOutput("testing/greater.psc");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("testing/method.psc");
	}

	@Test
	public void testNegative() throws Exception {
		checkOutput("testing/negative.psc");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.psc");
	}

	@Test
	public void testNot() throws Exception {
		checkOutput("testing/not.psc");
	}

	@Test
	public void testOr() throws Exception {
		checkOutput("testing/or.psc");
	}

	@Test
	public void testPositive() throws Exception {
		checkOutput("testing/positive.psc");
	}

	@Test
	public void testPositiveError() throws Exception {
		checkOutput("testing/positiveError.psc");
	}

}

