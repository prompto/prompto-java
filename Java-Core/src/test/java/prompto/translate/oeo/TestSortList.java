package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSortList extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEOE("sortList/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEOE("sortList/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEOE("sortList/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEOE("sortList/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEOE("sortList/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEOE("sortList/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEOE("sortList/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEOE("sortList/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEOE("sortList/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEOE("sortList/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEOE("sortList/sortTimes.poc");
	}

}

