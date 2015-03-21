package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSortList extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEPE("sortList/sortBooleans.e");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEPE("sortList/sortDates.e");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEPE("sortList/sortDateTimes.e");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEPE("sortList/sortDecimals.e");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEPE("sortList/sortExpressions.e");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEPE("sortList/sortIntegers.e");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEPE("sortList/sortKeys.e");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEPE("sortList/sortMethods.e");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEPE("sortList/sortNames.e");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEPE("sortList/sortTexts.e");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEPE("sortList/sortTimes.e");
	}

}

