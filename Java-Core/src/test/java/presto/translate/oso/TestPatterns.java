package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestPatterns extends BaseOParserTest {

	@Test
	public void testIntegerEnumeration() throws Exception {
		compareResourceOSO("patterns/integerEnumeration.poc");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		compareResourceOSO("patterns/integerPattern.poc");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		compareResourceOSO("patterns/negativeIntegerRange.poc");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		compareResourceOSO("patterns/positiveIntegerRange.poc");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		compareResourceOSO("patterns/textEnumeration.poc");
	}

	@Test
	public void testTextPattern() throws Exception {
		compareResourceOSO("patterns/textPattern.poc");
	}

}

