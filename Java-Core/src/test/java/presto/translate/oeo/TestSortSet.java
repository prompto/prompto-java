package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortSet extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOEO("sortSet/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOEO("sortSet/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOEO("sortSet/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOEO("sortSet/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOEO("sortSet/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOEO("sortSet/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOEO("sortSet/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOEO("sortSet/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOEO("sortSet/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOEO("sortSet/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOEO("sortSet/sortTimes.poc");
	}

}

