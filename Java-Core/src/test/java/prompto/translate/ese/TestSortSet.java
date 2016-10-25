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
	public void testSortDescBooleans() throws Exception {
		compareResourceESE("sortSet/sortDescBooleans.pec");
	}

	@Test
	public void testSortDescDates() throws Exception {
		compareResourceESE("sortSet/sortDescDates.pec");
	}

	@Test
	public void testSortDescDateTimes() throws Exception {
		compareResourceESE("sortSet/sortDescDateTimes.pec");
	}

	@Test
	public void testSortDescDecimals() throws Exception {
		compareResourceESE("sortSet/sortDescDecimals.pec");
	}

	@Test
	public void testSortDescExpressions() throws Exception {
		compareResourceESE("sortSet/sortDescExpressions.pec");
	}

	@Test
	public void testSortDescIntegers() throws Exception {
		compareResourceESE("sortSet/sortDescIntegers.pec");
	}

	@Test
	public void testSortDescKeys() throws Exception {
		compareResourceESE("sortSet/sortDescKeys.pec");
	}

	@Test
	public void testSortDescMethods() throws Exception {
		compareResourceESE("sortSet/sortDescMethods.pec");
	}

	@Test
	public void testSortDescNames() throws Exception {
		compareResourceESE("sortSet/sortDescNames.pec");
	}

	@Test
	public void testSortDescTexts() throws Exception {
		compareResourceESE("sortSet/sortDescTexts.pec");
	}

	@Test
	public void testSortDescTimes() throws Exception {
		compareResourceESE("sortSet/sortDescTimes.pec");
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

