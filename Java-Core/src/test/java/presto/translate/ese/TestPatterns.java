package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestPatterns extends BaseEParserTest {

	@Test
	public void testIntegerEnumeration() throws Exception {
		compareResourceESE("patterns/integerEnumeration.pec");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		compareResourceESE("patterns/integerPattern.pec");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		compareResourceESE("patterns/negativeIntegerRange.pec");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		compareResourceESE("patterns/positiveIntegerRange.pec");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		compareResourceESE("patterns/textEnumeration.pec");
	}

	@Test
	public void testTextPattern() throws Exception {
		compareResourceESE("patterns/textPattern.pec");
	}

}

