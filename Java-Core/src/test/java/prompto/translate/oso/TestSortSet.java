package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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
	public void testSortDescBooleans() throws Exception {
		compareResourceOSO("sortSet/sortDescBooleans.poc");
	}

	@Test
	public void testSortDescDates() throws Exception {
		compareResourceOSO("sortSet/sortDescDates.poc");
	}

	@Test
	public void testSortDescDateTimes() throws Exception {
		compareResourceOSO("sortSet/sortDescDateTimes.poc");
	}

	@Test
	public void testSortDescDecimals() throws Exception {
		compareResourceOSO("sortSet/sortDescDecimals.poc");
	}

	@Test
	public void testSortDescExpressions() throws Exception {
		compareResourceOSO("sortSet/sortDescExpressions.poc");
	}

	@Test
	public void testSortDescIntegers() throws Exception {
		compareResourceOSO("sortSet/sortDescIntegers.poc");
	}

	@Test
	public void testSortDescKeys() throws Exception {
		compareResourceOSO("sortSet/sortDescKeys.poc");
	}

	@Test
	public void testSortDescMethods() throws Exception {
		compareResourceOSO("sortSet/sortDescMethods.poc");
	}

	@Test
	public void testSortDescNames() throws Exception {
		compareResourceOSO("sortSet/sortDescNames.poc");
	}

	@Test
	public void testSortDescTexts() throws Exception {
		compareResourceOSO("sortSet/sortDescTexts.poc");
	}

	@Test
	public void testSortDescTimes() throws Exception {
		compareResourceOSO("sortSet/sortDescTimes.poc");
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

