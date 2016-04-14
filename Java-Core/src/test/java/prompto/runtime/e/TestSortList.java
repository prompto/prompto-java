package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSortList extends BaseEParserTest {

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
		checkInterpretedOutput("sortList/sortBooleans.pec");
	}

	@Test
	public void testCompiledSortBooleans() throws Exception {
		checkCompiledOutput("sortList/sortBooleans.pec");
	}

	@Test
	public void testInterpretedSortDates() throws Exception {
		checkInterpretedOutput("sortList/sortDates.pec");
	}

	@Test
	public void testCompiledSortDates() throws Exception {
		checkCompiledOutput("sortList/sortDates.pec");
	}

	@Test
	public void testInterpretedSortDateTimes() throws Exception {
		checkInterpretedOutput("sortList/sortDateTimes.pec");
	}

	@Test
	public void testCompiledSortDateTimes() throws Exception {
		checkCompiledOutput("sortList/sortDateTimes.pec");
	}

	@Test
	public void testInterpretedSortDecimals() throws Exception {
		checkInterpretedOutput("sortList/sortDecimals.pec");
	}

	@Test
	public void testCompiledSortDecimals() throws Exception {
		checkCompiledOutput("sortList/sortDecimals.pec");
	}

	@Test
	public void testInterpretedSortExpressions() throws Exception {
		checkInterpretedOutput("sortList/sortExpressions.pec");
	}

	@Test
	public void testCompiledSortExpressions() throws Exception {
		checkCompiledOutput("sortList/sortExpressions.pec");
	}

	@Test
	public void testInterpretedSortIntegers() throws Exception {
		checkInterpretedOutput("sortList/sortIntegers.pec");
	}

	@Test
	public void testCompiledSortIntegers() throws Exception {
		checkCompiledOutput("sortList/sortIntegers.pec");
	}

	@Test
	public void testInterpretedSortKeys() throws Exception {
		checkInterpretedOutput("sortList/sortKeys.pec");
	}

	@Test
	public void testCompiledSortKeys() throws Exception {
		checkCompiledOutput("sortList/sortKeys.pec");
	}

	@Test
	public void testInterpretedSortMethods() throws Exception {
		checkInterpretedOutput("sortList/sortMethods.pec");
	}

	@Test
	public void testCompiledSortMethods() throws Exception {
		checkCompiledOutput("sortList/sortMethods.pec");
	}

	@Test
	public void testInterpretedSortNames() throws Exception {
		checkInterpretedOutput("sortList/sortNames.pec");
	}

	@Test
	public void testCompiledSortNames() throws Exception {
		checkCompiledOutput("sortList/sortNames.pec");
	}

	@Test
	public void testInterpretedSortTexts() throws Exception {
		checkInterpretedOutput("sortList/sortTexts.pec");
	}

	@Test
	public void testCompiledSortTexts() throws Exception {
		checkCompiledOutput("sortList/sortTexts.pec");
	}

	@Test
	public void testInterpretedSortTimes() throws Exception {
		checkInterpretedOutput("sortList/sortTimes.pec");
	}

	@Test
	public void testCompiledSortTimes() throws Exception {
		checkCompiledOutput("sortList/sortTimes.pec");
	}

}

