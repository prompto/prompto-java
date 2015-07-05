// generated: 2015-07-05T23:01:01.150
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("testing/and.poc");
	}

	@Test
	public void testContains() throws Exception {
		checkOutput("testing/contains.poc");
	}

	@Test
	public void testGreater() throws Exception {
		checkOutput("testing/greater.poc");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("testing/method.poc");
	}

	@Test
	public void testNegative() throws Exception {
		checkOutput("testing/negative.poc");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.poc");
	}

	@Test
	public void testNot() throws Exception {
		checkOutput("testing/not.poc");
	}

	@Test
	public void testOr() throws Exception {
		checkOutput("testing/or.poc");
	}

	@Test
	public void testPositive() throws Exception {
		checkOutput("testing/positive.poc");
	}

	@Test
	public void testPositiveError() throws Exception {
		checkOutput("testing/positiveError.poc");
	}

}

