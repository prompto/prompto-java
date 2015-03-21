package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestSortList extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testSortBooleans() throws Exception {
		checkOutput("sortList/sortBooleans.e");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortList/sortDates.e");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortList/sortDateTimes.e");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortList/sortDecimals.e");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortList/sortExpressions.e");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortList/sortIntegers.e");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortList/sortKeys.e");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortList/sortMethods.e");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortList/sortNames.e");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortList/sortTexts.e");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortList/sortTimes.e");
	}

}

