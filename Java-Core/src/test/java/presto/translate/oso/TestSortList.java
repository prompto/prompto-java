package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortList extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOSO("sortList/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOSO("sortList/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOSO("sortList/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOSO("sortList/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOSO("sortList/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOSO("sortList/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOSO("sortList/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOSO("sortList/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOSO("sortList/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOSO("sortList/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOSO("sortList/sortTimes.poc");
	}

}

