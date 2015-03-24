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
	public void testNegative() throws Exception {
		checkOutput("testing/negative.e");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.e");
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

