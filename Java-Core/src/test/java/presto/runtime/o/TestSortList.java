package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestSortList extends BaseOParserTest {

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
		checkOutput("sortList/sortBooleans.o");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortList/sortDates.o");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortList/sortDateTimes.o");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortList/sortDecimals.o");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortList/sortExpressions.o");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortList/sortIntegers.o");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortList/sortKeys.o");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortList/sortMethods.o");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortList/sortNames.o");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortList/sortTexts.o");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortList/sortTimes.o");
	}

}

