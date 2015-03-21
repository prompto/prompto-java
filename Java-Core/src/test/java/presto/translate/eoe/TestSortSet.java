package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSortSet extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEOE("sortSet/sortBooleans.e");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEOE("sortSet/sortDates.e");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEOE("sortSet/sortDateTimes.e");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEOE("sortSet/sortDecimals.e");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEOE("sortSet/sortExpressions.e");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEOE("sortSet/sortIntegers.e");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEOE("sortSet/sortKeys.e");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEOE("sortSet/sortMethods.e");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEOE("sortSet/sortNames.e");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEOE("sortSet/sortTexts.e");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEOE("sortSet/sortTimes.e");
	}

}

