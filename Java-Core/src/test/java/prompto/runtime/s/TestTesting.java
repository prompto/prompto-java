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
	public void testCompiledAnd() throws Exception {
		checkCompiledOutput("testing/and.psc");
	}

	@Test
	public void testInterpretedContains() throws Exception {
		checkInterpretedOutput("testing/contains.psc");
	}

	@Test
	public void testCompiledContains() throws Exception {
		checkCompiledOutput("testing/contains.psc");
	}

	@Test
	public void testInterpretedGreater() throws Exception {
		checkInterpretedOutput("testing/greater.psc");
	}

	@Test
	public void testCompiledGreater() throws Exception {
		checkCompiledOutput("testing/greater.psc");
	}

	@Test
	public void testInterpretedMethod() throws Exception {
		checkInterpretedOutput("testing/method.psc");
	}

	@Test
	public void testCompiledMethod() throws Exception {
		checkCompiledOutput("testing/method.psc");
	}

	@Test
	public void testInterpretedNegative() throws Exception {
		checkInterpretedOutput("testing/negative.psc");
	}

	@Test
	public void testCompiledNegative() throws Exception {
		checkCompiledOutput("testing/negative.psc");
	}

	@Test
	public void testInterpretedNegativeError() throws Exception {
		checkInterpretedOutput("testing/negativeError.psc");
	}

	@Test
	public void testCompiledNegativeError() throws Exception {
		checkCompiledOutput("testing/negativeError.psc");
	}

	@Test
	public void testInterpretedNot() throws Exception {
		checkInterpretedOutput("testing/not.psc");
	}

	@Test
	public void testCompiledNot() throws Exception {
		checkCompiledOutput("testing/not.psc");
	}

	@Test
	public void testInterpretedOr() throws Exception {
		checkInterpretedOutput("testing/or.psc");
	}

	@Test
	public void testCompiledOr() throws Exception {
		checkCompiledOutput("testing/or.psc");
	}

	@Test
	public void testInterpretedPositive() throws Exception {
		checkInterpretedOutput("testing/positive.psc");
	}

	@Test
	public void testCompiledPositive() throws Exception {
		checkCompiledOutput("testing/positive.psc");
	}

	@Test
	public void testInterpretedPositiveError() throws Exception {
		checkInterpretedOutput("testing/positiveError.psc");
	}

	@Test
	public void testCompiledPositiveError() throws Exception {
		checkCompiledOutput("testing/positiveError.psc");
	}

}

