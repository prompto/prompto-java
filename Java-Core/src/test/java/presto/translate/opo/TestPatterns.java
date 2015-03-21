package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestPatterns extends BaseOParserTest {

	@Test
	public void testIntegerEnumeration() throws Exception {
		compareResourceOPO("patterns/integerEnumeration.o");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		compareResourceOPO("patterns/integerPattern.o");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		compareResourceOPO("patterns/negativeIntegerRange.o");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		compareResourceOPO("patterns/positiveIntegerRange.o");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		compareResourceOPO("patterns/textEnumeration.o");
	}

	@Test
	public void testTextPattern() throws Exception {
		compareResourceOPO("patterns/textPattern.o");
	}

}

