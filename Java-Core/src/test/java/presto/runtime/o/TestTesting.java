package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestTesting extends BaseOParserTest {

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
		checkOutput("testing/and.o");
	}

	@Test
	public void testContains() throws Exception {
		checkOutput("testing/contains.o");
	}

	@Test
	public void testGreater() throws Exception {
		checkOutput("testing/greater.o");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("testing/method.o");
	}

	@Test
	public void testNegative() throws Exception {
		checkOutput("testing/negative.o");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.o");
	}

	@Test
	public void testNot() throws Exception {
		checkOutput("testing/not.o");
	}

	@Test
	public void testOr() throws Exception {
		checkOutput("testing/or.o");
	}

	@Test
	public void testPositive() throws Exception {
		checkOutput("testing/positive.o");
	}

	@Test
	public void testPositiveError() throws Exception {
		checkOutput("testing/positiveError.o");
	}

}

