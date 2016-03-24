package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestPatterns extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedIntegerEnumeration() throws Exception {
		checkInterpretedOutput("patterns/integerEnumeration.pec");
	}

	@Test
	public void testInterpretedIntegerPattern() throws Exception {
		checkInterpretedOutput("patterns/integerPattern.pec");
	}

	@Test
	public void testInterpretedNegativeIntegerRange() throws Exception {
		checkInterpretedOutput("patterns/negativeIntegerRange.pec");
	}

	@Test
	public void testInterpretedPositiveIntegerRange() throws Exception {
		checkInterpretedOutput("patterns/positiveIntegerRange.pec");
	}

	@Test
	public void testInterpretedTextEnumeration() throws Exception {
		checkInterpretedOutput("patterns/textEnumeration.pec");
	}

	@Test
	public void testInterpretedTextPattern() throws Exception {
		checkInterpretedOutput("patterns/textPattern.pec");
	}

}

