package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSortSet extends BaseEParserTest {

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
		checkInterpretedOutput("sortSet/sortBooleans.pec");
	}

	@Test
	public void testCompiledSortBooleans() throws Exception {
		checkCompiledOutput("sortSet/sortBooleans.pec");
	}

	@Test
	public void testInterpretedSortDates() throws Exception {
		checkInterpretedOutput("sortSet/sortDates.pec");
	}

	@Test
	public void testCompiledSortDates() throws Exception {
		checkCompiledOutput("sortSet/sortDates.pec");
	}

	@Test
	public void testInterpretedSortDateTimes() throws Exception {
		checkInterpretedOutput("sortSet/sortDateTimes.pec");
	}

	@Test
	public void testCompiledSortDateTimes() throws Exception {
		checkCompiledOutput("sortSet/sortDateTimes.pec");
	}

	@Test
	public void testInterpretedSortDecimals() throws Exception {
		checkInterpretedOutput("sortSet/sortDecimals.pec");
	}

	@Test
	public void testCompiledSortDecimals() throws Exception {
		checkCompiledOutput("sortSet/sortDecimals.pec");
	}

	@Test
	public void testInterpretedSortExpressions() throws Exception {
		checkInterpretedOutput("sortSet/sortExpressions.pec");
	}

	@Test
	public void testCompiledSortExpressions() throws Exception {
		checkCompiledOutput("sortSet/sortExpressions.pec");
	}

	@Test
	public void testInterpretedSortIntegers() throws Exception {
		checkInterpretedOutput("sortSet/sortIntegers.pec");
	}

	@Test
	public void testCompiledSortIntegers() throws Exception {
		checkCompiledOutput("sortSet/sortIntegers.pec");
	}

	@Test
	public void testInterpretedSortKeys() throws Exception {
		checkInterpretedOutput("sortSet/sortKeys.pec");
	}

	@Test
	public void testCompiledSortKeys() throws Exception {
		checkCompiledOutput("sortSet/sortKeys.pec");
	}

	@Test
	public void testInterpretedSortMethods() throws Exception {
		checkInterpretedOutput("sortSet/sortMethods.pec");
	}

	@Test
	public void testCompiledSortMethods() throws Exception {
		checkCompiledOutput("sortSet/sortMethods.pec");
	}

	@Test
	public void testInterpretedSortNames() throws Exception {
		checkInterpretedOutput("sortSet/sortNames.pec");
	}

	@Test
	public void testCompiledSortNames() throws Exception {
		checkCompiledOutput("sortSet/sortNames.pec");
	}

	@Test
	public void testInterpretedSortTexts() throws Exception {
		checkInterpretedOutput("sortSet/sortTexts.pec");
	}

	@Test
	public void testCompiledSortTexts() throws Exception {
		checkCompiledOutput("sortSet/sortTexts.pec");
	}

	@Test
	public void testInterpretedSortTimes() throws Exception {
		checkInterpretedOutput("sortSet/sortTimes.pec");
	}

	@Test
	public void testCompiledSortTimes() throws Exception {
		checkCompiledOutput("sortSet/sortTimes.pec");
	}

}

