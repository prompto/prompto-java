package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSortList extends BaseOParserTest {

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
		checkInterpretedOutput("sortList/sortBooleans.poc");
	}

	@Test
	public void testCompiledSortBooleans() throws Exception {
		checkCompiledOutput("sortList/sortBooleans.poc");
	}

	@Test
	public void testInterpretedSortDates() throws Exception {
		checkInterpretedOutput("sortList/sortDates.poc");
	}

	@Test
	public void testCompiledSortDates() throws Exception {
		checkCompiledOutput("sortList/sortDates.poc");
	}

	@Test
	public void testInterpretedSortDateTimes() throws Exception {
		checkInterpretedOutput("sortList/sortDateTimes.poc");
	}

	@Test
	public void testCompiledSortDateTimes() throws Exception {
		checkCompiledOutput("sortList/sortDateTimes.poc");
	}

	@Test
	public void testInterpretedSortDecimals() throws Exception {
		checkInterpretedOutput("sortList/sortDecimals.poc");
	}

	@Test
	public void testCompiledSortDecimals() throws Exception {
		checkCompiledOutput("sortList/sortDecimals.poc");
	}

	@Test
	public void testInterpretedSortExpressions() throws Exception {
		checkInterpretedOutput("sortList/sortExpressions.poc");
	}

	@Test
	public void testCompiledSortExpressions() throws Exception {
		checkCompiledOutput("sortList/sortExpressions.poc");
	}

	@Test
	public void testInterpretedSortIntegers() throws Exception {
		checkInterpretedOutput("sortList/sortIntegers.poc");
	}

	@Test
	public void testCompiledSortIntegers() throws Exception {
		checkCompiledOutput("sortList/sortIntegers.poc");
	}

	@Test
	public void testInterpretedSortKeys() throws Exception {
		checkInterpretedOutput("sortList/sortKeys.poc");
	}

	@Test
	public void testCompiledSortKeys() throws Exception {
		checkCompiledOutput("sortList/sortKeys.poc");
	}

	@Test
	public void testInterpretedSortMethods() throws Exception {
		checkInterpretedOutput("sortList/sortMethods.poc");
	}

	@Test
	public void testCompiledSortMethods() throws Exception {
		checkCompiledOutput("sortList/sortMethods.poc");
	}

	@Test
	public void testInterpretedSortNames() throws Exception {
		checkInterpretedOutput("sortList/sortNames.poc");
	}

	@Test
	public void testCompiledSortNames() throws Exception {
		checkCompiledOutput("sortList/sortNames.poc");
	}

	@Test
	public void testInterpretedSortTexts() throws Exception {
		checkInterpretedOutput("sortList/sortTexts.poc");
	}

	@Test
	public void testCompiledSortTexts() throws Exception {
		checkCompiledOutput("sortList/sortTexts.poc");
	}

	@Test
	public void testInterpretedSortTimes() throws Exception {
		checkInterpretedOutput("sortList/sortTimes.poc");
	}

	@Test
	public void testCompiledSortTimes() throws Exception {
		checkCompiledOutput("sortList/sortTimes.poc");
	}

}

