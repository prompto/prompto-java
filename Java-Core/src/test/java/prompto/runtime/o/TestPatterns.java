package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestPatterns extends BaseOParserTest {

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
		checkInterpretedOutput("patterns/integerEnumeration.poc");
	}

	@Test
	public void testInterpretedIntegerPattern() throws Exception {
		checkInterpretedOutput("patterns/integerPattern.poc");
	}

	@Test
	public void testInterpretedNegativeIntegerRange() throws Exception {
		checkInterpretedOutput("patterns/negativeIntegerRange.poc");
	}

	@Test
	public void testInterpretedPositiveIntegerRange() throws Exception {
		checkInterpretedOutput("patterns/positiveIntegerRange.poc");
	}

	@Test
	public void testInterpretedTextEnumeration() throws Exception {
		checkInterpretedOutput("patterns/textEnumeration.poc");
	}

	@Test
	public void testInterpretedTextPattern() throws Exception {
		checkInterpretedOutput("patterns/textPattern.poc");
	}

}

