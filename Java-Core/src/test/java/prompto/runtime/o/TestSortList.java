// generated: 2015-07-05T23:01:01.127
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("sortList/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortList/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortList/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortList/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortList/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortList/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortList/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortList/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortList/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortList/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortList/sortTimes.poc");
	}

}

