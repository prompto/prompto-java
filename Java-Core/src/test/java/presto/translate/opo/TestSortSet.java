package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortSet extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOPO("sortSet/sortBooleans.o");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOPO("sortSet/sortDates.o");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOPO("sortSet/sortDateTimes.o");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOPO("sortSet/sortDecimals.o");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOPO("sortSet/sortExpressions.o");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOPO("sortSet/sortIntegers.o");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOPO("sortSet/sortKeys.o");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOPO("sortSet/sortMethods.o");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOPO("sortSet/sortNames.o");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOPO("sortSet/sortTexts.o");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOPO("sortSet/sortTimes.o");
	}

}

