package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSortSet extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEOE("sortSet/sortBooleans.pec");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEOE("sortSet/sortDates.pec");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEOE("sortSet/sortDateTimes.pec");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEOE("sortSet/sortDecimals.pec");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEOE("sortSet/sortExpressions.pec");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEOE("sortSet/sortIntegers.pec");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEOE("sortSet/sortKeys.pec");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEOE("sortSet/sortMethods.pec");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEOE("sortSet/sortNames.pec");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEOE("sortSet/sortTexts.pec");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEOE("sortSet/sortTimes.pec");
	}

}

