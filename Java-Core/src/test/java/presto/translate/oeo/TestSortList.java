package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortList extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOEO("sortList/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOEO("sortList/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOEO("sortList/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOEO("sortList/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOEO("sortList/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOEO("sortList/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOEO("sortList/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOEO("sortList/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOEO("sortList/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOEO("sortList/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOEO("sortList/sortTimes.poc");
	}

}

