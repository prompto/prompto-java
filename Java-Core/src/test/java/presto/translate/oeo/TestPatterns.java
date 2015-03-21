package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestPatterns extends BaseOParserTest {

	@Test
	public void testIntegerEnumeration() throws Exception {
		compareResourceOEO("patterns/integerEnumeration.o");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		compareResourceOEO("patterns/integerPattern.o");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		compareResourceOEO("patterns/negativeIntegerRange.o");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		compareResourceOEO("patterns/positiveIntegerRange.o");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		compareResourceOEO("patterns/textEnumeration.o");
	}

	@Test
	public void testTextPattern() throws Exception {
		compareResourceOEO("patterns/textPattern.o");
	}

}

