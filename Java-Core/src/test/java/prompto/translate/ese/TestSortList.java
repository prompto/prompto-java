package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSortList extends BaseEParserTest {

	@Test
	public void testSortBooleans() throws Exception {
		compareResourceESE("sortList/sortBooleans.pec");
	}

	@Test
	public void testSortDates() throws Exception {
		compareResourceESE("sortList/sortDates.pec");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		compareResourceESE("sortList/sortDateTimes.pec");
	}

	@Test
	public void testSortDecimals() throws Exception {
		compareResourceESE("sortList/sortDecimals.pec");
	}

	@Test
	public void testSortDescBooleans() throws Exception {
		compareResourceESE("sortList/sortDescBooleans.pec");
	}

	@Test
	public void testSortDescDates() throws Exception {
		compareResourceESE("sortList/sortDescDates.pec");
	}

	@Test
	public void testSortDescDateTimes() throws Exception {
		compareResourceESE("sortList/sortDescDateTimes.pec");
	}

	@Test
	public void testSortDescDecimals() throws Exception {
		compareResourceESE("sortList/sortDescDecimals.pec");
	}

	@Test
	public void testSortDescExpressions() throws Exception {
		compareResourceESE("sortList/sortDescExpressions.pec");
	}

	@Test
	public void testSortDescIntegers() throws Exception {
		compareResourceESE("sortList/sortDescIntegers.pec");
	}

	@Test
	public void testSortDescKeys() throws Exception {
		compareResourceESE("sortList/sortDescKeys.pec");
	}

	@Test
	public void testSortDescMethods() throws Exception {
		compareResourceESE("sortList/sortDescMethods.pec");
	}

	@Test
	public void testSortDescNames() throws Exception {
		compareResourceESE("sortList/sortDescNames.pec");
	}

	@Test
	public void testSortDescTexts() throws Exception {
		compareResourceESE("sortList/sortDescTexts.pec");
	}

	@Test
	public void testSortDescTimes() throws Exception {
		compareResourceESE("sortList/sortDescTimes.pec");
	}

	@Test
	public void testSortExpressions() throws Exception {
		compareResourceESE("sortList/sortExpressions.pec");
	}

	@Test
	public void testSortIntegers() throws Exception {
		compareResourceESE("sortList/sortIntegers.pec");
	}

	@Test
	public void testSortKeys() throws Exception {
		compareResourceESE("sortList/sortKeys.pec");
	}

	@Test
	public void testSortMethods() throws Exception {
		compareResourceESE("sortList/sortMethods.pec");
	}

	@Test
	public void testSortNames() throws Exception {
		compareResourceESE("sortList/sortNames.pec");
	}

	@Test
	public void testSortTexts() throws Exception {
		compareResourceESE("sortList/sortTexts.pec");
	}

	@Test
	public void testSortTimes() throws Exception {
		compareResourceESE("sortList/sortTimes.pec");
	}

}

