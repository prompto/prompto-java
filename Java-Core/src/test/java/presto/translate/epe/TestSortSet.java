package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSortSet extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceEPE("sortSet/sortBooleans.e");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceEPE("sortSet/sortDates.e");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceEPE("sortSet/sortDateTimes.e");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceEPE("sortSet/sortDecimals.e");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceEPE("sortSet/sortExpressions.e");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceEPE("sortSet/sortIntegers.e");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceEPE("sortSet/sortKeys.e");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceEPE("sortSet/sortMethods.e");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceEPE("sortSet/sortNames.e");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceEPE("sortSet/sortTexts.e");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceEPE("sortSet/sortTimes.e");
	}

}

