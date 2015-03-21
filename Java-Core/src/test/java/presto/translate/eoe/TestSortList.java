package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSortList extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEOE("sortList/sortBooleans.e");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEOE("sortList/sortDates.e");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEOE("sortList/sortDateTimes.e");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEOE("sortList/sortDecimals.e");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEOE("sortList/sortExpressions.e");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEOE("sortList/sortIntegers.e");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEOE("sortList/sortKeys.e");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEOE("sortList/sortMethods.e");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEOE("sortList/sortNames.e");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEOE("sortList/sortTexts.e");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEOE("sortList/sortTimes.e");
	}

}

