package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestSortSet extends BaseOParserTest {

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
		checkOutput("sortSet/sortBooleans.o");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortSet/sortDates.o");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortSet/sortDateTimes.o");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortSet/sortDecimals.o");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortSet/sortExpressions.o");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortSet/sortIntegers.o");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortSet/sortKeys.o");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortSet/sortMethods.o");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortSet/sortNames.o");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortSet/sortTexts.o");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortSet/sortTimes.o");
	}

}

