package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSortSet extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedSortBooleans() throws Exception {
		checkInterpretedOutput("sortSet/sortBooleans.poc");
	}

	@Test
	public void testCompiledSortBooleans() throws Exception {
		checkCompiledOutput("sortSet/sortBooleans.poc");
	}

	@Test
	public void testInterpretedSortDates() throws Exception {
		checkInterpretedOutput("sortSet/sortDates.poc");
	}

	@Test
	public void testCompiledSortDates() throws Exception {
		checkCompiledOutput("sortSet/sortDates.poc");
	}

	@Test
	public void testInterpretedSortDateTimes() throws Exception {
		checkInterpretedOutput("sortSet/sortDateTimes.poc");
	}

	@Test
	public void testCompiledSortDateTimes() throws Exception {
		checkCompiledOutput("sortSet/sortDateTimes.poc");
	}

	@Test
	public void testInterpretedSortDecimals() throws Exception {
		checkInterpretedOutput("sortSet/sortDecimals.poc");
	}

	@Test
	public void testCompiledSortDecimals() throws Exception {
		checkCompiledOutput("sortSet/sortDecimals.poc");
	}

	@Test
	public void testInterpretedSortExpressions() throws Exception {
		checkInterpretedOutput("sortSet/sortExpressions.poc");
	}

	@Test
	public void testCompiledSortExpressions() throws Exception {
		checkCompiledOutput("sortSet/sortExpressions.poc");
	}

	@Test
	public void testInterpretedSortIntegers() throws Exception {
		checkInterpretedOutput("sortSet/sortIntegers.poc");
	}

	@Test
	public void testCompiledSortIntegers() throws Exception {
		checkCompiledOutput("sortSet/sortIntegers.poc");
	}

	@Test
	public void testInterpretedSortKeys() throws Exception {
		checkInterpretedOutput("sortSet/sortKeys.poc");
	}

	@Test
	public void testCompiledSortKeys() throws Exception {
		checkCompiledOutput("sortSet/sortKeys.poc");
	}

	@Test
	public void testInterpretedSortMethods() throws Exception {
		checkInterpretedOutput("sortSet/sortMethods.poc");
	}

	@Test
	public void testCompiledSortMethods() throws Exception {
		checkCompiledOutput("sortSet/sortMethods.poc");
	}

	@Test
	public void testInterpretedSortNames() throws Exception {
		checkInterpretedOutput("sortSet/sortNames.poc");
	}

	@Test
	public void testCompiledSortNames() throws Exception {
		checkCompiledOutput("sortSet/sortNames.poc");
	}

	@Test
	public void testInterpretedSortTexts() throws Exception {
		checkInterpretedOutput("sortSet/sortTexts.poc");
	}

	@Test
	public void testCompiledSortTexts() throws Exception {
		checkCompiledOutput("sortSet/sortTexts.poc");
	}

	@Test
	public void testInterpretedSortTimes() throws Exception {
		checkInterpretedOutput("sortSet/sortTimes.poc");
	}

	@Test
	public void testCompiledSortTimes() throws Exception {
		checkCompiledOutput("sortSet/sortTimes.poc");
	}

}

