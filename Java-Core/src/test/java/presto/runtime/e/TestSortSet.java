package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestSortSet extends BaseEParserTest {

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
		checkOutput("sortSet/sortBooleans.e");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortSet/sortDates.e");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortSet/sortDateTimes.e");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortSet/sortDecimals.e");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortSet/sortExpressions.e");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortSet/sortIntegers.e");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortSet/sortKeys.e");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortSet/sortMethods.e");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortSet/sortNames.e");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortSet/sortTexts.e");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortSet/sortTimes.e");
	}

}

