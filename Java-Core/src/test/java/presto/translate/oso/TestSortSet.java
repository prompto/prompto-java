package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortSet extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOSO("sortSet/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOSO("sortSet/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOSO("sortSet/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOSO("sortSet/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOSO("sortSet/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOSO("sortSet/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOSO("sortSet/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOSO("sortSet/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOSO("sortSet/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOSO("sortSet/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOSO("sortSet/sortTimes.poc");
	}

}

