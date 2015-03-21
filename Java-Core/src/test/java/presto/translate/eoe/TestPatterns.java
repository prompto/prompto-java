package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestPatterns extends BaseEParserTest {

	@Test
	public void testIntegerEnumeration() throws Exception {
		compareResourceEOE("patterns/integerEnumeration.e");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		compareResourceEOE("patterns/integerPattern.e");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		compareResourceEOE("patterns/negativeIntegerRange.e");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		compareResourceEOE("patterns/positiveIntegerRange.e");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		compareResourceEOE("patterns/textEnumeration.e");
	}

	@Test
	public void testTextPattern() throws Exception {
		compareResourceEOE("patterns/textPattern.e");
	}

}

