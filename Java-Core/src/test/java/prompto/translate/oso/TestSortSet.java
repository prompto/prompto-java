package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSortSet extends BaseOParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEOE("sortSet/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEOE("sortSet/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEOE("sortSet/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEOE("sortSet/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEOE("sortSet/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEOE("sortSet/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEOE("sortSet/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEOE("sortSet/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEOE("sortSet/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEOE("sortSet/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEOE("sortSet/sortTimes.poc");
	}

}

