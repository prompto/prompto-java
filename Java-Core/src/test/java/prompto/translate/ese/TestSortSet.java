package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSortSet extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceESE("sortSet/sortBooleans.pec");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceESE("sortSet/sortDates.pec");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceESE("sortSet/sortDateTimes.pec");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceESE("sortSet/sortDecimals.pec");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceESE("sortSet/sortExpressions.pec");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceESE("sortSet/sortIntegers.pec");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceESE("sortSet/sortKeys.pec");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceESE("sortSet/sortMethods.pec");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceESE("sortSet/sortNames.pec");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceESE("sortSet/sortTexts.pec");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceESE("sortSet/sortTimes.pec");
	}

}

