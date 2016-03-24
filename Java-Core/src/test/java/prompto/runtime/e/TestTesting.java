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
	public void testInterpretedAnd() throws Exception {
		checkInterpretedOutput("testing/and.pec");
	}

	@Test
	public void testInterpretedContains() throws Exception {
		checkInterpretedOutput("testing/contains.pec");
	}

	@Test
	public void testInterpretedGreater() throws Exception {
		checkInterpretedOutput("testing/greater.pec");
	}

	@Test
	public void testInterpretedMethod() throws Exception {
		checkInterpretedOutput("testing/method.pec");
	}

	@Test
	public void testInterpretedNegative() throws Exception {
		checkInterpretedOutput("testing/negative.pec");
	}

	@Test
	public void testInterpretedNegativeError() throws Exception {
		checkInterpretedOutput("testing/negativeError.pec");
	}

	@Test
	public void testInterpretedNot() throws Exception {
		checkInterpretedOutput("testing/not.pec");
	}

	@Test
	public void testInterpretedOr() throws Exception {
		checkInterpretedOutput("testing/or.pec");
	}

	@Test
	public void testInterpretedPositive() throws Exception {
		checkInterpretedOutput("testing/positive.pec");
	}

	@Test
	public void testInterpretedPositiveError() throws Exception {
		checkInterpretedOutput("testing/positiveError.pec");
	}

}

