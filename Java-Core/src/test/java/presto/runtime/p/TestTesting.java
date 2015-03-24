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
	public void testNegative() throws Exception {
		checkOutput("testing/negative.p");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.p");
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

