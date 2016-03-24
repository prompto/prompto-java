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
	public void testInterpretedAnd() throws Exception {
		checkInterpretedOutput("testing/and.poc");
	}

	@Test
	public void testInterpretedContains() throws Exception {
		checkInterpretedOutput("testing/contains.poc");
	}

	@Test
	public void testInterpretedGreater() throws Exception {
		checkInterpretedOutput("testing/greater.poc");
	}

	@Test
	public void testInterpretedMethod() throws Exception {
		checkInterpretedOutput("testing/method.poc");
	}

	@Test
	public void testInterpretedNegative() throws Exception {
		checkInterpretedOutput("testing/negative.poc");
	}

	@Test
	public void testInterpretedNegativeError() throws Exception {
		checkInterpretedOutput("testing/negativeError.poc");
	}

	@Test
	public void testInterpretedNot() throws Exception {
		checkInterpretedOutput("testing/not.poc");
	}

	@Test
	public void testInterpretedOr() throws Exception {
		checkInterpretedOutput("testing/or.poc");
	}

	@Test
	public void testInterpretedPositive() throws Exception {
		checkInterpretedOutput("testing/positive.poc");
	}

	@Test
	public void testInterpretedPositiveError() throws Exception {
		checkInterpretedOutput("testing/positiveError.poc");
	}

}

