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
		checkOutput("patterns/integerEnumeration.o");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		checkOutput("patterns/integerPattern.o");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		checkOutput("patterns/negativeIntegerRange.o");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		checkOutput("patterns/positiveIntegerRange.o");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		checkOutput("patterns/textEnumeration.o");
	}

	@Test
	public void testTextPattern() throws Exception {
		checkOutput("patterns/textPattern.o");
	}

}

