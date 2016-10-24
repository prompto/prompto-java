package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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
	public void testSortDescBooleans() throws Exception {
		compareResourceOSO("sortList/sortDescBooleans.poc");
	}

	@Test
	public void testSortDescDates() throws Exception {
		compareResourceOSO("sortList/sortDescDates.poc");
	}

	@Test
	public void testSortDescDateTimes() throws Exception {
		compareResourceOSO("sortList/sortDescDateTimes.poc");
	}

	@Test
	public void testSortDescDecimals() throws Exception {
		compareResourceOSO("sortList/sortDescDecimals.poc");
	}

	@Test
	public void testSortDescExpressions() throws Exception {
		compareResourceOSO("sortList/sortDescExpressions.poc");
	}

	@Test
	public void testSortDescIntegers() throws Exception {
		compareResourceOSO("sortList/sortDescIntegers.poc");
	}

	@Test
	public void testSortDescKeys() throws Exception {
		compareResourceOSO("sortList/sortDescKeys.poc");
	}

	@Test
	public void testSortDescMethods() throws Exception {
		compareResourceOSO("sortList/sortDescMethods.poc");
	}

	@Test
	public void testSortDescNames() throws Exception {
		compareResourceOSO("sortList/sortDescNames.poc");
	}

	@Test
	public void testSortDescTexts() throws Exception {
		compareResourceOSO("sortList/sortDescTexts.poc");
	}

	@Test
	public void testSortDescTimes() throws Exception {
		compareResourceOSO("sortList/sortDescTimes.poc");
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

