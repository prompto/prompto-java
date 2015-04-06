package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
	public void testIntegerEnumeration() throws Exception {
		checkOutput("patterns/integerEnumeration.poc");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		checkOutput("patterns/integerPattern.poc");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		checkOutput("patterns/negativeIntegerRange.poc");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		checkOutput("patterns/positiveIntegerRange.poc");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		checkOutput("patterns/textEnumeration.poc");
	}

	@Test
	public void testTextPattern() throws Exception {
		checkOutput("patterns/textPattern.poc");
	}

}

