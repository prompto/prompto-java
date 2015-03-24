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
	public void testNegative() throws Exception {
		checkOutput("testing/negative.o");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.o");
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

