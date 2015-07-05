// generated: 2015-07-05T23:01:01.146
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("testing/and.pec");
	}

	@Test
	public void testContains() throws Exception {
		checkOutput("testing/contains.pec");
	}

	@Test
	public void testGreater() throws Exception {
		checkOutput("testing/greater.pec");
	}

	@Test
	public void testMethod() throws Exception {
		checkOutput("testing/method.pec");
	}

	@Test
	public void testNegative() throws Exception {
		checkOutput("testing/negative.pec");
	}

	@Test
	public void testNegativeError() throws Exception {
		checkOutput("testing/negativeError.pec");
	}

	@Test
	public void testNot() throws Exception {
		checkOutput("testing/not.pec");
	}

	@Test
	public void testOr() throws Exception {
		checkOutput("testing/or.pec");
	}

	@Test
	public void testPositive() throws Exception {
		checkOutput("testing/positive.pec");
	}

	@Test
	public void testPositiveError() throws Exception {
		checkOutput("testing/positiveError.pec");
	}

}

