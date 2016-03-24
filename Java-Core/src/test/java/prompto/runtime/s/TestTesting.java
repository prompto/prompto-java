package prompto.runtime.s;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.s.BaseSParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedAnd() throws Exception {
		checkInterpretedOutput("testing/and.psc");
	}

	@Test
	public void testInterpretedContains() throws Exception {
		checkInterpretedOutput("testing/contains.psc");
	}

	@Test
	public void testInterpretedGreater() throws Exception {
		checkInterpretedOutput("testing/greater.psc");
	}

	@Test
	public void testInterpretedMethod() throws Exception {
		checkInterpretedOutput("testing/method.psc");
	}

	@Test
	public void testInterpretedNegative() throws Exception {
		checkInterpretedOutput("testing/negative.psc");
	}

	@Test
	public void testInterpretedNegativeError() throws Exception {
		checkInterpretedOutput("testing/negativeError.psc");
	}

	@Test
	public void testInterpretedNot() throws Exception {
		checkInterpretedOutput("testing/not.psc");
	}

	@Test
	public void testInterpretedOr() throws Exception {
		checkInterpretedOutput("testing/or.psc");
	}

	@Test
	public void testInterpretedPositive() throws Exception {
		checkInterpretedOutput("testing/positive.psc");
	}

	@Test
	public void testInterpretedPositiveError() throws Exception {
		checkInterpretedOutput("testing/positiveError.psc");
	}

}

