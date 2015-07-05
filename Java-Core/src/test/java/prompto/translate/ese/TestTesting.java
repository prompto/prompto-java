// generated: 2015-07-05T23:01:01.145
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestTesting extends BaseEParserTest {

	@Test
	public void testAnd() throws Exception {
		compareResourceESE("testing/and.pec");
	}

	@Test
	public void testContains() throws Exception {
		compareResourceESE("testing/contains.pec");
	}

	@Test
	public void testGreater() throws Exception {
		compareResourceESE("testing/greater.pec");
	}

	@Test
	public void testMethod() throws Exception {
		compareResourceESE("testing/method.pec");
	}

	@Test
	public void testNegative() throws Exception {
		compareResourceESE("testing/negative.pec");
	}

	@Test
	public void testNegativeError() throws Exception {
		compareResourceESE("testing/negativeError.pec");
	}

	@Test
	public void testNot() throws Exception {
		compareResourceESE("testing/not.pec");
	}

	@Test
	public void testOr() throws Exception {
		compareResourceESE("testing/or.pec");
	}

	@Test
	public void testPositive() throws Exception {
		compareResourceESE("testing/positive.pec");
	}

	@Test
	public void testPositiveError() throws Exception {
		compareResourceESE("testing/positiveError.pec");
	}

}

