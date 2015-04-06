package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSortList extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEOE("sortList/sortBooleans.pec");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEOE("sortList/sortDates.pec");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEOE("sortList/sortDateTimes.pec");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEOE("sortList/sortDecimals.pec");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEOE("sortList/sortExpressions.pec");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEOE("sortList/sortIntegers.pec");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEOE("sortList/sortKeys.pec");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEOE("sortList/sortMethods.pec");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEOE("sortList/sortNames.pec");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEOE("sortList/sortTexts.pec");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEOE("sortList/sortTimes.pec");
	}

}

