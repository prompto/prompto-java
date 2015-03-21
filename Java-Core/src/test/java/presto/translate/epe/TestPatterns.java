package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestPatterns extends BaseEParserTest {

	@Test
	public void testIntegerEnumeration() throws Exception {
		compareResourceEPE("patterns/integerEnumeration.e");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		compareResourceEPE("patterns/integerPattern.e");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		compareResourceEPE("patterns/negativeIntegerRange.e");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		compareResourceEPE("patterns/positiveIntegerRange.e");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		compareResourceEPE("patterns/textEnumeration.e");
	}

	@Test
	public void testTextPattern() throws Exception {
		compareResourceEPE("patterns/textPattern.e");
	}

}

