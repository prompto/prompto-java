package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortList extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOEO("sortList/sortBooleans.o");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOEO("sortList/sortDates.o");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOEO("sortList/sortDateTimes.o");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOEO("sortList/sortDecimals.o");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOEO("sortList/sortExpressions.o");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOEO("sortList/sortIntegers.o");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOEO("sortList/sortKeys.o");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOEO("sortList/sortMethods.o");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOEO("sortList/sortNames.o");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOEO("sortList/sortTexts.o");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOEO("sortList/sortTimes.o");
	}

}

