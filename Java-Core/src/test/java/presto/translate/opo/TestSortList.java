package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortList extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOPO("sortList/sortBooleans.o");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOPO("sortList/sortDates.o");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOPO("sortList/sortDateTimes.o");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOPO("sortList/sortDecimals.o");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOPO("sortList/sortExpressions.o");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOPO("sortList/sortIntegers.o");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOPO("sortList/sortKeys.o");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOPO("sortList/sortMethods.o");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOPO("sortList/sortNames.o");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOPO("sortList/sortTexts.o");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOPO("sortList/sortTimes.o");
	}

}

