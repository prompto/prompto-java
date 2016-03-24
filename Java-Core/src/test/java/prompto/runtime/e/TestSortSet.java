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
	public void testInterpretedSortDates() throws Exception {
		checkInterpretedOutput("sortSet/sortDates.pec");
	}

	@Test
	public void testInterpretedSortDateTimes() throws Exception {
		checkInterpretedOutput("sortSet/sortDateTimes.pec");
	}

	@Test
	public void testInterpretedSortDecimals() throws Exception {
		checkInterpretedOutput("sortSet/sortDecimals.pec");
	}

	@Test
	public void testInterpretedSortExpressions() throws Exception {
		checkInterpretedOutput("sortSet/sortExpressions.pec");
	}

	@Test
	public void testInterpretedSortIntegers() throws Exception {
		checkInterpretedOutput("sortSet/sortIntegers.pec");
	}

	@Test
	public void testInterpretedSortKeys() throws Exception {
		checkInterpretedOutput("sortSet/sortKeys.pec");
	}

	@Test
	public void testInterpretedSortMethods() throws Exception {
		checkInterpretedOutput("sortSet/sortMethods.pec");
	}

	@Test
	public void testInterpretedSortNames() throws Exception {
		checkInterpretedOutput("sortSet/sortNames.pec");
	}

	@Test
	public void testInterpretedSortTexts() throws Exception {
		checkInterpretedOutput("sortSet/sortTexts.pec");
	}

	@Test
	public void testInterpretedSortTimes() throws Exception {
		checkInterpretedOutput("sortSet/sortTimes.pec");
	}

}

