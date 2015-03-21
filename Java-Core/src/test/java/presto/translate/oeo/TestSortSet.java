package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSortSet extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceOEO("sortSet/sortBooleans.o");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceOEO("sortSet/sortDates.o");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceOEO("sortSet/sortDateTimes.o");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceOEO("sortSet/sortDecimals.o");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceOEO("sortSet/sortExpressions.o");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceOEO("sortSet/sortIntegers.o");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceOEO("sortSet/sortKeys.o");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceOEO("sortSet/sortMethods.o");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceOEO("sortSet/sortNames.o");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceOEO("sortSet/sortTexts.o");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceOEO("sortSet/sortTimes.o");
	}

}

