package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
	public void testIntegerEnumeration() throws Exception {
		checkOutput("patterns/integerEnumeration.pec");
	}

	@Test
	public void testIntegerPattern() throws Exception {
		checkOutput("patterns/integerPattern.pec");
	}

	@Test
	public void testNegativeIntegerRange() throws Exception {
		checkOutput("patterns/negativeIntegerRange.pec");
	}

	@Test
	public void testPositiveIntegerRange() throws Exception {
		checkOutput("patterns/positiveIntegerRange.pec");
	}

	@Test
	public void testTextEnumeration() throws Exception {
		checkOutput("patterns/textEnumeration.pec");
	}

	@Test
	public void testTextPattern() throws Exception {
		checkOutput("patterns/textPattern.pec");
	}

}

